package com.hwpo_training_app.leaderboards.common.data.network.response;

import com.hwpo_training_app.core.data.model.attachments.SectionAttachmentNetworkEntity;
import defpackage.gk4;
import defpackage.gy2;
import defpackage.ig5;
import defpackage.ll;
import defpackage.o2a;
import defpackage.o48;
import defpackage.p48;
import defpackage.rt1;
import defpackage.ry0;
import defpackage.ss5;
import defpackage.st1;
import io.intercom.android.sdk.models.AttributeType;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@gy2
public final /* synthetic */ class LeaderboardPerformanceNetworkEntity$$serializer implements gk4<LeaderboardPerformanceNetworkEntity> {
    public static final LeaderboardPerformanceNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LeaderboardPerformanceNetworkEntity$$serializer leaderboardPerformanceNetworkEntity$$serializer = new LeaderboardPerformanceNetworkEntity$$serializer();
        INSTANCE = leaderboardPerformanceNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardPerformanceNetworkEntity", leaderboardPerformanceNetworkEntity$$serializer, 3);
        o48Var.k("id", false);
        o48Var.k(AttributeType.TEXT, false);
        o48Var.k("attachments", true);
        descriptor = o48Var;
    }

    private LeaderboardPerformanceNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{ig5.a, ry0.a(o2a.a), ry0.a(LeaderboardPerformanceNetworkEntity.d[2].getValue())};
    }

    @Override // defpackage.sy2
    public final LeaderboardPerformanceNetworkEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = LeaderboardPerformanceNetworkEntity.d;
        boolean z = true;
        int i = 0;
        int iR = 0;
        String str = null;
        List list = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            if (iG0 == -1) {
                z = false;
            } else if (iG0 == 0) {
                iR = rt1VarN.R(serialDescriptor, 0);
                i |= 1;
            } else if (iG0 == 1) {
                str = (String) rt1VarN.L(serialDescriptor, 1, o2a.a, str);
                i |= 2;
            } else {
                if (iG0 != 2) {
                    ll.a(iG0);
                    return null;
                }
                list = (List) rt1VarN.L(serialDescriptor, 2, ss5VarArr[2].getValue(), list);
                i |= 4;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new LeaderboardPerformanceNetworkEntity(i, iR, str, list);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, LeaderboardPerformanceNetworkEntity leaderboardPerformanceNetworkEntity) {
        encoder.getClass();
        leaderboardPerformanceNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = LeaderboardPerformanceNetworkEntity.d;
        int i = leaderboardPerformanceNetworkEntity.a;
        List<SectionAttachmentNetworkEntity> list = leaderboardPerformanceNetworkEntity.c;
        st1VarN.g(0, i, serialDescriptor);
        st1VarN.z(serialDescriptor, 1, o2a.a, leaderboardPerformanceNetworkEntity.b);
        if (st1VarN.C(serialDescriptor) || list != null) {
            st1VarN.z(serialDescriptor, 2, ss5VarArr[2].getValue(), list);
        }
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
