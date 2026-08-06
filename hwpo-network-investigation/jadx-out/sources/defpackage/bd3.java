package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "com.hwpo_training_app.edit_performance.presentation.EditPerformanceViewModel$listenFilesUpdate$2", f = "EditPerformanceViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class bd3 extends p6a implements ci4<fx3, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ pc3 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd3(pc3 pc3Var, r02<? super bd3> r02Var) {
        super(2, r02Var);
        this.u = pc3Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        bd3 bd3Var = new bd3(this.u, r02Var);
        bd3Var.t = obj;
        return bd3Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(fx3 fx3Var, r02<? super g2b> r02Var) {
        return ((bd3) create(fx3Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        fx3 fx3Var = (fx3) this.t;
        dv8.b(obj);
        boolean z = fx3Var instanceof fx3.c;
        pc3 pc3Var = this.u;
        if (z) {
            e70 e70Var = pc3Var.E;
            fx3.c cVar = (fx3.c) fx3Var;
            m89 m89Var = cVar.b;
            e70Var.getClass();
            l89 l89VarA = e70.a(m89Var);
            String str = cVar.a;
            List<l89> list = pc3Var.b().c.v;
            ArrayList arrayList = new ArrayList(ph1.n(list, 10));
            for (l89 l89Var : list) {
                if (xj5.a(l89Var.w, str)) {
                    l89Var = l89VarA;
                }
                arrayList.add(l89Var);
            }
            pc3Var.e(new pc3.a.l(arrayList));
        } else if (fx3Var instanceof fx3.a) {
            pc3.a.h hVar = new pc3.a.h(((fx3.a) fx3Var).a);
            pc3.b bVar = pc3.Companion;
            pc3Var.e(hVar);
        } else if (fx3Var instanceof fx3.b) {
            String str2 = ((fx3.b) fx3Var).a;
            pc3.b bVar2 = pc3.Companion;
            List<l89> list2 = pc3Var.b().c.v;
            ArrayList arrayList2 = new ArrayList(ph1.n(list2, 10));
            for (l89 l89VarA2 : list2) {
                if (xj5.a(l89VarA2.w, str2)) {
                    l89VarA2 = l89.a(l89VarA2, null, z60.v, 14335);
                }
                arrayList2.add(l89VarA2);
            }
            pc3Var.e(new pc3.a.l(arrayList2));
        } else {
            if (!(fx3Var instanceof fx3.d)) {
                u.b();
                return null;
            }
            String str3 = ((fx3.d) fx3Var).a;
            pc3.b bVar3 = pc3.Companion;
            List<l89> list3 = pc3Var.b().c.v;
            ArrayList arrayList3 = new ArrayList(ph1.n(list3, 10));
            for (l89 l89VarA3 : list3) {
                if (xj5.a(l89VarA3.w, str3)) {
                    l89VarA3 = l89.a(l89VarA3, null, z60.u, 14335);
                }
                arrayList3.add(l89VarA3);
            }
            pc3Var.e(new pc3.a.l(arrayList3));
        }
        return g2b.a;
    }
}
