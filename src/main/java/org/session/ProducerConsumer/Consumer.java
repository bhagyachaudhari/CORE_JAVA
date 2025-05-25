package org.session.ProducerConsumer;

import ProducerConsumer.Store;

public class Consumer implements Runnable{
    private ProducerConsumer.Store store;

    Consumer(Store st){
       this.store = st;
    }
    @Override
    public void run() {
        while(true){
            synchronized (store) {
                if (store.getItems().size() > 0) {
                    store.removeItem();
                }
            }
        }
    }
}
