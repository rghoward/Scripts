package defpackage;

import com.hwpo_training_app.notifications.presentation.NotificationsViewModel;
import com.hwpo_training_app.notifications.presentation.NotificationsViewState;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jx3 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ jx3(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        iw.c cVar;
        switch (this.t) {
            case 0:
                ((kx3.c) obj).getClass();
                return g2b.a;
            case 1:
                NotificationsViewModel.Companion companion = NotificationsViewModel.Companion;
                return ((NotificationsViewState) obj).d;
            default:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                ss7 ss7Var = null;
                aVar = null;
                l86.a aVar = null;
                bVar = null;
                l86.b bVar = null;
                c5bVar = null;
                c5b c5bVar = null;
                xdbVar = null;
                xdb xdbVar = null;
                ww9Var = null;
                ww9 ww9Var = null;
                ss7Var = null;
                pw pwVar = obj2 != null ? (pw) obj2 : null;
                pwVar.getClass();
                Object obj3 = list.get(2);
                Integer num = obj3 != null ? (Integer) obj3 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj4 = list.get(3);
                Integer num2 = obj4 != null ? (Integer) obj4 : null;
                num2.getClass();
                int iIntValue2 = num2.intValue();
                Object obj5 = list.get(4);
                String str = obj5 != null ? (String) obj5 : null;
                str.getClass();
                switch (pwVar.ordinal()) {
                    case 0:
                        Object obj6 = list.get(1);
                        au3 au3Var = t29.h;
                        if (!xj5.a(obj6, Boolean.FALSE) && obj6 != null) {
                            ss7Var = (ss7) ((oh4) au3Var.u).invoke(obj6);
                        }
                        ss7Var.getClass();
                        cVar = new iw.c(ss7Var, iIntValue, iIntValue2, str);
                        break;
                    case 1:
                        Object obj7 = list.get(1);
                        au3 au3Var2 = t29.i;
                        if (!xj5.a(obj7, Boolean.FALSE) && obj7 != null) {
                            ww9Var = (ww9) ((oh4) au3Var2.u).invoke(obj7);
                        }
                        ww9Var.getClass();
                        cVar = new iw.c(ww9Var, iIntValue, iIntValue2, str);
                        break;
                    case 2:
                        Object obj8 = list.get(1);
                        au3 au3Var3 = t29.d;
                        if (!xj5.a(obj8, Boolean.FALSE) && obj8 != null) {
                            xdbVar = (xdb) ((oh4) au3Var3.u).invoke(obj8);
                        }
                        xdbVar.getClass();
                        cVar = new iw.c(xdbVar, iIntValue, iIntValue2, str);
                        break;
                    case 3:
                        Object obj9 = list.get(1);
                        au3 au3Var4 = t29.e;
                        if (!xj5.a(obj9, Boolean.FALSE) && obj9 != null) {
                            c5bVar = (c5b) ((oh4) au3Var4.u).invoke(obj9);
                        }
                        c5bVar.getClass();
                        cVar = new iw.c(c5bVar, iIntValue, iIntValue2, str);
                        break;
                    case 4:
                        Object obj10 = list.get(1);
                        au3 au3Var5 = t29.f;
                        if (!xj5.a(obj10, Boolean.FALSE) && obj10 != null) {
                            bVar = (l86.b) ((oh4) au3Var5.u).invoke(obj10);
                        }
                        bVar.getClass();
                        cVar = new iw.c(bVar, iIntValue, iIntValue2, str);
                        break;
                    case 5:
                        Object obj11 = list.get(1);
                        au3 au3Var6 = t29.g;
                        if (!xj5.a(obj11, Boolean.FALSE) && obj11 != null) {
                            aVar = (l86.a) ((oh4) au3Var6.u).invoke(obj11);
                        }
                        aVar.getClass();
                        cVar = new iw.c(aVar, iIntValue, iIntValue2, str);
                        break;
                    case 6:
                        Object obj12 = list.get(1);
                        String str2 = obj12 != null ? (String) obj12 : null;
                        str2.getClass();
                        cVar = new iw.c(new d2a(str2), iIntValue, iIntValue2, str);
                        break;
                    default:
                        u.b();
                        return null;
                }
                return cVar;
        }
    }
}
