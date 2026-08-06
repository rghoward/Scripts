package defpackage;

import com.hwpo_training_app.core.data.model.schedule.BenchmarkMeasureTypeNetworkEntity;
import com.hwpo_training_app.core.data.model.schedule.UnitsNetworkEntity;
import com.hwpo_training_app.tracking.data.entity.DifferenceNetworkEntity;
import com.hwpo_training_app.tracking.data.entity.TrackedValueNetworkEntity;
import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class cg5 {
    public static final osa a(TrackedValueNetworkEntity trackedValueNetworkEntity, ebb ebbVar) {
        trackedValueNetworkEntity.getClass();
        String str = trackedValueNetworkEntity.i;
        Double d = trackedValueNetworkEntity.d;
        UnitsNetworkEntity unitsNetworkEntity = trackedValueNetworkEntity.h;
        DifferenceNetworkEntity differenceNetworkEntity = trackedValueNetworkEntity.f;
        BenchmarkMeasureTypeNetworkEntity benchmarkMeasureTypeNetworkEntity = trackedValueNetworkEntity.c;
        ebbVar.getClass();
        int iOrdinal = ebbVar.ordinal();
        if (iOrdinal == 0) {
            int i = trackedValueNetworkEntity.a;
            String str2 = trackedValueNetworkEntity.b;
            xn0 xn0VarA = benchmarkMeasureTypeNetworkEntity.a();
            if (d == null) {
                z90.a("Required value was null.");
                return null;
            }
            double dDoubleValue = d.doubleValue();
            n03 n03VarA = differenceNetworkEntity != null ? differenceNetworkEntity.a() : null;
            m2b m2bVarA = unitsNetworkEntity.a();
            if (str != null) {
                return new co0(i, str2, xn0VarA, dDoubleValue, n03VarA, m2bVarA, str, trackedValueNetworkEntity.j);
            }
            z90.a("Required value was null.");
            return null;
        }
        if (iOrdinal == 1) {
            int i2 = trackedValueNetworkEntity.a;
            String str3 = trackedValueNetworkEntity.b;
            xn0 xn0VarA2 = benchmarkMeasureTypeNetworkEntity.a();
            if (d == null) {
                z90.a("Required value was null.");
                return null;
            }
            double dDoubleValue2 = d.doubleValue();
            n03 n03VarA2 = differenceNetworkEntity != null ? differenceNetworkEntity.a() : null;
            m2b m2bVarA2 = unitsNetworkEntity.a();
            if (str != null) {
                return new qr0(i2, str3, xn0VarA2, dDoubleValue2, trackedValueNetworkEntity.e, n03VarA2, m2bVarA2, str, trackedValueNetworkEntity.j);
            }
            z90.a("Required value was null.");
            return null;
        }
        if (iOrdinal != 2) {
            u.b();
            return null;
        }
        int i3 = trackedValueNetworkEntity.a;
        String str4 = trackedValueNetworkEntity.b;
        xn0 xn0VarA3 = benchmarkMeasureTypeNetworkEntity.a();
        Double d2 = trackedValueNetworkEntity.d;
        n03 n03VarA3 = differenceNetworkEntity != null ? differenceNetworkEntity.a() : null;
        m2b m2bVarA3 = unitsNetworkEntity.a();
        String str5 = trackedValueNetworkEntity.i;
        Integer num = trackedValueNetworkEntity.j;
        Integer num2 = trackedValueNetworkEntity.k;
        Integer num3 = trackedValueNetworkEntity.l;
        String str6 = trackedValueNetworkEntity.g;
        if (str6 == null) {
            str6 = BuildConfig.FLAVOR;
        }
        return new g81(i3, str4, xn0VarA3, d2, n03VarA3, m2bVarA3, str5, num, num2, num3, str6);
    }

    public static final long b(long j, long j2) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    public static final long c(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }
}
