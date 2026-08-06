package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class vg0<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(vg0.class, "notCompletedCount$volatile");
    public final uv2<T>[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class a extends kl5 {
        public static final /* synthetic */ AtomicReferenceFieldUpdater D = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        public static final /* synthetic */ long E = rxc.a.objectFieldOffset(a.class.getDeclaredField("_disposer$volatile"));
        public final e41 A;
        public e33 B;
        private volatile /* synthetic */ Object _disposer$volatile;

        public a(e41 e41Var) {
            this.A = e41Var;
        }

        @Override // defpackage.kl5
        public final boolean q() {
            return false;
        }

        @Override // defpackage.kl5
        public final void r(Throwable th) {
            e41 e41Var = this.A;
            if (th != null) {
                e41Var.getClass();
                k7a k7aVarG = e41Var.G(new jp1(th, false), null);
                if (k7aVarG != null) {
                    e41Var.x(k7aVarG);
                    vg0<T>.b bVarS = s();
                    if (bVarS != null) {
                        bVarS.a();
                        return;
                    }
                    return;
                }
                return;
            }
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = vg0.b;
            vg0<T> vg0Var = vg0.this;
            if (atomicIntegerFieldUpdater.decrementAndGet(vg0Var) == 0) {
                uv2<T>[] uv2VarArr = vg0Var.a;
                ArrayList arrayList = new ArrayList(uv2VarArr.length);
                for (uv2<T> uv2Var : uv2VarArr) {
                    arrayList.add(uv2Var.p());
                }
                e41Var.resumeWith(arrayList);
            }
        }

        public final vg0<T>.b s() {
            D.getClass();
            return (b) rxc.a.getObjectVolatile(this, E);
        }

        public final void t(vg0<T>.b bVar) {
            D.getClass();
            rxc.a.putObjectVolatile(this, E, bVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class b implements v31 {
        public final vg0<T>.a[] t;

        public b(a[] aVarArr) {
            this.t = aVarArr;
        }

        public final void a() {
            for (vg0<T>.a aVar : this.t) {
                e33 e33Var = aVar.B;
                if (e33Var == null) {
                    xj5.e("handle");
                    throw null;
                }
                e33Var.dispose();
            }
        }

        @Override // defpackage.v31
        public final void c(Throwable th) {
            a();
        }

        public final String toString() {
            return "DisposeHandlersOnCancel[" + this.t + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vg0(uv2<? extends T>[] uv2VarArr) {
        this.a = uv2VarArr;
        this.notCompletedCount$volatile = uv2VarArr.length;
    }
}
