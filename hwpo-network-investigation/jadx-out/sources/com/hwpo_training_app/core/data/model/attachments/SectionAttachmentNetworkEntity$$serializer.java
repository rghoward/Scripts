package com.hwpo_training_app.core.data.model.attachments;

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
import defpackage.z97;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@gy2
public final /* synthetic */ class SectionAttachmentNetworkEntity$$serializer implements gk4<SectionAttachmentNetworkEntity> {
    public static final SectionAttachmentNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SectionAttachmentNetworkEntity$$serializer sectionAttachmentNetworkEntity$$serializer = new SectionAttachmentNetworkEntity$$serializer();
        INSTANCE = sectionAttachmentNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.core.data.model.attachments.SectionAttachmentNetworkEntity", sectionAttachmentNetworkEntity$$serializer, 12);
        o48Var.k("id", false);
        o48Var.k("title", false);
        o48Var.k("src", false);
        o48Var.k("thumb", false);
        o48Var.k("medium_thumb", true);
        o48Var.k("content_type", false);
        o48Var.k("stream_src", false);
        o48Var.k("video_id", true);
        o48Var.k("position", true);
        o48Var.k("type", false);
        o48Var.k("file_size", false);
        o48Var.k("file_size_raw", false);
        descriptor = o48Var;
    }

    private SectionAttachmentNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        ss5<KSerializer<Object>>[] ss5VarArr = SectionAttachmentNetworkEntity.F;
        ue6 ue6Var = ue6.a;
        o2a o2aVar = o2a.a;
        return new KSerializer[]{ue6Var, o2aVar, o2aVar, ry0.a(o2aVar), ry0.a(o2aVar), o2aVar, ry0.a(o2aVar), ry0.a(o2aVar), ry0.a(ig5.a), ss5VarArr[9].getValue(), ry0.a(o2aVar), ry0.a(ue6Var)};
    }

    @Override // defpackage.sy2
    public final SectionAttachmentNetworkEntity deserialize(Decoder decoder) {
        long jG;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = SectionAttachmentNetworkEntity.F;
        long j = 0;
        Long l = null;
        String str = null;
        AttachmentTypeNetworkEntity attachmentTypeNetworkEntity = null;
        boolean z = true;
        String str2 = null;
        Integer num = null;
        String str3 = null;
        int i = 0;
        String strC0 = null;
        String strC1 = null;
        String str4 = null;
        String str5 = null;
        String strC2 = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            switch (iG0) {
                case -1:
                    jG = j;
                    z = false;
                    j = jG;
                    break;
                case 0:
                    jG = rt1VarN.G(serialDescriptor, 0);
                    i |= 1;
                    z = z;
                    j = jG;
                    break;
                case 1:
                    strC0 = rt1VarN.c0(serialDescriptor, 1);
                    i |= 2;
                    z = z;
                    break;
                case 2:
                    strC1 = rt1VarN.c0(serialDescriptor, 2);
                    i |= 4;
                    z = z;
                    break;
                case 3:
                    jG = j;
                    str4 = (String) rt1VarN.L(serialDescriptor, 3, o2a.a, str4);
                    i |= 8;
                    z = z;
                    j = jG;
                    break;
                case 4:
                    jG = j;
                    str5 = (String) rt1VarN.L(serialDescriptor, 4, o2a.a, str5);
                    i |= 16;
                    z = z;
                    j = jG;
                    break;
                case 5:
                    strC2 = rt1VarN.c0(serialDescriptor, 5);
                    i |= 32;
                    z = z;
                    break;
                case 6:
                    jG = j;
                    str2 = (String) rt1VarN.L(serialDescriptor, 6, o2a.a, str2);
                    i |= 64;
                    z = z;
                    j = jG;
                    break;
                case 7:
                    jG = j;
                    str3 = (String) rt1VarN.L(serialDescriptor, 7, o2a.a, str3);
                    i |= 128;
                    z = z;
                    j = jG;
                    break;
                case 8:
                    jG = j;
                    num = (Integer) rt1VarN.L(serialDescriptor, 8, ig5.a, num);
                    i |= 256;
                    z = z;
                    j = jG;
                    break;
                case 9:
                    jG = j;
                    attachmentTypeNetworkEntity = (AttachmentTypeNetworkEntity) rt1VarN.J(serialDescriptor, 9, ss5VarArr[9].getValue(), attachmentTypeNetworkEntity);
                    i |= 512;
                    z = z;
                    j = jG;
                    break;
                case 10:
                    jG = j;
                    str = (String) rt1VarN.L(serialDescriptor, 10, o2a.a, str);
                    i |= 1024;
                    z = z;
                    j = jG;
                    break;
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    jG = j;
                    l = (Long) rt1VarN.L(serialDescriptor, 11, ue6.a, l);
                    i |= AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    z = z;
                    j = jG;
                    break;
                default:
                    ll.a(iG0);
                    return null;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new SectionAttachmentNetworkEntity(i, j, strC0, strC1, str4, str5, strC2, str2, str3, num, attachmentTypeNetworkEntity, str, l);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, SectionAttachmentNetworkEntity sectionAttachmentNetworkEntity) {
        encoder.getClass();
        sectionAttachmentNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = SectionAttachmentNetworkEntity.F;
        long j = sectionAttachmentNetworkEntity.t;
        Integer num = sectionAttachmentNetworkEntity.B;
        String str = sectionAttachmentNetworkEntity.A;
        String str2 = sectionAttachmentNetworkEntity.x;
        st1VarN.B(serialDescriptor, 0, j);
        st1VarN.p(serialDescriptor, 1, sectionAttachmentNetworkEntity.u);
        st1VarN.p(serialDescriptor, 2, sectionAttachmentNetworkEntity.v);
        o2a o2aVar = o2a.a;
        st1VarN.z(serialDescriptor, 3, o2aVar, sectionAttachmentNetworkEntity.w);
        if (st1VarN.C(serialDescriptor) || str2 != null) {
            st1VarN.z(serialDescriptor, 4, o2aVar, str2);
        }
        st1VarN.p(serialDescriptor, 5, sectionAttachmentNetworkEntity.y);
        st1VarN.z(serialDescriptor, 6, o2aVar, sectionAttachmentNetworkEntity.z);
        if (st1VarN.C(serialDescriptor) || str != null) {
            st1VarN.z(serialDescriptor, 7, o2aVar, str);
        }
        if (st1VarN.C(serialDescriptor) || num != null) {
            st1VarN.z(serialDescriptor, 8, ig5.a, num);
        }
        st1VarN.q(serialDescriptor, 9, ss5VarArr[9].getValue(), sectionAttachmentNetworkEntity.C);
        st1VarN.z(serialDescriptor, 10, o2aVar, sectionAttachmentNetworkEntity.D);
        st1VarN.z(serialDescriptor, 11, ue6.a, sectionAttachmentNetworkEntity.E);
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
