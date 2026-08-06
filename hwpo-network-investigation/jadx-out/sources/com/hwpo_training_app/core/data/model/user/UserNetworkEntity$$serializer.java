package com.hwpo_training_app.core.data.model.user;

import com.hwpo_training_app.core.data.model.gym.GymNetworkEntity;
import com.hwpo_training_app.core.data.model.gym.GymNetworkEntity$$serializer;
import com.hwpo_training_app.core.data.model.gym.GymTypeNetworkEntity;
import com.hwpo_training_app.multilanguage.data.model.AppLanguageNetworkEntity;
import defpackage.gk4;
import defpackage.gy2;
import defpackage.h4c;
import defpackage.ig5;
import defpackage.is0;
import defpackage.ll;
import defpackage.o2a;
import defpackage.o48;
import defpackage.p48;
import defpackage.rt1;
import defpackage.ry0;
import defpackage.ss5;
import defpackage.st1;
import defpackage.ue6;
import defpackage.z97;
import io.ably.lib.util.Crypto;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@gy2
public final /* synthetic */ class UserNetworkEntity$$serializer implements gk4<UserNetworkEntity> {
    public static final UserNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        UserNetworkEntity$$serializer userNetworkEntity$$serializer = new UserNetworkEntity$$serializer();
        INSTANCE = userNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.core.data.model.user.UserNetworkEntity", userNetworkEntity$$serializer, 17);
        o48Var.k("id", false);
        o48Var.k("full_name", false);
        o48Var.k("first_name", true);
        o48Var.k("last_name", true);
        o48Var.k("email", false);
        o48Var.k("avatar_url", true);
        o48Var.k("age", false);
        o48Var.k("birthdate", true);
        o48Var.k("country", false);
        o48Var.k("gym_type", true);
        o48Var.k("gym", true);
        o48Var.k("gender", true);
        o48Var.k("weight", true);
        o48Var.k("length", true);
        o48Var.k("needs_user_review", true);
        o48Var.k("block_comment", true);
        o48Var.k("client_language", true);
        descriptor = o48Var;
    }

    private UserNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        ss5<KSerializer<Object>>[] ss5VarArr = UserNetworkEntity.K;
        o2a o2aVar = o2a.a;
        KSerializer<?> kSerializerA = ry0.a(o2aVar);
        KSerializer<?> kSerializerA2 = ry0.a(o2aVar);
        KSerializer<?> kSerializerA3 = ry0.a(o2aVar);
        KSerializer<?> kSerializerA4 = ry0.a(ue6.a);
        KSerializer<?> kSerializerA5 = ry0.a(ss5VarArr[9].getValue());
        KSerializer<?> kSerializerA6 = ry0.a(GymNetworkEntity$$serializer.INSTANCE);
        KSerializer<?> kSerializerA7 = ry0.a(ss5VarArr[11].getValue());
        KSerializer<?> kSerializerA8 = ry0.a(ss5VarArr[12].getValue());
        KSerializer<?> kSerializerA9 = ry0.a(ss5VarArr[13].getValue());
        is0 is0Var = is0.a;
        KSerializer<?> kSerializerA10 = ry0.a(is0Var);
        KSerializer<?> kSerializerA11 = ry0.a(is0Var);
        KSerializer<?> kSerializerA12 = ry0.a(ss5VarArr[16].getValue());
        ig5 ig5Var = ig5.a;
        return new KSerializer[]{ig5Var, o2aVar, kSerializerA, kSerializerA2, o2aVar, kSerializerA3, ig5Var, kSerializerA4, o2aVar, kSerializerA5, kSerializerA6, kSerializerA7, kSerializerA8, kSerializerA9, kSerializerA10, kSerializerA11, kSerializerA12};
    }

    @Override // defpackage.sy2
    public final UserNetworkEntity deserialize(Decoder decoder) {
        int i;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = UserNetworkEntity.K;
        WeightUnitsNetworkEntity weightUnitsNetworkEntity = null;
        GenderNetworkEntity genderNetworkEntity = null;
        GymNetworkEntity gymNetworkEntity = null;
        GymTypeNetworkEntity gymTypeNetworkEntity = null;
        LengthUnitsNetworkEntity lengthUnitsNetworkEntity = null;
        Long l = null;
        int i2 = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        AppLanguageNetworkEntity appLanguageNetworkEntity = null;
        String str3 = null;
        int iR = 0;
        String strC0 = null;
        boolean z = true;
        int iR2 = 0;
        String strC1 = null;
        String strC2 = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            switch (iG0) {
                case -1:
                    z = false;
                    iR = iR;
                    weightUnitsNetworkEntity = weightUnitsNetworkEntity;
                    break;
                case 0:
                    iR2 = rt1VarN.R(serialDescriptor, 0);
                    i2 |= 1;
                    str = str;
                    iR = iR;
                    weightUnitsNetworkEntity = weightUnitsNetworkEntity;
                    break;
                case 1:
                    weightUnitsNetworkEntity = weightUnitsNetworkEntity;
                    strC1 = rt1VarN.c0(serialDescriptor, 1);
                    i2 |= 2;
                    str = str;
                    weightUnitsNetworkEntity = weightUnitsNetworkEntity;
                    break;
                case 2:
                    str = (String) rt1VarN.L(serialDescriptor, 2, o2a.a, str);
                    i2 |= 4;
                    iR = iR;
                    weightUnitsNetworkEntity = weightUnitsNetworkEntity;
                    break;
                case 3:
                    str = str;
                    iR = iR;
                    str2 = (String) rt1VarN.L(serialDescriptor, 3, o2a.a, str2);
                    i2 |= 8;
                    iR = iR;
                    str = str;
                    break;
                case 4:
                    str = str;
                    strC2 = rt1VarN.c0(serialDescriptor, 4);
                    i2 |= 16;
                    str = str;
                    break;
                case 5:
                    str = str;
                    iR = iR;
                    str3 = (String) rt1VarN.L(serialDescriptor, 5, o2a.a, str3);
                    i2 |= 32;
                    iR = iR;
                    str = str;
                    break;
                case 6:
                    str = str;
                    iR = rt1VarN.R(serialDescriptor, 6);
                    i2 |= 64;
                    str = str;
                    break;
                case 7:
                    str = str;
                    iR = iR;
                    l = (Long) rt1VarN.L(serialDescriptor, 7, ue6.a, l);
                    i2 |= 128;
                    iR = iR;
                    str = str;
                    break;
                case 8:
                    str = str;
                    strC0 = rt1VarN.c0(serialDescriptor, 8);
                    i2 |= 256;
                    str = str;
                    break;
                case 9:
                    str = str;
                    iR = iR;
                    gymTypeNetworkEntity = (GymTypeNetworkEntity) rt1VarN.L(serialDescriptor, 9, ss5VarArr[9].getValue(), gymTypeNetworkEntity);
                    i2 |= 512;
                    iR = iR;
                    str = str;
                    break;
                case 10:
                    str = str;
                    iR = iR;
                    gymNetworkEntity = (GymNetworkEntity) rt1VarN.L(serialDescriptor, 10, GymNetworkEntity$$serializer.INSTANCE, gymNetworkEntity);
                    i2 |= 1024;
                    iR = iR;
                    str = str;
                    break;
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    str = str;
                    iR = iR;
                    genderNetworkEntity = (GenderNetworkEntity) rt1VarN.L(serialDescriptor, 11, ss5VarArr[11].getValue(), genderNetworkEntity);
                    i2 |= AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    iR = iR;
                    str = str;
                    break;
                case 12:
                    str = str;
                    iR = iR;
                    weightUnitsNetworkEntity = (WeightUnitsNetworkEntity) rt1VarN.L(serialDescriptor, 12, ss5VarArr[12].getValue(), weightUnitsNetworkEntity);
                    i2 |= 4096;
                    iR = iR;
                    str = str;
                    break;
                case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    str = str;
                    iR = iR;
                    lengthUnitsNetworkEntity = (LengthUnitsNetworkEntity) rt1VarN.L(serialDescriptor, 13, ss5VarArr[13].getValue(), lengthUnitsNetworkEntity);
                    i2 |= 8192;
                    iR = iR;
                    str = str;
                    break;
                case 14:
                    str = str;
                    iR = iR;
                    bool = (Boolean) rt1VarN.L(serialDescriptor, 14, is0.a, bool);
                    i2 |= 16384;
                    iR = iR;
                    str = str;
                    break;
                case h4c.e /* 15 */:
                    bool2 = (Boolean) rt1VarN.L(serialDescriptor, 15, is0.a, bool2);
                    i = 32768;
                    i2 |= i;
                    iR = iR;
                    str = str;
                    break;
                case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                    appLanguageNetworkEntity = (AppLanguageNetworkEntity) rt1VarN.L(serialDescriptor, 16, ss5VarArr[16].getValue(), appLanguageNetworkEntity);
                    i = 65536;
                    i2 |= i;
                    iR = iR;
                    str = str;
                    break;
                default:
                    ll.a(iG0);
                    return null;
            }
        }
        WeightUnitsNetworkEntity weightUnitsNetworkEntity2 = weightUnitsNetworkEntity;
        rt1VarN.i(serialDescriptor);
        return new UserNetworkEntity(i2, iR2, strC1, str, str2, strC2, str3, iR, l, strC0, gymTypeNetworkEntity, gymNetworkEntity, genderNetworkEntity, weightUnitsNetworkEntity2, lengthUnitsNetworkEntity, bool, bool2, appLanguageNetworkEntity);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, UserNetworkEntity userNetworkEntity) {
        encoder.getClass();
        userNetworkEntity.getClass();
        AppLanguageNetworkEntity appLanguageNetworkEntity = userNetworkEntity.J;
        Boolean bool = userNetworkEntity.I;
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = UserNetworkEntity.K;
        int i = userNetworkEntity.t;
        Boolean bool2 = userNetworkEntity.H;
        LengthUnitsNetworkEntity lengthUnitsNetworkEntity = userNetworkEntity.G;
        WeightUnitsNetworkEntity weightUnitsNetworkEntity = userNetworkEntity.F;
        GenderNetworkEntity genderNetworkEntity = userNetworkEntity.E;
        GymNetworkEntity gymNetworkEntity = userNetworkEntity.D;
        GymTypeNetworkEntity gymTypeNetworkEntity = userNetworkEntity.C;
        Long l = userNetworkEntity.A;
        String str = userNetworkEntity.y;
        String str2 = userNetworkEntity.w;
        String str3 = userNetworkEntity.v;
        st1VarN.g(0, i, serialDescriptor);
        st1VarN.p(serialDescriptor, 1, userNetworkEntity.u);
        if (st1VarN.C(serialDescriptor) || str3 != null) {
            st1VarN.z(serialDescriptor, 2, o2a.a, str3);
        }
        if (st1VarN.C(serialDescriptor) || str2 != null) {
            st1VarN.z(serialDescriptor, 3, o2a.a, str2);
        }
        st1VarN.p(serialDescriptor, 4, userNetworkEntity.x);
        if (st1VarN.C(serialDescriptor) || str != null) {
            st1VarN.z(serialDescriptor, 5, o2a.a, str);
        }
        st1VarN.g(6, userNetworkEntity.z, serialDescriptor);
        if (st1VarN.C(serialDescriptor) || l != null) {
            st1VarN.z(serialDescriptor, 7, ue6.a, l);
        }
        st1VarN.p(serialDescriptor, 8, userNetworkEntity.B);
        if (st1VarN.C(serialDescriptor) || gymTypeNetworkEntity != null) {
            st1VarN.z(serialDescriptor, 9, ss5VarArr[9].getValue(), gymTypeNetworkEntity);
        }
        if (st1VarN.C(serialDescriptor) || gymNetworkEntity != null) {
            st1VarN.z(serialDescriptor, 10, GymNetworkEntity$$serializer.INSTANCE, gymNetworkEntity);
        }
        if (st1VarN.C(serialDescriptor) || genderNetworkEntity != null) {
            st1VarN.z(serialDescriptor, 11, ss5VarArr[11].getValue(), genderNetworkEntity);
        }
        if (st1VarN.C(serialDescriptor) || weightUnitsNetworkEntity != null) {
            st1VarN.z(serialDescriptor, 12, ss5VarArr[12].getValue(), weightUnitsNetworkEntity);
        }
        if (st1VarN.C(serialDescriptor) || lengthUnitsNetworkEntity != null) {
            st1VarN.z(serialDescriptor, 13, ss5VarArr[13].getValue(), lengthUnitsNetworkEntity);
        }
        if (st1VarN.C(serialDescriptor) || bool2 != null) {
            st1VarN.z(serialDescriptor, 14, is0.a, bool2);
        }
        if (st1VarN.C(serialDescriptor) || bool != null) {
            st1VarN.z(serialDescriptor, 15, is0.a, bool);
        }
        if (st1VarN.C(serialDescriptor) || appLanguageNetworkEntity != null) {
            st1VarN.z(serialDescriptor, 16, ss5VarArr[16].getValue(), appLanguageNetworkEntity);
        }
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
