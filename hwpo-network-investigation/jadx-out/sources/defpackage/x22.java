package defpackage;

import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import java.util.ArrayList;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x22 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ x22(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        ArrayList arrayList;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                return ConversationScreenKt.ConversationScreen$lambda$69$lambda$68((ConversationViewModel) obj);
            case 1:
                gk4<?> gk4Var = ((o48) obj).b;
                if (gk4Var == null || (kSerializerArrTypeParametersSerializers = gk4Var.typeParametersSerializers()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                    for (KSerializer<?> kSerializer : kSerializerArrTypeParametersSerializers) {
                        arrayList.add(kSerializer.getDescriptor());
                    }
                }
                return g28.c(arrayList);
            default:
                return Float.valueOf(((r69) obj).H.e.k());
        }
    }
}
