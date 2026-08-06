package com.hwpo_training_app.tracking.data.entity;

import com.hwpo_training_app.core.data.model.schedule.UnitsNetworkEntity;
import defpackage.gk4;
import defpackage.gy2;
import defpackage.ig5;
import defpackage.ll;
import defpackage.n2b;
import defpackage.n43;
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
public final /* synthetic */ class EntryDetailsNetworkEntity$$serializer implements gk4<EntryDetailsNetworkEntity> {
    public static final EntryDetailsNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        EntryDetailsNetworkEntity$$serializer entryDetailsNetworkEntity$$serializer = new EntryDetailsNetworkEntity$$serializer();
        INSTANCE = entryDetailsNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.tracking.data.entity.EntryDetailsNetworkEntity", entryDetailsNetworkEntity$$serializer, 8);
        o48Var.k("id", false);
        o48Var.k("note", true);
        o48Var.k(AttributeType.DATE, false);
        o48Var.k("value", false);
        o48Var.k("second_value", true);
        o48Var.k("symbol", false);
        o48Var.k("units", false);
        o48Var.k("attachments", false);
        descriptor = o48Var;
    }

    private EntryDetailsNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        ss5<KSerializer<Object>>[] ss5VarArr = EntryDetailsNetworkEntity.B;
        o2a o2aVar = o2a.a;
        n43 n43Var = n43.a;
        return new KSerializer[]{ig5.a, ry0.a(o2aVar), o2aVar, n43Var, ry0.a(n43Var), o2aVar, n2b.a, ss5VarArr[7].getValue()};
    }

    @Override // defpackage.sy2
    public final EntryDetailsNetworkEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = EntryDetailsNetworkEntity.B;
        EntryDetailsNetworkEntity entryDetailsNetworkEntity = null;
        List list = null;
        String str = null;
        String strC0 = null;
        Double d = null;
        String strC1 = null;
        double dO0 = 0.0d;
        int i = 0;
        int iR = 0;
        boolean z = true;
        UnitsNetworkEntity unitsNetworkEntity = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            switch (iG0) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    iR = rt1VarN.R(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) rt1VarN.L(serialDescriptor, 1, o2a.a, str);
                    i |= 2;
                    break;
                case 2:
                    strC0 = rt1VarN.c0(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    dO0 = rt1VarN.o0(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    d = (Double) rt1VarN.L(serialDescriptor, 4, n43.a, d);
                    i |= 16;
                    break;
                case 5:
                    strC1 = rt1VarN.c0(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    unitsNetworkEntity = (UnitsNetworkEntity) rt1VarN.J(serialDescriptor, 6, n2b.a, unitsNetworkEntity);
                    i |= 64;
                    break;
                case 7:
                    list = (List) rt1VarN.J(serialDescriptor, 7, ss5VarArr[7].getValue(), list);
                    i |= 128;
                    break;
                default:
                    ll.a(iG0);
                    return entryDetailsNetworkEntity;
            }
            entryDetailsNetworkEntity = null;
        }
        rt1VarN.i(serialDescriptor);
        return new EntryDetailsNetworkEntity(i, iR, str, strC0, dO0, d, strC1, unitsNetworkEntity, list);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, EntryDetailsNetworkEntity entryDetailsNetworkEntity) {
        encoder.getClass();
        entryDetailsNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = EntryDetailsNetworkEntity.B;
        int i = entryDetailsNetworkEntity.t;
        Double d = entryDetailsNetworkEntity.x;
        String str = entryDetailsNetworkEntity.u;
        st1VarN.g(0, i, serialDescriptor);
        if (st1VarN.C(serialDescriptor) || str != null) {
            st1VarN.z(serialDescriptor, 1, o2a.a, str);
        }
        st1VarN.p(serialDescriptor, 2, entryDetailsNetworkEntity.v);
        st1VarN.x(serialDescriptor, 3, entryDetailsNetworkEntity.w);
        if (st1VarN.C(serialDescriptor) || d != null) {
            st1VarN.z(serialDescriptor, 4, n43.a, d);
        }
        st1VarN.p(serialDescriptor, 5, entryDetailsNetworkEntity.y);
        st1VarN.q(serialDescriptor, 6, n2b.a, entryDetailsNetworkEntity.z);
        st1VarN.q(serialDescriptor, 7, ss5VarArr[7].getValue(), entryDetailsNetworkEntity.A);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
