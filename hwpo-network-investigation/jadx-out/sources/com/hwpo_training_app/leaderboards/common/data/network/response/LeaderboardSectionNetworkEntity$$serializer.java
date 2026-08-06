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
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@gy2
public final /* synthetic */ class LeaderboardSectionNetworkEntity$$serializer implements gk4<LeaderboardSectionNetworkEntity> {
    public static final LeaderboardSectionNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LeaderboardSectionNetworkEntity$$serializer leaderboardSectionNetworkEntity$$serializer = new LeaderboardSectionNetworkEntity$$serializer();
        INSTANCE = leaderboardSectionNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardSectionNetworkEntity", leaderboardSectionNetworkEntity$$serializer, 3);
        o48Var.k("id", false);
        o48Var.k("title", true);
        o48Var.k("description", true);
        descriptor = o48Var;
    }

    private LeaderboardSectionNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        o2a o2aVar = o2a.a;
        return new KSerializer[]{ig5.a, ry0.a(o2aVar), ry0.a(o2aVar)};
    }

    @Override // defpackage.sy2
    public final LeaderboardSectionNetworkEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iR = 0;
        String str = null;
        String str2 = null;
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
                str2 = (String) rt1VarN.L(serialDescriptor, 2, o2a.a, str2);
                i |= 4;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new LeaderboardSectionNetworkEntity(i, iR, str, str2);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, LeaderboardSectionNetworkEntity leaderboardSectionNetworkEntity) {
        encoder.getClass();
        leaderboardSectionNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        int i = leaderboardSectionNetworkEntity.a;
        String str = leaderboardSectionNetworkEntity.c;
        String str2 = leaderboardSectionNetworkEntity.b;
        st1VarN.g(0, i, serialDescriptor);
        if (st1VarN.C(serialDescriptor) || str2 != null) {
            st1VarN.z(serialDescriptor, 1, o2a.a, str2);
        }
        if (st1VarN.C(serialDescriptor) || str != null) {
            st1VarN.z(serialDescriptor, 2, o2a.a, str);
        }
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
