package defpackage;

import io.intercom.android.sdk.m5.navigation.ConversationDestinationKt;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l12 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ l12(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        boolean z;
        boolean z2;
        switch (this.t) {
            case 0:
                return ConversationDestinationKt.conversationDestination$lambda$6((ru) obj);
            default:
                oj3 oj3Var = (oj3) obj;
                fj3.a aVar = fj3.Companion;
                boolean z3 = false;
                if (oj3Var.f.isEmpty()) {
                    z = false;
                } else {
                    List<p7b> list = oj3Var.f;
                    if (!list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((p7b) it.next()) instanceof p7b.a) {
                                    z = false;
                                }
                            }
                        }
                    }
                    z = true;
                }
                List<l89> list2 = oj3Var.h;
                if (list2.isEmpty()) {
                    z2 = true;
                } else {
                    Iterator<T> it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z2 = true;
                        } else if (((l89) it2.next()).E != z60.w) {
                            z2 = false;
                        }
                    }
                }
                if (z && z2) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
        }
    }
}
