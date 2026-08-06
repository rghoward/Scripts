package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface ox6 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b extends ox6 {
        @Override // defpackage.ox6
        default boolean l(oh4<? super b, Boolean> oh4Var) {
            return oh4Var.invoke(this).booleanValue();
        }

        @Override // defpackage.ox6
        default Object p(ci4 ci4Var, Object obj) {
            return ci4Var.invoke(obj, this);
        }
    }

    default ox6 H(ox6 ox6Var) {
        return ox6Var == a.t ? this : new kj1(this, ox6Var);
    }

    boolean l(oh4<? super b, Boolean> oh4Var);

    Object p(ci4 ci4Var, Object obj);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class c implements dw2 {
        public mb7 A;
        public boolean B;
        public boolean C;
        public boolean D;
        public boolean E;
        public uy4.a F;
        public boolean G;
        public o02 u;
        public int v;
        public c x;
        public c y;
        public tf7 z;
        public c t = this;
        public int w = -1;

        public final t72 Q1() {
            o02 o02Var = this.u;
            if (o02Var != null) {
                return o02Var;
            }
            o02 o02VarA = u72.a(ew2.g(this).getCoroutineContext().c0(new gl5((el5) ew2.g(this).getCoroutineContext().d0(el5.a.t))));
            this.u = o02VarA;
            return o02VarA;
        }

        public boolean R1() {
            return !(this instanceof ii0);
        }

        public void S1() {
            if (this.G) {
                uc5.b("node attached multiple times");
            }
            if (this.A == null) {
                uc5.b("attach invoked on a node without a coordinator");
            }
            this.G = true;
            this.D = true;
        }

        public void T1() {
            if (!this.G) {
                uc5.b("Cannot detach a node that is not attached");
            }
            if (this.D) {
                uc5.b("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.E) {
                uc5.b("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.G = false;
            o02 o02Var = this.u;
            if (o02Var != null) {
                u72.c(o02Var, new ux6("The Modifier.Node was detached", 2));
                this.u = null;
            }
        }

        public void X1() {
            if (!this.G) {
                uc5.b("reset() called on an unattached node");
            }
            W1();
        }

        public void Y1() {
            if (!this.G) {
                uc5.b("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.D) {
                uc5.b("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.D = false;
            U1();
            this.E = true;
        }

        public void Z1() {
            if (!this.G) {
                uc5.b("node detached multiple times");
            }
            if (this.A == null) {
                uc5.b("detach invoked on a node without a coordinator");
            }
            if (!this.E) {
                uc5.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.E = false;
            uy4.a aVar = this.F;
            if (aVar != null) {
                aVar.invoke();
            }
            V1();
        }

        public void a2(c cVar) {
            this.t = cVar;
        }

        public void b2(mb7 mb7Var) {
            this.A = mb7Var;
        }

        @Override // defpackage.dw2
        public final c q() {
            return this.t;
        }

        public void U1() {
        }

        public void V1() {
        }

        public void W1() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements ox6 {
        public static final /* synthetic */ a t = new a();

        @Override // defpackage.ox6
        public final boolean l(oh4<? super b, Boolean> oh4Var) {
            return true;
        }

        public final String toString() {
            return "Modifier";
        }

        @Override // defpackage.ox6
        public final ox6 H(ox6 ox6Var) {
            return ox6Var;
        }

        @Override // defpackage.ox6
        public final Object p(ci4 ci4Var, Object obj) {
            return obj;
        }
    }
}
