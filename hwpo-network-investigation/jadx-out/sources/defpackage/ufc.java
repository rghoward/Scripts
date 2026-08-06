package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ufc {
    public static final Object f = new Object();
    public final String a;
    public final jac b;
    public final Object c;
    public final Object d = new Object();
    public volatile Object e = null;

    public /* synthetic */ ufc(String str, Object obj, jac jacVar) {
        this.a = str;
        this.c = obj;
        this.b = jacVar;
    }

    public final Object a(Object obj) {
        synchronized (this.d) {
        }
        if (obj != null) {
            return obj;
        }
        if (cy.a == null) {
            return this.c;
        }
        synchronized (f) {
            try {
                if (pd7.b()) {
                    return this.e == null ? this.c : this.e;
                }
                try {
                    for (ufc ufcVar : wfc.a) {
                        if (pd7.b()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objA = null;
                        try {
                            jac jacVar = ufcVar.b;
                            if (jacVar != null) {
                                objA = jacVar.a();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f) {
                            ufcVar.e = objA;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                jac jacVar2 = this.b;
                if (jacVar2 != null) {
                    try {
                        return jacVar2.a();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
