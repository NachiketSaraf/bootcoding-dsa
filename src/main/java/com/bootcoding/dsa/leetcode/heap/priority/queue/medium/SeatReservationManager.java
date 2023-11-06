package com.bootcoding.dsa.leetcode.heap.priority.queue.medium;

import java.util.PriorityQueue;

public class SeatReservationManager {
    /**
     * Your SeatManager object will be instantiated and called as such:
     * SeatManager obj = new SeatManager(n);
     * int param_1 = obj.reserve();
     * obj.unreserve(seatNumber);
     */
    public static void main(String[] args) {
        SeatManager seatManager = new SeatManager(5);
        int param_1 = seatManager.reserve();
        seatManager.unreserve(seatNumber);
    }
}
class SeatManager {
    PriorityQueue<Integer> pq = new PriorityQueue<>() ;
    int seat;
    public SeatManager(int n) {
        // pq = new PriorityQueue<>();
        seat = 1;
    }

    public int reserve() {
        if(!pq.isEmpty()){
            return pq.poll();
        }
        int res = seat++;
        return res;
    }

    public void unreserve(int seatNumber) {
        pq.add(seatNumber);
    }
}