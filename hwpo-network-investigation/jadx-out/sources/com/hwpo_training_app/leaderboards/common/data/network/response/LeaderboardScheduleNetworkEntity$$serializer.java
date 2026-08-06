package com.hwpo_training_app.leaderboards.common.data.network.response;

import defpackage.gk4;
import defpackage.gy2;
import defpackage.ig5;
import defpackage.ll;
import defpackage.o2a;
import defpackage.o48;
import defpackage.p48;
import defpackage.rt1;
import defpackage.ry0;
import defpackage.st1;
import io.intercom.android.sdk.models.AttributeType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@gy2
public final /* synthetic */ class LeaderboardScheduleNetworkEntity$$serializer implements gk4<LeaderboardScheduleNetworkEntity> {
    public static final LeaderboardScheduleNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LeaderboardScheduleNetworkEntity$$serializer leaderboardScheduleNetworkEntity$$serializer = new LeaderboardScheduleNetworkEntity$$serializer();
        INSTANCE = leaderboardScheduleNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardScheduleNetworkEntity", leaderboardScheduleNetworkEntity$$serializer, 2);
        o48Var.k("id", true);
        o48Var.k(AttributeType.DATE, true);
        descriptor = o48Var;
    }

    private LeaderboardScheduleNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{ry0.a(ig5.a), ry0.a(o2a.a)};
    }

    @Override // defpackage.sy2
    public final LeaderboardScheduleNetworkEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            if (iG0 == -1) {
                z = false;
            } else if (iG0 == 0) {
                num = (Integer) rt1VarN.L(serialDescriptor, 0, ig5.a, num);
                i |= 1;
            } else {
                if (iG0 != 1) {
                    ll.a(iG0);
                    return null;
                }
                str = (String) rt1VarN.L(serialDescriptor, 1, o2a.a, str);
                i |= 2;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new LeaderboardScheduleNetworkEntity(i, num, str);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, LeaderboardScheduleNetworkEntity leaderboardScheduleNetworkEntity) {
        encoder.getClass();
        leaderboardScheduleNetworkEntity.getClass();
        String str = leaderboardScheduleNetworkEntity.b;
        Integer num = leaderboardScheduleNetworkEntity.a;
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        if (st1VarN.C(serialDescriptor) || num != null) {
            st1VarN.z(serialDescriptor, 0, ig5.a, num);
        }
        if (st1VarN.C(serialDescriptor) || str != null) {
            st1VarN.z(serialDescriptor, 1, o2a.a, str);
        }
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
