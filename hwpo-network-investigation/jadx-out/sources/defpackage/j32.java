package defpackage;

import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import java.util.ArrayList;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j32 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ j32(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        Object obj;
        int i = this.t;
        int i2 = 0;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                return ConversationScreenKt.ConversationScreen$lambda$93$lambda$92((ConversationViewModel) obj2);
            case 1:
                ArrayList arrayList = ((m07) obj2).e;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    Object obj3 = arrayList.get(0);
                    float fC = ((os7) obj3).a.i.c();
                    int i3 = 1;
                    int size = arrayList.size() - 1;
                    if (1 <= size) {
                        while (true) {
                            Object obj4 = arrayList.get(i3);
                            float fC2 = ((os7) obj4).a.i.c();
                            if (Float.compare(fC, fC2) < 0) {
                                obj3 = obj4;
                                fC = fC2;
                            }
                            if (i3 != size) {
                                i3++;
                            }
                        }
                    }
                    obj = obj3;
                }
                os7 os7Var = (os7) obj;
                return Float.valueOf(os7Var != null ? os7Var.a.i.c() : 0.0f);
            default:
                s58 s58Var = (s58) obj2;
                ld9 ld9VarB = od9.b("kotlinx.serialization.Polymorphic", p58.a.a, new SerialDescriptor[0], new r58(i2, s58Var));
                sd1 sd1Var = s58Var.a;
                sd1Var.getClass();
                return new wz1(ld9VarB, sd1Var);
        }
    }
}
