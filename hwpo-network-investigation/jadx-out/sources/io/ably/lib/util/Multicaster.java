package io.ably.lib.util;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Multicaster<T> {
    private final List<T> members = new ArrayList();

    public Multicaster(T... tArr) {
        for (T t : tArr) {
            this.members.add(t);
        }
    }

    public synchronized void add(T t) {
        this.members.add(t);
    }

    public synchronized void clear() {
        this.members.clear();
    }

    public synchronized List<T> getMembers() {
        return new ArrayList(this.members);
    }

    public synchronized boolean isEmpty() {
        return this.members.isEmpty();
    }

    public synchronized void remove(T t) {
        this.members.remove(t);
    }

    public synchronized int size() {
        return this.members.size();
    }
}
