package io.intercom.android.sdk.m5.shapes;

import defpackage.ay8;
import defpackage.dm7;
import defpackage.em7;
import defpackage.jl9;
import defpackage.qq2;
import defpackage.tk8;
import defpackage.tq5;
import defpackage.tx2;
import defpackage.u;
import defpackage.vp;
import defpackage.xp;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class CutIconWithIndicatorShape implements jl9 {
    public static final int $stable = 0;
    private final float indicatorSize;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[tq5.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CutIconWithIndicatorShape(float f, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? 8.0f : f, null);
    }

    /* JADX INFO: renamed from: getOffset-P-0qjgQ, reason: not valid java name */
    private final long m394getOffsetP0qjgQ(float f, float f2, tq5 tq5Var) {
        int i = WhenMappings.$EnumSwitchMapping$0[tq5Var.ordinal()];
        if (i == 1) {
            return (((long) Float.floatToRawIntBits(f - f2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        if (i == 2) {
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        u.b();
        return 0L;
    }

    @Override // defpackage.jl9
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public dm7 mo0createOutlinePq9zytI(long j, tq5 tq5Var, tx2 tx2Var) {
        tq5Var.getClass();
        tx2Var.getClass();
        float fU0 = tx2Var.U0(this.indicatorSize);
        vp vpVarA = xp.a();
        em7.a(vpVarA, new dm7.b(tk8.a(0L, j)));
        vp vpVarA2 = xp.a();
        em7.a(vpVarA2, ay8.a.mo0createOutlinePq9zytI((((long) Float.floatToRawIntBits(fU0)) << 32) | (((long) Float.floatToRawIntBits(fU0)) & 4294967295L), tq5Var, tx2Var));
        vp vpVarA3 = xp.a();
        vpVarA3.o(vpVarA2, m394getOffsetP0qjgQ(Float.intBitsToFloat((int) (j >> 32)), fU0, tq5Var));
        vp vpVarA4 = xp.a();
        vpVarA4.r(vpVarA, vpVarA3, 0);
        return new dm7.a(vpVarA4);
    }

    private CutIconWithIndicatorShape(float f) {
        this.indicatorSize = f;
    }

    public /* synthetic */ CutIconWithIndicatorShape(float f, qq2 qq2Var) {
        this(f);
    }
}
