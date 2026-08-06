package com.hwpo_training_app.leaderboards.common.data.network.response;

import defpackage.gk4;
import defpackage.gy2;
import defpackage.ig5;
import defpackage.is0;
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
public final /* synthetic */ class LeaderboardUserNetworkEntity$$serializer implements gk4<LeaderboardUserNetworkEntity> {
    public static final LeaderboardUserNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LeaderboardUserNetworkEntity$$serializer leaderboardUserNetworkEntity$$serializer = new LeaderboardUserNetworkEntity$$serializer();
        INSTANCE = leaderboardUserNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.leaderboards.common.data.network.response.LeaderboardUserNetworkEntity", leaderboardUserNetworkEntity$$serializer, 6);
        o48Var.k("id", false);
        o48Var.k("full_name", false);
        o48Var.k("country", false);
        o48Var.k("avatar_url", true);
        o48Var.k("age", false);
        o48Var.k("is_mine", false);
        descriptor = o48Var;
    }

    private LeaderboardUserNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        o2a o2aVar = o2a.a;
        KSerializer<?> kSerializerA = ry0.a(o2aVar);
        ig5 ig5Var = ig5.a;
        return new KSerializer[]{ig5Var, o2aVar, o2aVar, kSerializerA, ig5Var, is0.a};
    }

    @Override // defpackage.sy2
    public final LeaderboardUserNetworkEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iR = 0;
        int iR2 = 0;
        boolean zA0 = false;
        String strC0 = null;
        String strC1 = null;
        String str = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            switch (iG0) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iR = rt1VarN.R(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strC0 = rt1VarN.c0(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strC1 = rt1VarN.c0(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) rt1VarN.L(serialDescriptor, 3, o2a.a, str);
                    i |= 8;
                    break;
                case 4:
                    iR2 = rt1VarN.R(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    zA0 = rt1VarN.a0(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    ll.a(iG0);
                    return null;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new LeaderboardUserNetworkEntity(i, iR, strC0, strC1, str, iR2, zA0);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, LeaderboardUserNetworkEntity leaderboardUserNetworkEntity) {
        encoder.getClass();
        leaderboardUserNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        int i = leaderboardUserNetworkEntity.a;
        String str = leaderboardUserNetworkEntity.d;
        st1VarN.g(0, i, serialDescriptor);
        st1VarN.p(serialDescriptor, 1, leaderboardUserNetworkEntity.b);
        st1VarN.p(serialDescriptor, 2, leaderboardUserNetworkEntity.c);
        if (st1VarN.C(serialDescriptor) || str != null) {
            st1VarN.z(serialDescriptor, 3, o2a.a, str);
        }
        st1VarN.g(4, leaderboardUserNetworkEntity.e, serialDescriptor);
        st1VarN.o(serialDescriptor, 5, leaderboardUserNetworkEntity.f);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
