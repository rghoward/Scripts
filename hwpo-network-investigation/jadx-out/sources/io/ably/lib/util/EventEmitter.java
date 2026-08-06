package io.ably.lib.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EventEmitter<Event, Listener> {
    Map<Listener, EventEmitter<Event, Listener>.Filter> filters = new HashMap();
    List<Listener> listeners = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class Filter {
        private Event event;
        private Listener listener;
        private boolean once;

        public Filter(Event event, Listener listener, boolean z) {
            this.event = event;
            this.listener = listener;
            this.once = z;
        }

        public boolean apply(Event event, Object... objArr) {
            Event event2 = this.event;
            if (event2 != event && event2 != null) {
                return false;
            }
            EventEmitter.this.apply(this.listener, event, objArr);
            return this.once;
        }
    }

    public abstract void apply(Listener listener, Event event, Object... objArr);

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void emit(Event event, Object... objArr) {
        try {
            ArrayList arrayList = new ArrayList(this.listeners);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                apply(obj, event, objArr);
            }
            for (Map.Entry entry : new HashMap(this.filters).entrySet()) {
                if (((Filter) entry.getValue()).apply(event, objArr)) {
                    this.filters.remove(entry.getKey());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void off(Event event, Listener listener) {
        EventEmitter<Event, Listener>.Filter filter = this.filters.get(listener);
        if (filter != null && ((Filter) filter).event == event) {
            this.filters.remove(listener);
        }
    }

    public synchronized void on(Listener listener) {
        if (!this.listeners.contains(listener)) {
            this.listeners.add(listener);
        }
    }

    public synchronized void once(Listener listener) {
        this.filters.put(listener, new Filter(null, listener, true));
    }

    public synchronized void once(Event event, Listener listener) {
        this.filters.put(listener, new Filter(event, listener, true));
    }

    public synchronized void on(Event event, Listener listener) {
        this.filters.put(listener, new Filter(event, listener, false));
    }

    public synchronized void off(Listener listener) {
        this.listeners.remove(listener);
        this.filters.remove(listener);
    }

    public synchronized void off() {
        this.listeners.clear();
        this.filters.clear();
    }
}
