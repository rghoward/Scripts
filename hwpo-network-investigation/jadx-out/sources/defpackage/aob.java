package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class aob implements g76 {
    public final /* synthetic */ o02 t;
    public final /* synthetic */ ou7 u;
    public final /* synthetic */ gk8 v;
    public final /* synthetic */ gl8<ly6> w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[s66.a.values().length];
            try {
                iArr[s66.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s66.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s66.a.ON_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s66.a.ON_DESTROY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s66.a.ON_PAUSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[s66.a.ON_RESUME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[s66.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {379}, m = "invokeSuspend", v = 1)
    public static final class b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ gl8<ly6> u;
        public final /* synthetic */ gk8 v;
        public final /* synthetic */ m76 w;
        public final /* synthetic */ aob x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(gl8<ly6> gl8Var, gk8 gk8Var, m76 m76Var, aob aobVar, r02<? super b> r02Var) {
            super(2, r02Var);
            this.u = gl8Var;
            this.v = gk8Var;
            this.w = m76Var;
            this.x = aobVar;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new b(this.u, this.v, this.w, this.x, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            aob aobVar = this.x;
            m76 m76Var = this.w;
            try {
                if (i == 0) {
                    dv8.b(obj);
                    ly6 ly6Var = this.u.t;
                    gk8 gk8Var = this.v;
                    if (ly6Var != null) {
                        ly6Var.u = u72.a(gk8Var.x);
                    }
                    this.t = 1;
                    Object objG = oy0.g(gk8Var.a, new jk8(gk8Var, new lk8(gk8Var, null), zx6.a(getContext()), null), this);
                    Object obj2 = v72.t;
                    if (objG != obj2) {
                        objG = g2b.a;
                    }
                    if (objG != obj2) {
                        objG = g2b.a;
                    }
                    if (objG == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dv8.b(obj);
                }
                m76Var.getLifecycle().c(aobVar);
                return g2b.a;
            } catch (Throwable th) {
                m76Var.getLifecycle().c(aobVar);
                throw th;
            }
        }
    }

    public aob(o02 o02Var, ou7 ou7Var, gk8 gk8Var, gl8 gl8Var) {
        this.t = o02Var;
        this.u = ou7Var;
        this.v = gk8Var;
        this.w = gl8Var;
    }

    @Override // defpackage.g76
    public final void t(m76 m76Var, s66.a aVar) {
        boolean z;
        c41<g2b> c41VarB = null;
        switch (a.a[aVar.ordinal()]) {
            case 1:
                oy0.d(this.t, null, x72.w, new b(this.w, this.v, m76Var, this, null), 1);
                return;
            case 2:
                ou7 ou7Var = this.u;
                if (ou7Var != null) {
                    aq5 aq5Var = ou7Var.u;
                    synchronized (aq5Var.a) {
                        try {
                            synchronized (aq5Var.a) {
                                z = aq5Var.d;
                            }
                            if (!z) {
                                ArrayList arrayList = aq5Var.b;
                                aq5Var.b = aq5Var.c;
                                aq5Var.c = arrayList;
                                aq5Var.d = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((r02) arrayList.get(i)).resumeWith(g2b.a);
                                }
                                arrayList.clear();
                                g2b g2bVar = g2b.a;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                gk8 gk8Var = this.v;
                synchronized (gk8Var.c) {
                    if (gk8Var.t) {
                        gk8Var.t = false;
                        c41VarB = gk8Var.B();
                    }
                    break;
                }
                if (c41VarB != null) {
                    ((e41) c41VarB).resumeWith(g2b.a);
                    return;
                }
                return;
            case 3:
                gk8 gk8Var2 = this.v;
                synchronized (gk8Var2.c) {
                    gk8Var2.t = true;
                    g2b g2bVar2 = g2b.a;
                }
                return;
            case 4:
                this.v.z();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                u.b();
                return;
        }
    }
}
