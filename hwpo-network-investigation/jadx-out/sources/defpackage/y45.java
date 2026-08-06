package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class y45<ResponseT, ReturnT> extends ae9<ReturnT> {
    public final gq8 a;
    public final o21.a b;
    public final g52<su8, ResponseT> c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<ResponseT, ReturnT> extends y45<ResponseT, ReturnT> {
        public final q21<ResponseT, ReturnT> d;

        public a(gq8 gq8Var, o21.a aVar, g52<su8, ResponseT> g52Var, q21<ResponseT, ReturnT> q21Var) {
            super(gq8Var, aVar, g52Var);
            this.d = q21Var;
        }

        @Override // defpackage.y45
        public final Object c(kg7 kg7Var, Object[] objArr) {
            return this.d.adapt(kg7Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b<ResponseT> extends y45<ResponseT, Object> {
        public final q21<ResponseT, p21<ResponseT>> d;
        public final boolean e;

        public b(gq8 gq8Var, o21.a aVar, g52 g52Var, q21 q21Var, boolean z) {
            super(gq8Var, aVar, g52Var);
            this.d = q21Var;
            this.e = z;
        }

        @Override // defpackage.y45
        public final Object c(kg7 kg7Var, Object[] objArr) {
            p21<ResponseT> p21VarAdapt = this.d.adapt(kg7Var);
            r02 r02Var = (r02) objArr[objArr.length - 1];
            try {
                try {
                    if (!this.e) {
                        return lp5.a(p21VarAdapt, r02Var);
                    }
                    try {
                        p21VarAdapt.getClass();
                        return lp5.b(p21VarAdapt, r02Var);
                    } catch (LinkageError e) {
                        throw e;
                    } catch (ThreadDeath e2) {
                        throw e2;
                    }
                } catch (LinkageError | ThreadDeath | VirtualMachineError e3) {
                    throw e3;
                }
            } catch (Throwable th) {
                lp5.c(th, r02Var);
                return v72.t;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c<ResponseT> extends y45<ResponseT, Object> {
        public final q21<ResponseT, p21<ResponseT>> d;

        public c(gq8 gq8Var, o21.a aVar, g52<su8, ResponseT> g52Var, q21<ResponseT, p21<ResponseT>> q21Var) {
            super(gq8Var, aVar, g52Var);
            this.d = q21Var;
        }

        @Override // defpackage.y45
        public final Object c(kg7 kg7Var, Object[] objArr) {
            p21<ResponseT> p21VarAdapt = this.d.adapt(kg7Var);
            r02 r02Var = (r02) objArr[objArr.length - 1];
            try {
                e41 e41Var = new e41(1, th0.e(r02Var));
                e41Var.t();
                e41Var.v(new mp5(p21VarAdapt));
                p21VarAdapt.enqueue(new np5(e41Var));
                return e41Var.r();
            } catch (Exception e) {
                lp5.c(e, r02Var);
                return v72.t;
            }
        }
    }

    public y45(gq8 gq8Var, o21.a aVar, g52<su8, ResponseT> g52Var) {
        this.a = gq8Var;
        this.b = aVar;
        this.c = g52Var;
    }

    @Override // defpackage.ae9
    public final ReturnT a(Object obj, Object[] objArr) {
        return (ReturnT) c(new kg7(this.a, obj, objArr, this.b, this.c), objArr);
    }

    public abstract Object c(kg7 kg7Var, Object[] objArr);
}
