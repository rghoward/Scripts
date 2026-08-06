package com.hwpo_training_app.tracking.data.entity;

import com.hwpo_training_app.core.data.model.schedule.BenchmarkMeasureTypeNetworkEntity;
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
import defpackage.sk0;
import defpackage.ss5;
import defpackage.st1;
import defpackage.wm5;
import defpackage.z97;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@gy2
public final /* synthetic */ class TrackedValueNetworkEntity$$serializer implements gk4<TrackedValueNetworkEntity> {
    public static final TrackedValueNetworkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TrackedValueNetworkEntity$$serializer trackedValueNetworkEntity$$serializer = new TrackedValueNetworkEntity$$serializer();
        INSTANCE = trackedValueNetworkEntity$$serializer;
        o48 o48Var = new o48("com.hwpo_training_app.tracking.data.entity.TrackedValueNetworkEntity", trackedValueNetworkEntity$$serializer, 12);
        o48Var.k("id", false);
        o48Var.k("name", false);
        final String[] strArr = {"title"};
        wm5 wm5Var = new wm5() { // from class: com.hwpo_training_app.tracking.data.entity.TrackedValueNetworkEntity$$serializer.a
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return wm5.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return (obj instanceof wm5) && Arrays.equals(strArr, ((wm5) obj).names());
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return Arrays.hashCode(strArr) ^ 397397176;
            }

            @Override // defpackage.wm5
            public final /* synthetic */ String[] names() {
                return strArr;
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return sk0.c("@kotlinx.serialization.json.JsonNames(names=", Arrays.toString(strArr), ")");
            }
        };
        int i = o48Var.d;
        List<Annotation>[] listArr = o48Var.f;
        List<Annotation> arrayList = listArr[i];
        if (arrayList == null) {
            arrayList = new ArrayList<>(1);
            listArr[o48Var.d] = arrayList;
        }
        arrayList.add(wm5Var);
        o48Var.k("measure", false);
        o48Var.k("last_value", true);
        o48Var.k("second_value", true);
        o48Var.k("difference", true);
        o48Var.k("description", true);
        o48Var.k("units", false);
        o48Var.k("symbol", true);
        o48Var.k("progress", true);
        o48Var.k("rounds", true);
        o48Var.k("reps", true);
        descriptor = o48Var;
    }

    private TrackedValueNetworkEntity$$serializer() {
    }

    @Override // defpackage.gk4
    public final KSerializer<?>[] childSerializers() {
        ss5<KSerializer<Object>>[] ss5VarArr = TrackedValueNetworkEntity.m;
        ig5 ig5Var = ig5.a;
        o2a o2aVar = o2a.a;
        n43 n43Var = n43.a;
        return new KSerializer[]{ig5Var, o2aVar, ss5VarArr[2].getValue(), ry0.a(n43Var), ry0.a(n43Var), ry0.a(ss5VarArr[5].getValue()), ry0.a(o2aVar), n2b.a, ry0.a(o2aVar), ry0.a(ig5Var), ry0.a(ig5Var), ry0.a(ig5Var)};
    }

    @Override // defpackage.sy2
    public final TrackedValueNetworkEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        rt1 rt1VarN = decoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = TrackedValueNetworkEntity.m;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        String str = null;
        boolean z = true;
        UnitsNetworkEntity unitsNetworkEntity = null;
        int i = 0;
        int iR = 0;
        String strC0 = null;
        BenchmarkMeasureTypeNetworkEntity benchmarkMeasureTypeNetworkEntity = null;
        Double d = null;
        Double d2 = null;
        DifferenceNetworkEntity differenceNetworkEntity = null;
        String str2 = null;
        while (z) {
            int iG0 = rt1VarN.g0(serialDescriptor);
            switch (iG0) {
                case -1:
                    iR = iR;
                    z = false;
                    iR = iR;
                    break;
                case 0:
                    i |= 1;
                    iR = rt1VarN.R(serialDescriptor, 0);
                    z = z;
                    break;
                case 1:
                    strC0 = rt1VarN.c0(serialDescriptor, 1);
                    i |= 2;
                    z = z;
                    break;
                case 2:
                    benchmarkMeasureTypeNetworkEntity = (BenchmarkMeasureTypeNetworkEntity) rt1VarN.J(serialDescriptor, 2, ss5VarArr[2].getValue(), benchmarkMeasureTypeNetworkEntity);
                    i |= 4;
                    z = z;
                    iR = iR;
                    break;
                case 3:
                    d = (Double) rt1VarN.L(serialDescriptor, 3, n43.a, d);
                    i |= 8;
                    z = z;
                    iR = iR;
                    break;
                case 4:
                    d2 = (Double) rt1VarN.L(serialDescriptor, 4, n43.a, d2);
                    i |= 16;
                    z = z;
                    iR = iR;
                    break;
                case 5:
                    differenceNetworkEntity = (DifferenceNetworkEntity) rt1VarN.L(serialDescriptor, 5, ss5VarArr[5].getValue(), differenceNetworkEntity);
                    i |= 32;
                    z = z;
                    iR = iR;
                    break;
                case 6:
                    str2 = (String) rt1VarN.L(serialDescriptor, 6, o2a.a, str2);
                    i |= 64;
                    z = z;
                    iR = iR;
                    break;
                case 7:
                    unitsNetworkEntity = (UnitsNetworkEntity) rt1VarN.J(serialDescriptor, 7, n2b.a, unitsNetworkEntity);
                    i |= 128;
                    z = z;
                    iR = iR;
                    break;
                case 8:
                    str = (String) rt1VarN.L(serialDescriptor, 8, o2a.a, str);
                    i |= 256;
                    z = z;
                    iR = iR;
                    break;
                case 9:
                    num3 = (Integer) rt1VarN.L(serialDescriptor, 9, ig5.a, num3);
                    i |= 512;
                    z = z;
                    iR = iR;
                    break;
                case 10:
                    num2 = (Integer) rt1VarN.L(serialDescriptor, 10, ig5.a, num2);
                    i |= 1024;
                    z = z;
                    iR = iR;
                    break;
                case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    num = (Integer) rt1VarN.L(serialDescriptor, 11, ig5.a, num);
                    i |= AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    z = z;
                    iR = iR;
                    break;
                default:
                    ll.a(iG0);
                    return null;
            }
        }
        rt1VarN.i(serialDescriptor);
        return new TrackedValueNetworkEntity(i, iR, strC0, benchmarkMeasureTypeNetworkEntity, d, d2, differenceNetworkEntity, str2, unitsNetworkEntity, str, num3, num2, num);
    }

    @Override // defpackage.ud9, defpackage.sy2
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.ud9
    public final void serialize(Encoder encoder, TrackedValueNetworkEntity trackedValueNetworkEntity) {
        encoder.getClass();
        trackedValueNetworkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        st1 st1VarN = encoder.n(serialDescriptor);
        ss5<KSerializer<Object>>[] ss5VarArr = TrackedValueNetworkEntity.m;
        int i = trackedValueNetworkEntity.a;
        Integer num = trackedValueNetworkEntity.l;
        Integer num2 = trackedValueNetworkEntity.k;
        Integer num3 = trackedValueNetworkEntity.j;
        String str = trackedValueNetworkEntity.i;
        String str2 = trackedValueNetworkEntity.g;
        DifferenceNetworkEntity differenceNetworkEntity = trackedValueNetworkEntity.f;
        Double d = trackedValueNetworkEntity.e;
        Double d2 = trackedValueNetworkEntity.d;
        st1VarN.g(0, i, serialDescriptor);
        st1VarN.p(serialDescriptor, 1, trackedValueNetworkEntity.b);
        st1VarN.q(serialDescriptor, 2, ss5VarArr[2].getValue(), trackedValueNetworkEntity.c);
        if (st1VarN.C(serialDescriptor) || d2 != null) {
            st1VarN.z(serialDescriptor, 3, n43.a, d2);
        }
        if (st1VarN.C(serialDescriptor) || d != null) {
            st1VarN.z(serialDescriptor, 4, n43.a, d);
        }
        if (st1VarN.C(serialDescriptor) || differenceNetworkEntity != null) {
            st1VarN.z(serialDescriptor, 5, ss5VarArr[5].getValue(), differenceNetworkEntity);
        }
        if (st1VarN.C(serialDescriptor) || str2 != null) {
            st1VarN.z(serialDescriptor, 6, o2a.a, str2);
        }
        st1VarN.q(serialDescriptor, 7, n2b.a, trackedValueNetworkEntity.h);
        if (st1VarN.C(serialDescriptor) || str != null) {
            st1VarN.z(serialDescriptor, 8, o2a.a, str);
        }
        if (st1VarN.C(serialDescriptor) || num3 != null) {
            st1VarN.z(serialDescriptor, 9, ig5.a, num3);
        }
        if (st1VarN.C(serialDescriptor) || num2 != null) {
            st1VarN.z(serialDescriptor, 10, ig5.a, num2);
        }
        if (st1VarN.C(serialDescriptor) || num != null) {
            st1VarN.z(serialDescriptor, 11, ig5.a, num);
        }
        st1VarN.i(serialDescriptor);
    }

    @Override // defpackage.gk4
    public /* bridge */ KSerializer<?>[] typeParametersSerializers() {
        return p48.t;
    }
}
