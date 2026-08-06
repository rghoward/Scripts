package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.tracking.presentation.enter_value.EnterValueViewModel$observeValueUpdate$1", f = "EnterValueViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jj3 extends p6a implements ci4<HashMap<Integer, String>, r02<? super g2b>, Object> {
    public /* synthetic */ Object t;
    public final /* synthetic */ fj3 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj3(fj3 fj3Var, r02<? super jj3> r02Var) {
        super(2, r02Var);
        this.u = fj3Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        jj3 jj3Var = new jj3(this.u, r02Var);
        jj3Var.t = obj;
        return jj3Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(HashMap<Integer, String> map, r02<? super g2b> r02Var) {
        return ((jj3) create(map, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x005e A[SYNTHETIC] */
    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        ArrayList arrayList;
        int size;
        List listO;
        Object obj2;
        HashMap map = (HashMap) this.t;
        dv8.b(obj);
        fj3 fj3Var = this.u;
        ArrayList arrayListF = wn0.f(map, ws0.h(fj3Var.K), (List) fj3Var.N.getValue());
        int i = 0;
        if (arrayListF.isEmpty()) {
            arrayList = new ArrayList();
            size = arrayListF.size();
            while (i < size) {
                obj2 = arrayListF.get(i);
                i++;
                if (obj2 instanceof p7b.b) {
                    arrayList.add(obj2);
                }
            }
            listO = arrayList;
        } else {
            int size2 = arrayListF.size();
            int i2 = 0;
            while (true) {
                if (i2 < size2) {
                    Object obj3 = arrayListF.get(i2);
                    i2++;
                    if (((p7b) obj3) instanceof p7b.a) {
                        ArrayList arrayList2 = new ArrayList();
                        int size3 = arrayListF.size();
                        while (i < size3) {
                            Object obj4 = arrayListF.get(i);
                            i++;
                            if (obj4 instanceof p7b.a) {
                                arrayList2.add(obj4);
                            }
                        }
                        listO = th1.O(1, arrayList2);
                    }
                } else {
                    arrayList = new ArrayList();
                    size = arrayListF.size();
                    while (i < size) {
                        obj2 = arrayListF.get(i);
                        i++;
                        if (obj2 instanceof p7b.b) {
                            arrayList.add(obj2);
                        }
                    }
                    listO = arrayList;
                }
            }
        }
        Collection collectionValues = map.values();
        collectionValues.getClass();
        String str = (String) th1.z(collectionValues);
        if (str == null) {
            return g2b.a;
        }
        fj3Var.e(new vh3.g(str, listO));
        return g2b.a;
    }
}
