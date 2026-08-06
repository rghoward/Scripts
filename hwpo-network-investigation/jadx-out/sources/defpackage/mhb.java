package defpackage;

import java.io.Closeable;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mhb {
    private final ohb impl;

    public mhb(t72 t72Var, AutoCloseable... autoCloseableArr) {
        t72Var.getClass();
        autoCloseableArr.getClass();
        this.impl = new ohb(t72Var, (AutoCloseable[]) Arrays.copyOf(autoCloseableArr, autoCloseableArr.length));
    }

    public final void addCloseable(String str, AutoCloseable autoCloseable) {
        str.getClass();
        autoCloseable.getClass();
        ohb ohbVar = this.impl;
        if (ohbVar != null) {
            ohbVar.b(str, autoCloseable);
        }
    }

    public final void clear$lifecycle_viewmodel() {
        ohb ohbVar = this.impl;
        if (ohbVar != null && !ohbVar.d) {
            ohbVar.d = true;
            synchronized (ohbVar.a) {
                try {
                    Iterator it = ohbVar.b.values().iterator();
                    while (it.hasNext()) {
                        ohb.c((AutoCloseable) it.next());
                    }
                    Iterator it2 = ohbVar.c.iterator();
                    while (it2.hasNext()) {
                        ohb.c((AutoCloseable) it2.next());
                    }
                    ohbVar.c.clear();
                    g2b g2bVar = g2b.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        onCleared();
    }

    public final <T extends AutoCloseable> T getCloseable(String str) {
        T t;
        str.getClass();
        ohb ohbVar = this.impl;
        if (ohbVar == null) {
            return null;
        }
        synchronized (ohbVar.a) {
            t = (T) ohbVar.b.get(str);
        }
        return t;
    }

    public void addCloseable(AutoCloseable autoCloseable) {
        autoCloseable.getClass();
        ohb ohbVar = this.impl;
        if (ohbVar != null) {
            ohbVar.a(autoCloseable);
        }
    }

    @gy2
    public /* synthetic */ void addCloseable(Closeable closeable) {
        closeable.getClass();
        ohb ohbVar = this.impl;
        if (ohbVar != null) {
            ohbVar.a(closeable);
        }
    }

    public void onCleared() {
    }

    public mhb(t72 t72Var) {
        t72Var.getClass();
        this.impl = new ohb(t72Var);
    }

    public mhb(AutoCloseable... autoCloseableArr) {
        autoCloseableArr.getClass();
        this.impl = new ohb((AutoCloseable[]) Arrays.copyOf(autoCloseableArr, autoCloseableArr.length));
    }

    public mhb() {
        this.impl = new ohb();
    }

    @gy2
    public /* synthetic */ mhb(Closeable... closeableArr) {
        closeableArr.getClass();
        this.impl = new ohb((AutoCloseable[]) Arrays.copyOf(closeableArr, closeableArr.length));
    }
}
