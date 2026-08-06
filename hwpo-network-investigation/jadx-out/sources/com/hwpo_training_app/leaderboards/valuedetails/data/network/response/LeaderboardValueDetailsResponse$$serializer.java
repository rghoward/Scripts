package com.hwpo_training_app.leaderboards.valuedetails.data.network.response;

import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardPerformanceNetworkEntity;
import com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardPerformanceNetworkEntity$$serializer;
import defpackage.gk4;
import defpackage.gy2;
import defpackage.ll;
import defpackage.o48;
import defpackage.p48;
import defpackage.rt1;
import defpackage.ry0;
import defpackage.st1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@gy2
public final /* synthetic */ class LeaderboardValueDetailsResponse$$serializer implements gk4<LeaderboardValueDetailsResponse> {
    public static final LeaderboardValueDetailsResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LeaderboardValueDetailsResponse$$serializer leaderboardValueDetailsResponse$$serializer = new LeaderboardValueDetailsResponse$$serializer();
        INSTANCE = leaderboardValueDetailsResponse$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.leaderboards.valuedetails.data.network.response.LeaderboardValueDetailsResponse", leaderboardValueDetailsResponse$$serializer, 2);
        o48Var.k("score_value", false);
        o48Var.k("performance", true);
        descriptor = o48Var;
    }

    private LeaderboardValueDetailsResponse$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{LeaderboardValueDetailsNetworkEntity$$serializer.INSTANCE, ry0.a(LeaderboardPerformanceNetworkEntity$$serializer.INSTANCE)};
    }

    @Override // defpackage.sy2
    public final LeaderboardValueDetailsResponse deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        boolean z = true;
        int i = 0;
        LeaderboardValueDetailsNetworkEntity leaderboardValueDetailsNetworkEntity = null;
        LeaderboardPerformanceNetworkEntity leaderboardPerformanceNetworkEntity = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            if (iG0 == -1) {
                z = false;
            } else if (iG0 == 0) {
                leaderboardValueDetailsNetworkEntity = (LeaderboardValueDetailsNetworkEntity) rt1VarN.J(serialDescriptor, 0, LeaderboardValueDetailsNetworkEntity$$serializer.INSTANCE, leaderboardValueDetailsNetworkEntity);
                i |= 1;
            } else {
                if (iG0 != 1) {
                    ll.a(iG0);
                    return null;
                }
                leaderboardPerformanceNetworkEntity = (LeaderboardPerformanceNetworkEntity) rt1VarN.L(serialDescriptor, 1, LeaderboardPerformanceNetworkEntity$$serializer.INSTANCE, leaderboardPerformanceNetworkEntity);
                i |= 2;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new LeaderboardValueDetailsResponse(i, leaderboardValueDetailsNetworkEntity, leaderboardPerformanceNetworkEntity);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, LeaderboardValueDetailsResponse leaderboardValueDetailsResponse) {
        encoder.getClass();
        leaderboardValueDetailsResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        LeaderboardValueDetailsNetworkEntity$$serializer leaderboardValueDetailsNetworkEntity$$serializer = LeaderboardValueDetailsNetworkEntity$$serializer.INSTANCE;
        LeaderboardValueDetailsNetworkEntity leaderboardValueDetailsNetworkEntity = leaderboardValueDetailsResponse.a;
        LeaderboardPerformanceNetworkEntity leaderboardPerformanceNetworkEntity = leaderboardValueDetailsResponse.b;
        st1VarN.q(serialDescriptor, 0, leaderboardValueDetailsNetworkEntity$$serializer, leaderboardValueDetailsNetworkEntity);
        if (st1VarN.C(serialDescriptor) || leaderboardPerformanceNetworkEntity != null) {
            st1VarN.z(serialDescriptor, 1, LeaderboardPerformanceNetworkEntity$$serializer.INSTANCE, leaderboardPerformanceNetworkEntity);
        }
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
