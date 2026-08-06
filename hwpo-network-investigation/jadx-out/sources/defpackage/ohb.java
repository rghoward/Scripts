package defpackage;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ohb {
    public final kr5 a;
    public final LinkedHashMap b;
    public final LinkedHashSet c;
    public volatile boolean d;

    public ohb(t72 t72Var, AutoCloseable... autoCloseableArr) {
        this.a = new kr5();
        this.b = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.c = linkedHashSet;
        b("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", new eg1(t72Var.getCoroutineContext()));
        List listAsList = Arrays.asList(autoCloseableArr);
        listAsList.getClass();
        linkedHashSet.addAll(listAsList);
    }

    public static void c(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                nhb.a(autoCloseable);
            } catch (Exception e) {
                d55.a(e);
            }
        }
    }

    public final void a(AutoCloseable autoCloseable) {
        autoCloseable.getClass();
        if (this.d) {
            c(autoCloseable);
            return;
        }
        synchronized (this.a) {
            this.c.add(autoCloseable);
            g2b g2bVar = g2b.a;
        }
    }

    public final void b(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        if (this.d) {
            c(autoCloseable);
            return;
        }
        synchronized (this.a) {
            autoCloseable2 = (AutoCloseable) this.b.put(str, autoCloseable);
        }
        c(autoCloseable2);
    }

    public ohb(t72 t72Var) {
        this.a = new kr5();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashSet();
        b("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", new eg1(t72Var.getCoroutineContext()));
    }

    public ohb(AutoCloseable... autoCloseableArr) {
        this.a = new kr5();
        this.b = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.c = linkedHashSet;
        List listAsList = Arrays.asList(autoCloseableArr);
        listAsList.getClass();
        linkedHashSet.addAll(listAsList);
    }

    public ohb() {
        this.a = new kr5();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashSet();
    }
}
