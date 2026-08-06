package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.hwpo_library.presentation.MediaLibraryViewModel$loadAttachments$1", f = "MediaLibraryViewModel.kt", l = {144}, m = "invokeSuspend", v = 2)
public final class jp6 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ ip6 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends pi4 implements oh4<List<? extends m89>, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(List<? extends m89> list) {
            List<? extends m89> list2 = list;
            list2.getClass();
            ip6 ip6Var = (ip6) this.receiver;
            ip6.b bVar = ip6.Companion;
            ip6Var.getClass();
            if (list2.isEmpty()) {
                ip6Var.e(ip6.a.g.a);
            } else {
                ip6Var.e(new ip6.a.e(ip6Var.g(ip6Var.b().h), y60.b(list2)));
            }
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp6(ip6 ip6Var, r02<? super jp6> r02Var) {
        super(2, r02Var);
        this.u = ip6Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new jp6(this.u, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((jp6) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        ip6 ip6Var = this.u;
        if (i == 0) {
            dv8.b(obj);
            ip6.b bVar = ip6.Companion;
            ip6Var.e(ip6.a.i.a);
            pb6 pb6Var = ip6Var.x;
            pb6.a aVar = new pb6.a(ip6Var.b().h);
            this.t = 1;
            pb6Var.getClass();
            obj = g5b.b(pb6Var, aVar, this);
            v72 v72Var = v72.t;
            if (obj == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        xd3 xd3Var = (xd3) obj;
        a aVar2 = new a(1, ip6Var, ip6.class, "onInitialAttachmentsLoaded", "onInitialAttachmentsLoaded(Ljava/util/List;)V", 0);
        xd3Var.getClass();
        if (xd3Var instanceof xd3.a) {
            rma.a.b((Exception) ((xd3.a) xd3Var).a);
            ip6.b bVar2 = ip6.Companion;
            ip6Var.e(ip6.a.h.a);
            g2b g2bVar = g2b.a;
        } else {
            if (!(xd3Var instanceof xd3.b)) {
                u.b();
                return null;
            }
            aVar2.invoke(((xd3.b) xd3Var).a);
        }
        return g2b.a;
    }
}
