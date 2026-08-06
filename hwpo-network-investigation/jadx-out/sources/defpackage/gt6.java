package defpackage;

import android.content.res.Resources;
import io.intercom.android.sdk.m5.conversation.states.MediaUploadItem;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gt6 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ gt6(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        uh1 uh1Var;
        uh1 uh1Var2;
        switch (this.t) {
            case 0:
                return MessageComposerKt.MessageComposer$lambda$19$lambda$18((MediaUploadItem) obj);
            case 1:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                int i = uh1.l;
                au3 au3Var = t29.a;
                Boolean bool = Boolean.FALSE;
                xj5.a(obj2, bool);
                if (obj2 != null) {
                    uh1Var = xj5.a(obj2, Boolean.FALSE) ? new uh1(uh1.k) : new uh1(u7d.c(((Integer) obj2).intValue()));
                } else {
                    uh1Var = null;
                }
                uh1Var.getClass();
                long j = uh1Var.a;
                Object obj3 = list.get(1);
                dka[] dkaVarArr = bka.b;
                oh4<Object, Object> oh4Var = t29.x.u;
                xj5.a(obj3, bool);
                bka bkaVar = obj3 != null ? (bka) oh4Var.invoke(obj3) : null;
                bkaVar.getClass();
                long j2 = bkaVar.a;
                Object obj4 = list.get(2);
                ob4 ob4Var = ob4.u;
                ob4 ob4Var2 = (xj5.a(obj4, bool) || obj4 == null) ? null : (ob4) ((oh4) t29.n.u).invoke(obj4);
                Object obj5 = list.get(3);
                mb4 mb4Var = (xj5.a(obj5, bool) || obj5 == null) ? null : (mb4) ((oh4) t29.v.u).invoke(obj5);
                Object obj6 = list.get(4);
                nb4 nb4Var = (xj5.a(obj6, bool) || obj6 == null) ? null : (nb4) ((oh4) t29.w.u).invoke(obj6);
                Object obj7 = list.get(6);
                String str = obj7 != null ? (String) obj7 : null;
                Object obj8 = list.get(7);
                xj5.a(obj8, bool);
                bka bkaVar2 = obj8 != null ? (bka) oh4Var.invoke(obj8) : null;
                bkaVar2.getClass();
                long j3 = bkaVar2.a;
                Object obj9 = list.get(8);
                gl0 gl0Var = (xj5.a(obj9, bool) || obj9 == null) ? null : (gl0) ((oh4) t29.o.u).invoke(obj9);
                Object obj10 = list.get(9);
                oha ohaVar = (xj5.a(obj10, bool) || obj10 == null) ? null : (oha) ((oh4) t29.l.u).invoke(obj10);
                Object obj11 = list.get(10);
                ad6 ad6Var = ad6.v;
                ad6 ad6Var2 = (xj5.a(obj11, bool) || obj11 == null) ? null : (ad6) ((oh4) t29.A.u).invoke(obj11);
                Object obj12 = list.get(11);
                xj5.a(obj12, bool);
                ob4 ob4Var3 = ob4Var2;
                if (obj12 != null) {
                    uh1Var2 = xj5.a(obj12, Boolean.FALSE) ? new uh1(uh1.k) : new uh1(u7d.c(((Integer) obj12).intValue()));
                } else {
                    uh1Var2 = null;
                }
                uh1Var2.getClass();
                long j4 = uh1Var2.a;
                Object obj13 = list.get(12);
                fda fdaVar = (xj5.a(obj13, bool) || obj13 == null) ? null : (fda) ((oh4) t29.k.u).invoke(obj13);
                Object obj14 = list.get(13);
                el9 el9Var = el9.d;
                return new ww9(j, j2, ob4Var3, mb4Var, nb4Var, null, str, j3, gl0Var, ohaVar, ad6Var2, j4, fdaVar, (xj5.a(obj14, bool) || obj14 == null) ? null : (el9) ((oh4) t29.q.u).invoke(obj14), 49184);
            default:
                ((Resources) obj).getClass();
                return Boolean.TRUE;
        }
    }
}
