package defpackage;

import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ky7 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ ky7(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                int i = ny7.C;
                return Boolean.valueOf(((oy7) obj).b);
            case 1:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                float f = e86.a.b;
                u29 u29Var = t29.D;
                Boolean bool = Boolean.FALSE;
                xj5.a(obj2, bool);
                e86.a aVar = obj2 != null ? (e86.a) u29Var.u.invoke(obj2) : null;
                aVar.getClass();
                float f2 = aVar.a;
                Object obj3 = list.get(1);
                u29 u29Var2 = t29.E;
                xj5.a(obj3, bool);
                e86.c cVar = obj3 != null ? (e86.c) u29Var2.u.invoke(obj3) : null;
                cVar.getClass();
                int i2 = cVar.a;
                Object obj4 = list.get(2);
                u29 u29Var3 = t29.F;
                xj5.a(obj4, bool);
                e86.b bVar = obj4 != null ? (e86.b) u29Var3.u.invoke(obj4) : null;
                bVar.getClass();
                return new e86(i2, f2, bVar.a);
            default:
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$16((ru) obj);
        }
    }
}
