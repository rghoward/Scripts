package io.intercom.android.sdk.m5.shapes;

import defpackage.dm7;
import defpackage.em7;
import defpackage.g2b;
import defpackage.jl9;
import defpackage.js7;
import defpackage.ph1;
import defpackage.qq2;
import defpackage.tq5;
import defpackage.tx2;
import defpackage.u;
import defpackage.vp;
import defpackage.xp;
import defpackage.y43;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class CutAvatarBoxShape implements jl9 {
    public static final int $stable = 0;
    private final float cut;
    private final List<js7<y43, y43>> cutsOffsets;
    private final jl9 shape;

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

    private CutAvatarBoxShape(jl9 jl9Var, float f, List<js7<y43, y43>> list) {
        jl9Var.getClass();
        list.getClass();
        this.shape = jl9Var;
        this.cut = f;
        this.cutsOffsets = list;
    }

    /* JADX INFO: renamed from: getOffset-Rc2DDho, reason: not valid java name */
    private final long m392getOffsetRc2DDho(float f, float f2, float f3, tq5 tq5Var) {
        int i = WhenMappings.$EnumSwitchMapping$0[tq5Var.ordinal()];
        if (i == 1) {
            return (((long) Float.floatToRawIntBits(f2 - f)) << 32) | (((long) Float.floatToRawIntBits(f3 - f)) & 4294967295L);
        }
        if (i == 2) {
            return (((long) Float.floatToRawIntBits((-f2) - f)) << 32) | (((long) Float.floatToRawIntBits(f3 - f)) & 4294967295L);
        }
        u.b();
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jl9
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public dm7 mo0createOutlinePq9zytI(long j, tq5 tq5Var, tx2 tx2Var) {
        tq5Var.getClass();
        tx2Var.getClass();
        float fU0 = tx2Var.U0(this.cut);
        vp vpVarA = xp.a();
        em7.a(vpVarA, this.shape.mo0createOutlinePq9zytI(j, tq5Var, tx2Var));
        vp vpVarA2 = xp.a();
        jl9 jl9Var = this.shape;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + fU0;
        em7.a(vpVarA2, jl9Var.mo0createOutlinePq9zytI((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + fU0)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), tq5Var, tx2Var));
        vp vpVarA3 = xp.a();
        List<js7<y43, y43>> list = this.cutsOffsets;
        ArrayList arrayList = new ArrayList(ph1.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            js7 js7Var = (js7) it.next();
            vpVarA3.o(vpVarA2, m392getOffsetRc2DDho(fU0 / 2.0f, tx2Var.U0(((y43) js7Var.t).t), tx2Var.U0(((y43) js7Var.u).t), tq5Var));
            arrayList.add(g2b.a);
        }
        vp vpVarA4 = xp.a();
        vpVarA4.r(vpVarA, vpVarA3, 0);
        return new dm7.a(vpVarA4);
    }

    public /* synthetic */ CutAvatarBoxShape(jl9 jl9Var, float f, List list, qq2 qq2Var) {
        this(jl9Var, f, list);
    }
}
