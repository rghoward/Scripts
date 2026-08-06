package com.hwpo_training_app.tracking.data.entity;

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
import defpackage.ue6;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@gy2
public final /* synthetic */ class ScoreInfoNetworkEntity$$serializer implements gk4<ScoreInfoNetworkEntity> {
    public static final ScoreInfoNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScoreInfoNetworkEntity$$serializer scoreInfoNetworkEntity$$serializer = new ScoreInfoNetworkEntity$$serializer();
        INSTANCE = scoreInfoNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.tracking.data.entity.ScoreInfoNetworkEntity", scoreInfoNetworkEntity$$serializer, 5);
        o48Var.k("id", false);
        o48Var.k("tags", false);
        o48Var.k("description", true);
        o48Var.k("updated_at", false);
        o48Var.k("attachments", false);
        descriptor = o48Var;
    }

    private ScoreInfoNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        ss5<KSerializer<Object>>[] ss5VarArr = ScoreInfoNetworkEntity.y;
        return new KSerializer[]{ig5.a, ss5VarArr[1].getValue(), ry0.a(o2a.a), ue6.a, ss5VarArr[4].getValue()};
    }

    @Override // defpackage.sy2
    public final ScoreInfoNetworkEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = ScoreInfoNetworkEntity.y;
        int i = 0;
        int iR = 0;
        List list = null;
        String str = null;
        List list2 = null;
        long jG = 0;
        boolean z = true;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            if (iG0 == -1) {
                z = false;
            } else if (iG0 == 0) {
                iR = rt1VarN.R(serialDescriptor, 0);
                i |= 1;
            } else if (iG0 == 1) {
                list = (List) rt1VarN.J(serialDescriptor, 1, ss5VarArr[1].getValue(), list);
                i |= 2;
            } else if (iG0 == 2) {
                str = (String) rt1VarN.L(serialDescriptor, 2, o2a.a, str);
                i |= 4;
            } else if (iG0 == 3) {
                jG = rt1VarN.G(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iG0 != 4) {
                    ll.a(iG0);
                    return null;
                }
                list2 = (List) rt1VarN.J(serialDescriptor, 4, ss5VarArr[4].getValue(), list2);
                i |= 16;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new ScoreInfoNetworkEntity(i, iR, list, str, jG, list2);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, ScoreInfoNetworkEntity scoreInfoNetworkEntity) {
        encoder.getClass();
        scoreInfoNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = ScoreInfoNetworkEntity.y;
        int i = scoreInfoNetworkEntity.t;
        String str = scoreInfoNetworkEntity.v;
        st1VarN.g(0, i, serialDescriptor);
        st1VarN.q(serialDescriptor, 1, ss5VarArr[1].getValue(), scoreInfoNetworkEntity.u);
        if (st1VarN.C(serialDescriptor) || str != null) {
            st1VarN.z(serialDescriptor, 2, o2a.a, str);
        }
        st1VarN.B(serialDescriptor, 3, scoreInfoNetworkEntity.w);
        st1VarN.q(serialDescriptor, 4, ss5VarArr[4].getValue(), scoreInfoNetworkEntity.x);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
