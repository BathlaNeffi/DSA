package hashMAP;

import java.util.ArrayList;

public class Map<K,V> {
	ArrayList<MapNode<K,V>> buckets;
	int count;
	int numBuckets;

	public Map() {
		buckets=new ArrayList<>();
		numBuckets=5;
		for(int i=0; i<numBuckets;i++) {
			buckets.add(null);
		}
	}



	public void insert(K key, V vlaue) {

		int bucketIndex=getBucketIndex(key);

		MapNode<K,V> head=buckets.get(bucketIndex);

		//element if present if there update the value
		while(head!=null) {

			if(head.key.equals(key))
			{
				head.value=vlaue;
				return;
			}
			head=head.next;

		}

		/// if element not found create new node in the liknked list
		head=buckets.get(bucketIndex);

		MapNode<K, V> newNode=new MapNode<>(key, vlaue);
		newNode.next=head;
		buckets.set(bucketIndex, newNode);
		count++;
		
		double loadFactor= (1.0*count)/numBuckets;
		if(loadFactor>=0.7) {
			reHash();
		}

	}
	
	
	private void reHash() {
		ArrayList<MapNode<K, V>> temp=buckets;
		buckets=new ArrayList<>();
		for(int i=0; i<2*numBuckets;i++) {
			buckets.add(null);
		}
			count=0;
			numBuckets*=2;
		for(int i=0; i<temp.size();i++){
			MapNode<K, V> head=temp.get(i);
			while(head!=null) {
				K key=head.key;
				V value=head.value;
				insert(key, value);
				head=head.next;
			}
 			
		}

		
	}

	public int size() {
		return count;
	}

	public V getValue(K key) {
		int bucketIndex=getBucketIndex(key);

		MapNode<K,V> head=buckets.get(bucketIndex);

		//element if present if there update the value
		while(head!=null) {

			if(head.key.equals(key))
			{
				V value=head.value;
				 return value;
				
			}
			head=head.next;

		}
		
		return null;
	}

	
	public V removeKey(K key) {
		int bucketIndex=getBucketIndex(key);

		MapNode<K,V> head=buckets.get(bucketIndex);

		//element if present if there update the value
		MapNode<K, V> prev=null;
		while(head!=null) {
			

			if(head.key.equals(key))
			{
				V value=head.value;
				
				if(prev!=null) {
				prev.next=head.next;}
				else {
					buckets.set(bucketIndex, head.next);
				}
				count--;
				
				return value;
			}
			prev=head;
			
			head=head.next;

		}
		
		return null;
		
	}


	private int getBucketIndex(K key) {
		// TODO Auto-generated method stub
		int bucketIndex=key.hashCode();
		bucketIndex=bucketIndex%numBuckets;
		return bucketIndex;
	}



	public double loadFactor() {
	
		return (1.0*count)/numBuckets;
	}



}
