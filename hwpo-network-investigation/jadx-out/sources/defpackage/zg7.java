package defpackage;

import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zg7 {
    public final Runnable a;
    public final o7a b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements g76 {
        public final /* synthetic */ vg7.a t;
        public final /* synthetic */ s66 u;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[s66.a.values().length];
                try {
                    iArr[s66.a.ON_START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[s66.a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[s66.a.ON_DESTROY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        public b(vg7.a aVar, zg7 zg7Var, s66 s66Var) {
            this.t = aVar;
            this.u = s66Var;
        }

        @Override // defpackage.g76
        public final void t(m76 m76Var, s66.a aVar) {
            int i = a.a[aVar.ordinal()];
            vg7.a aVar2 = this.t;
            if (i == 1) {
                aVar2.g(true);
                return;
            }
            if (i == 2) {
                aVar2.g(false);
            } else {
                if (i != 3) {
                    return;
                }
                aVar2.e();
                this.u.c(this);
            }
        }
    }

    public zg7(Runnable runnable) {
        this.a = runnable;
        this.b = new o7a(new ye1(1, this));
    }

    public final void a(m76 m76Var, vg7 vg7Var) {
        vg7Var.getClass();
        final s66 lifecycle = m76Var.getLifecycle();
        if (lifecycle.b() == s66.b.t) {
            return;
        }
        vg7.a aVarCreateNavigationEventHandler$activity = vg7Var.createNavigationEventHandler$activity(new wg7(m76Var, vg7Var));
        aVarCreateNavigationEventHandler$activity.g(false);
        e87.a(c().c, aVarCreateNavigationEventHandler$activity);
        final b bVar = new b(aVarCreateNavigationEventHandler$activity, this, lifecycle);
        lifecycle.a(bVar);
        vg7Var.addCloseable$activity(new AutoCloseable() { // from class: xg7
            @Override // java.lang.AutoCloseable
            public final void close() {
                lifecycle.c(bVar);
            }
        });
    }

    public final void b(vg7 vg7Var) {
        vg7Var.getClass();
        e87.a(c().c, vg7Var.createNavigationEventHandler$activity(new wg7(null, vg7Var)));
    }

    public final a c() {
        return (a) this.b.getValue();
    }

    public final void d(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        c().c.c(new qg7(onBackInvokedDispatcher, 0), 1);
        c().c.c(new ug7(onBackInvokedDispatcher, 1000000), 0);
    }

    public zg7() {
        this(null);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a extends j87 {
        public final e87 c;

        public a(zg7 zg7Var) {
            e87 e87Var = new e87(new yg7(zg7Var));
            e87Var.b(this);
            this.c = e87Var;
        }

        @Override // defpackage.j87
        public final void b(boolean z) {
        }
    }
}
