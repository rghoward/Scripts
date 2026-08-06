package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import defpackage.n50;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e<T> {
    public static final b h = new b();
    public final androidx.recyclerview.widget.b a;
    public final c<T> b;
    public final b c;
    public final CopyOnWriteArrayList d;
    public List<T> e;
    public List<T> f;
    public int g;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a<T> {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b implements Executor {
        public final Handler t = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.t.post(runnable);
        }
    }

    public e(n50 n50Var, m.e eVar) {
        androidx.recyclerview.widget.b bVar = new androidx.recyclerview.widget.b(n50Var);
        synchronized (c.a.a) {
            try {
                if (c.a.b == null) {
                    c.a.b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this(bVar, new c(c.a.b, eVar));
    }

    public final void a(List list) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a();
        }
    }

    public final void b(List<T> list) {
        int i = this.g + 1;
        this.g = i;
        List<T> list2 = this.e;
        if (list == list2) {
            return;
        }
        List<T> list3 = this.f;
        androidx.recyclerview.widget.b bVar = this.a;
        if (list == null) {
            int size = list2.size();
            this.e = null;
            this.f = Collections.EMPTY_LIST;
            bVar.c(0, size);
            a(list3);
            return;
        }
        if (list2 != null) {
            this.b.a.execute(new d(this, list2, list, i));
            return;
        }
        this.e = list;
        this.f = Collections.unmodifiableList(list);
        bVar.b(0, list.size());
        a(list3);
    }

    public e(androidx.recyclerview.widget.b bVar, c cVar) {
        this.d = new CopyOnWriteArrayList();
        this.f = Collections.EMPTY_LIST;
        this.a = bVar;
        this.b = cVar;
        this.c = h;
    }
}
