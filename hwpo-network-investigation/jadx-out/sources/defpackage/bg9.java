package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.sessions.presentation.session_details.SessionDetailsViewModel$listenFileDownloadingUpdates$1", f = "SessionDetailsViewModel.kt", l = {115}, m = "invokeSuspend", v = 2)
public final class bg9 extends p6a implements ci4<xd3<? extends Exception, ? extends ww3>, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ qf9 v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends wa implements ci4<ww3, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(ww3 ww3Var, r02<? super g2b> r02Var) {
            Object obj;
            Object next;
            bl0 hVar;
            ww3 ww3Var2 = ww3Var;
            qf9 qf9Var = (qf9) this.receiver;
            int i = qf9.Y;
            Iterator<T> it = qf9Var.b().h.iterator();
            do {
                obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!xj5.a(((l89) next).w, ww3Var2.a()));
            l89 l89Var = (l89) next;
            if (l89Var == null) {
                for (Object obj2 : qf9Var.b().j.n) {
                    if (xj5.a(((l89) obj2).w, ww3Var2.a())) {
                        obj = obj2;
                        break;
                    }
                }
                l89 l89Var2 = (l89) obj;
                if (l89Var2 != null) {
                    hVar = new qf9.b.i(l89Var2.t, fk2.a(ww3Var2));
                }
                return g2b.a;
            }
            hVar = new qf9.b.h(l89Var.t, fk2.a(ww3Var2));
            qf9Var.e(hVar);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg9(qf9 qf9Var, r02<? super bg9> r02Var) {
        super(2, r02Var);
        this.v = qf9Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        bg9 bg9Var = new bg9(this.v, r02Var);
        bg9Var.u = obj;
        return bg9Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(xd3<? extends Exception, ? extends ww3> xd3Var, r02<? super g2b> r02Var) {
        return ((bg9) create(xd3Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        xd3 xd3Var = (xd3) this.u;
        int i = this.t;
        if (i == 0) {
            dv8.b(obj);
            a aVar = new a(2, this.v, qf9.class, "updateFileStatus", "updateFileStatus(Lcom/hwpo_training_app/domain/entity/FileDownloadingStatus;)V", 4);
            this.u = null;
            this.t = 1;
            Object objB = yd3.b(xd3Var, aVar, this);
            v72 v72Var = v72.t;
            if (objB == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }
}
