package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1$1", f = "FocusInteraction.kt", l = {68}, m = "invokeSuspend", v = 1)
public final class x84 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public int t;
    public final /* synthetic */ h27 u;
    public final /* synthetic */ h37<Boolean> v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ ArrayList t;
        public final /* synthetic */ h37<Boolean> u;

        public a(ArrayList arrayList, h37 h37Var) {
            this.t = arrayList;
            this.u = h37Var;
        }

        @Override // defpackage.s54
        public final Object emit(Object obj, r02 r02Var) {
            qg5 qg5Var = (qg5) obj;
            boolean z = qg5Var instanceof v84;
            ArrayList arrayList = this.t;
            if (z) {
                arrayList.add(qg5Var);
            } else if (qg5Var instanceof w84) {
                arrayList.remove(((w84) qg5Var).a);
            }
            this.u.setValue(Boolean.valueOf(!arrayList.isEmpty()));
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x84(h27 h27Var, h37<Boolean> h37Var, r02<? super x84> r02Var) {
        super(2, r02Var);
        this.u = h27Var;
        this.v = h37Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new x84(this.u, this.v, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((x84) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.t;
        if (i != 0) {
            if (i == 1) {
                dv8.b(obj);
                return g2b.a;
            }
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        ArrayList arrayList = new ArrayList();
        am9 am9VarA = this.u.a();
        a aVar = new a(arrayList, this.v);
        this.t = 1;
        am9VarA.collect(aVar, this);
        return v72.t;
    }
}
