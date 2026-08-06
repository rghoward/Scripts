package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.entry_details.challenge.ChallengeEntryDetailsViewModel$listenPerformanceUpdates$1", f = "ChallengeEntryDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k71 extends p6a implements ci4<js7<? extends Integer, ? extends vc8>, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ w71 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k71(w71 w71Var, r02<? super k71> r02Var) {
        super(2, r02Var);
        this.u = w71Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        k71 k71Var = new k71(this.u, r02Var);
        k71Var.t = obj;
        return k71Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(js7<? extends Integer, ? extends vc8> js7Var, r02<? super g2b> r02Var) {
        return ((k71) create(js7Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        u60 u60Var;
        js7 js7Var = (js7) this.t;
        dv8.b(obj);
        int iIntValue = ((Number) js7Var.t).intValue();
        vc8 vc8Var = (vc8) js7Var.u;
        int i = w71.O;
        w71 w71Var = this.u;
        d71 d71Var = w71Var.b().d;
        if (d71Var == null) {
            return g2b.a;
        }
        if (iIntValue != d71Var.a) {
            return g2b.a;
        }
        tc8 tc8VarA = w71Var.B.a(vc8Var);
        List<l89> list = tc8VarA.v;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            u60Var = u60.w;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            if (((l89) next).v != u60Var) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((l89) obj2).v == u60Var) {
                arrayList2.add(obj2);
            }
        }
        w71Var.e(new n61.b(d71.a(d71Var, false, false, tc8VarA.u.length() > 0, !arrayList.isEmpty(), !arrayList2.isEmpty(), false, tc8VarA.u, null, null, tc8VarA, arrayList, arrayList2, 3359)));
        return g2b.a;
    }
}
