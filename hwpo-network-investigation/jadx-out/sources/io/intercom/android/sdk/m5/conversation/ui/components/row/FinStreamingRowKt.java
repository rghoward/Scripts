package io.intercom.android.sdk.m5.conversation.ui.components.row;

import defpackage.a30;
import defpackage.aj1;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.cz1;
import defpackage.di;
import defpackage.dv0;
import defpackage.eo7;
import defpackage.fl6;
import defpackage.g2b;
import defpackage.go7;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.h37;
import defpackage.hi1;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.l07;
import defpackage.ml5;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.ph1;
import defpackage.qr5;
import defpackage.qu1;
import defpackage.rd7;
import defpackage.ria;
import defpackage.tx2;
import defpackage.uh1;
import defpackage.uma;
import defpackage.v5a;
import defpackage.ws0;
import defpackage.xj8;
import defpackage.yi1;
import defpackage.z63;
import defpackage.zy3;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.ui.components.row.FinStreamingRowKt;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Metadata;
import io.intercom.android.sdk.models.StreamingPart;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockRenderTextStyle;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class FinStreamingRowKt {
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:61:0x0107  */
    /* JADX WARN: Code duplicated, block: B:65:0x0148  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    public static final void FinStreamingBlock(final BlockRenderData blockRenderData, ox6 ox6Var, boolean z, jt1 jt1Var, final int i, final int i2) {
        BlockRenderData blockRenderData2;
        int i3;
        ox6 ox6Var2;
        int i4;
        boolean z2;
        int i5;
        ox6 ox6Var3;
        final boolean z3;
        Object objF;
        jt1.a.C0187a c0187a;
        final h37 h37Var;
        final float fFloatValue;
        final float fFloatValue2;
        boolean z4;
        boolean zG;
        Object objF2;
        Object objF3;
        bj4 bj4Var;
        final ox6 ox6Var4;
        final boolean z5;
        xj8 xj8VarW;
        blockRenderData.getClass();
        bj4 bj4VarO = jt1Var.o(1420678116);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            blockRenderData2 = blockRenderData;
        } else {
            blockRenderData2 = blockRenderData;
            if ((i & 6) == 0) {
                i3 = (bj4VarO.j(blockRenderData2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    if (bj4VarO.c(z2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i3 & 147) == 146 || !bj4VarO.r()) {
                    if (i6 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    bj4VarO.K(-382486785);
                    objF = bj4VarO.f();
                    c0187a = jt1.a.a;
                    if (objF == c0187a) {
                        objF = bl7.i(null);
                        bj4VarO.C(objF);
                    }
                    h37Var = (h37) objF;
                    bj4VarO.U(false);
                    tx2 tx2Var = (tx2) bj4VarO.F(qu1.h);
                    Float fValueOf = Float.valueOf(tx2Var.N0() * tx2Var.U0(3.0f));
                    Float fValueOf2 = Float.valueOf(tx2Var.N0() * tx2Var.U0(12.0f));
                    fFloatValue = fValueOf.floatValue();
                    fFloatValue2 = fValueOf2.floatValue();
                    bj4VarO.K(-382476587);
                    if ((i3 & 896) == 256) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zG = z4 | bj4VarO.g(fFloatValue2) | bj4VarO.g(fFloatValue);
                    objF2 = bj4VarO.f();
                    if (zG || objF2 == c0187a) {
                        objF2 = new oh4() { // from class: tz3
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return FinStreamingRowKt.FinStreamingBlock$lambda$6$lambda$5(z3, h37Var, fFloatValue2, fFloatValue, (cz1) obj);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    ox6 ox6VarE = z63.e(ox6Var3, (oh4) objF2);
                    bj4VarO.K(-382442246);
                    objF3 = bj4VarO.f();
                    if (objF3 == c0187a) {
                        objF3 = new oh4() { // from class: uz3
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return FinStreamingRowKt.FinStreamingBlock$lambda$8$lambda$7(h37Var, (ria) obj);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    bj4Var = bj4VarO;
                    BlockViewKt.m426BlockViewOkTjGUA(ox6VarE, blockRenderData2, false, null, false, null, null, 0L, null, null, false, null, (oh4) objF3, bj4Var, (i3 << 3) & 112, 384, 4092);
                    ox6Var4 = ox6Var3;
                    z5 = z3;
                } else {
                    bj4VarO.u();
                    bj4Var = bj4VarO;
                    ox6Var4 = ox6Var2;
                    z5 = z2;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: vz3
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            ox6 ox6Var5 = ox6Var4;
                            return FinStreamingRowKt.FinStreamingBlock$lambda$9(blockRenderData, ox6Var5, z5, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i3 & 147) == 146) {
                if (i6 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                bj4VarO.K(-382486785);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = bl7.i(null);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                bj4VarO.U(false);
                tx2 tx2Var2 = (tx2) bj4VarO.F(qu1.h);
                Float fValueOf3 = Float.valueOf(tx2Var2.N0() * tx2Var2.U0(3.0f));
                Float fValueOf4 = Float.valueOf(tx2Var2.N0() * tx2Var2.U0(12.0f));
                fFloatValue = fValueOf3.floatValue();
                fFloatValue2 = fValueOf4.floatValue();
                bj4VarO.K(-382476587);
                if ((i3 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zG = z4 | bj4VarO.g(fFloatValue2) | bj4VarO.g(fFloatValue);
                objF2 = bj4VarO.f();
                if (zG) {
                    objF2 = new oh4() { // from class: tz3
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return FinStreamingRowKt.FinStreamingBlock$lambda$6$lambda$5(z3, h37Var, fFloatValue2, fFloatValue, (cz1) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new oh4() { // from class: tz3
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return FinStreamingRowKt.FinStreamingBlock$lambda$6$lambda$5(z3, h37Var, fFloatValue2, fFloatValue, (cz1) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                ox6 ox6VarE2 = z63.e(ox6Var3, (oh4) objF2);
                bj4VarO.K(-382442246);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = new oh4() { // from class: uz3
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return FinStreamingRowKt.FinStreamingBlock$lambda$8$lambda$7(h37Var, (ria) obj);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                bj4Var = bj4VarO;
                BlockViewKt.m426BlockViewOkTjGUA(ox6VarE2, blockRenderData2, false, null, false, null, null, 0L, null, null, false, null, (oh4) objF3, bj4Var, (i3 << 3) & 112, 384, 4092);
                ox6Var4 = ox6Var3;
                z5 = z3;
            } else {
                if (i6 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                bj4VarO.K(-382486785);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = bl7.i(null);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                bj4VarO.U(false);
                tx2 tx2Var3 = (tx2) bj4VarO.F(qu1.h);
                Float fValueOf5 = Float.valueOf(tx2Var3.N0() * tx2Var3.U0(3.0f));
                Float fValueOf6 = Float.valueOf(tx2Var3.N0() * tx2Var3.U0(12.0f));
                fFloatValue = fValueOf5.floatValue();
                fFloatValue2 = fValueOf6.floatValue();
                bj4VarO.K(-382476587);
                if ((i3 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zG = z4 | bj4VarO.g(fFloatValue2) | bj4VarO.g(fFloatValue);
                objF2 = bj4VarO.f();
                if (zG) {
                    objF2 = new oh4() { // from class: tz3
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return FinStreamingRowKt.FinStreamingBlock$lambda$6$lambda$5(z3, h37Var, fFloatValue2, fFloatValue, (cz1) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new oh4() { // from class: tz3
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return FinStreamingRowKt.FinStreamingBlock$lambda$6$lambda$5(z3, h37Var, fFloatValue2, fFloatValue, (cz1) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                ox6 ox6VarE3 = z63.e(ox6Var3, (oh4) objF2);
                bj4VarO.K(-382442246);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = new oh4() { // from class: uz3
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return FinStreamingRowKt.FinStreamingBlock$lambda$8$lambda$7(h37Var, (ria) obj);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                bj4Var = bj4VarO;
                BlockViewKt.m426BlockViewOkTjGUA(ox6VarE3, blockRenderData2, false, null, false, null, null, 0L, null, null, false, null, (oh4) objF3, bj4Var, (i3 << 3) & 112, 384, 4092);
                ox6Var4 = ox6Var3;
                z5 = z3;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: vz3
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        ox6 ox6Var5 = ox6Var4;
                        return FinStreamingRowKt.FinStreamingBlock$lambda$9(blockRenderData, ox6Var5, z5, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        ox6Var2 = ox6Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                z2 = z;
                if (bj4VarO.c(z2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i3 & 147) == 146) {
                if (i6 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                bj4VarO.K(-382486785);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = bl7.i(null);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                bj4VarO.U(false);
                tx2 tx2Var4 = (tx2) bj4VarO.F(qu1.h);
                Float fValueOf7 = Float.valueOf(tx2Var4.N0() * tx2Var4.U0(3.0f));
                Float fValueOf8 = Float.valueOf(tx2Var4.N0() * tx2Var4.U0(12.0f));
                fFloatValue = fValueOf7.floatValue();
                fFloatValue2 = fValueOf8.floatValue();
                bj4VarO.K(-382476587);
                if ((i3 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zG = z4 | bj4VarO.g(fFloatValue2) | bj4VarO.g(fFloatValue);
                objF2 = bj4VarO.f();
                if (zG) {
                    objF2 = new oh4() { // from class: tz3
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return FinStreamingRowKt.FinStreamingBlock$lambda$6$lambda$5(z3, h37Var, fFloatValue2, fFloatValue, (cz1) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new oh4() { // from class: tz3
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return FinStreamingRowKt.FinStreamingBlock$lambda$6$lambda$5(z3, h37Var, fFloatValue2, fFloatValue, (cz1) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                ox6 ox6VarE4 = z63.e(ox6Var3, (oh4) objF2);
                bj4VarO.K(-382442246);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = new oh4() { // from class: uz3
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return FinStreamingRowKt.FinStreamingBlock$lambda$8$lambda$7(h37Var, (ria) obj);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                bj4Var = bj4VarO;
                BlockViewKt.m426BlockViewOkTjGUA(ox6VarE4, blockRenderData2, false, null, false, null, null, 0L, null, null, false, null, (oh4) objF3, bj4Var, (i3 << 3) & 112, 384, 4092);
                ox6Var4 = ox6Var3;
                z5 = z3;
            } else {
                if (i6 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                bj4VarO.K(-382486785);
                objF = bj4VarO.f();
                c0187a = jt1.a.a;
                if (objF == c0187a) {
                    objF = bl7.i(null);
                    bj4VarO.C(objF);
                }
                h37Var = (h37) objF;
                bj4VarO.U(false);
                tx2 tx2Var5 = (tx2) bj4VarO.F(qu1.h);
                Float fValueOf9 = Float.valueOf(tx2Var5.N0() * tx2Var5.U0(3.0f));
                Float fValueOf10 = Float.valueOf(tx2Var5.N0() * tx2Var5.U0(12.0f));
                fFloatValue = fValueOf9.floatValue();
                fFloatValue2 = fValueOf10.floatValue();
                bj4VarO.K(-382476587);
                if ((i3 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zG = z4 | bj4VarO.g(fFloatValue2) | bj4VarO.g(fFloatValue);
                objF2 = bj4VarO.f();
                if (zG) {
                    objF2 = new oh4() { // from class: tz3
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return FinStreamingRowKt.FinStreamingBlock$lambda$6$lambda$5(z3, h37Var, fFloatValue2, fFloatValue, (cz1) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new oh4() { // from class: tz3
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return FinStreamingRowKt.FinStreamingBlock$lambda$6$lambda$5(z3, h37Var, fFloatValue2, fFloatValue, (cz1) obj);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                ox6 ox6VarE5 = z63.e(ox6Var3, (oh4) objF2);
                bj4VarO.K(-382442246);
                objF3 = bj4VarO.f();
                if (objF3 == c0187a) {
                    objF3 = new oh4() { // from class: uz3
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return FinStreamingRowKt.FinStreamingBlock$lambda$8$lambda$7(h37Var, (ria) obj);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                bj4Var = bj4VarO;
                BlockViewKt.m426BlockViewOkTjGUA(ox6VarE5, blockRenderData2, false, null, false, null, null, 0L, null, null, false, null, (oh4) objF3, bj4Var, (i3 << 3) & 112, 384, 4092);
                ox6Var4 = ox6Var3;
                z5 = z3;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: vz3
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        ox6 ox6Var5 = ox6Var4;
                        return FinStreamingRowKt.FinStreamingBlock$lambda$9(blockRenderData, ox6Var5, z5, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i3 & 147) == 146) {
            if (i6 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            if (i4 != 0) {
                z3 = false;
            } else {
                z3 = z2;
            }
            bj4VarO.K(-382486785);
            objF = bj4VarO.f();
            c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = bl7.i(null);
                bj4VarO.C(objF);
            }
            h37Var = (h37) objF;
            bj4VarO.U(false);
            tx2 tx2Var6 = (tx2) bj4VarO.F(qu1.h);
            Float fValueOf11 = Float.valueOf(tx2Var6.N0() * tx2Var6.U0(3.0f));
            Float fValueOf12 = Float.valueOf(tx2Var6.N0() * tx2Var6.U0(12.0f));
            fFloatValue = fValueOf11.floatValue();
            fFloatValue2 = fValueOf12.floatValue();
            bj4VarO.K(-382476587);
            if ((i3 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            zG = z4 | bj4VarO.g(fFloatValue2) | bj4VarO.g(fFloatValue);
            objF2 = bj4VarO.f();
            if (zG) {
                objF2 = new oh4() { // from class: tz3
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return FinStreamingRowKt.FinStreamingBlock$lambda$6$lambda$5(z3, h37Var, fFloatValue2, fFloatValue, (cz1) obj);
                    }
                };
                bj4VarO.C(objF2);
            } else {
                objF2 = new oh4() { // from class: tz3
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return FinStreamingRowKt.FinStreamingBlock$lambda$6$lambda$5(z3, h37Var, fFloatValue2, fFloatValue, (cz1) obj);
                    }
                };
                bj4VarO.C(objF2);
            }
            bj4VarO.U(false);
            ox6 ox6VarE6 = z63.e(ox6Var3, (oh4) objF2);
            bj4VarO.K(-382442246);
            objF3 = bj4VarO.f();
            if (objF3 == c0187a) {
                objF3 = new oh4() { // from class: uz3
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return FinStreamingRowKt.FinStreamingBlock$lambda$8$lambda$7(h37Var, (ria) obj);
                    }
                };
                bj4VarO.C(objF3);
            }
            bj4VarO.U(false);
            bj4Var = bj4VarO;
            BlockViewKt.m426BlockViewOkTjGUA(ox6VarE6, blockRenderData2, false, null, false, null, null, 0L, null, null, false, null, (oh4) objF3, bj4Var, (i3 << 3) & 112, 384, 4092);
            ox6Var4 = ox6Var3;
            z5 = z3;
        } else {
            if (i6 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            if (i4 != 0) {
                z3 = false;
            } else {
                z3 = z2;
            }
            bj4VarO.K(-382486785);
            objF = bj4VarO.f();
            c0187a = jt1.a.a;
            if (objF == c0187a) {
                objF = bl7.i(null);
                bj4VarO.C(objF);
            }
            h37Var = (h37) objF;
            bj4VarO.U(false);
            tx2 tx2Var7 = (tx2) bj4VarO.F(qu1.h);
            Float fValueOf13 = Float.valueOf(tx2Var7.N0() * tx2Var7.U0(3.0f));
            Float fValueOf14 = Float.valueOf(tx2Var7.N0() * tx2Var7.U0(12.0f));
            fFloatValue = fValueOf13.floatValue();
            fFloatValue2 = fValueOf14.floatValue();
            bj4VarO.K(-382476587);
            if ((i3 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            zG = z4 | bj4VarO.g(fFloatValue2) | bj4VarO.g(fFloatValue);
            objF2 = bj4VarO.f();
            if (zG) {
                objF2 = new oh4() { // from class: tz3
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return FinStreamingRowKt.FinStreamingBlock$lambda$6$lambda$5(z3, h37Var, fFloatValue2, fFloatValue, (cz1) obj);
                    }
                };
                bj4VarO.C(objF2);
            } else {
                objF2 = new oh4() { // from class: tz3
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return FinStreamingRowKt.FinStreamingBlock$lambda$6$lambda$5(z3, h37Var, fFloatValue2, fFloatValue, (cz1) obj);
                    }
                };
                bj4VarO.C(objF2);
            }
            bj4VarO.U(false);
            ox6 ox6VarE7 = z63.e(ox6Var3, (oh4) objF2);
            bj4VarO.K(-382442246);
            objF3 = bj4VarO.f();
            if (objF3 == c0187a) {
                objF3 = new oh4() { // from class: uz3
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return FinStreamingRowKt.FinStreamingBlock$lambda$8$lambda$7(h37Var, (ria) obj);
                    }
                };
                bj4VarO.C(objF3);
            }
            bj4VarO.U(false);
            bj4Var = bj4VarO;
            BlockViewKt.m426BlockViewOkTjGUA(ox6VarE7, blockRenderData2, false, null, false, null, null, 0L, null, null, false, null, (oh4) objF3, bj4Var, (i3 << 3) & 112, 384, 4092);
            ox6Var4 = ox6Var3;
            z5 = z3;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: vz3
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    ox6 ox6Var5 = ox6Var4;
                    return FinStreamingRowKt.FinStreamingBlock$lambda$9(blockRenderData, ox6Var5, z5, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final g2b FinStreamingBlock$lambda$6$lambda$5(boolean z, h37 h37Var, float f, float f2, cz1 cz1Var) {
        ria riaVar;
        cz1Var.getClass();
        cz1Var.K1();
        if (z && (riaVar = (ria) h37Var.getValue()) != null) {
            l07 l07Var = riaVar.b;
            int i = l07Var.f - 1;
            float fB = l07Var.b(i) - l07Var.f(i);
            cz1Var.S0(uh1.b, (((long) Float.floatToRawIntBits(riaVar.f(i) + 12.0f)) << 32) | (((long) Float.floatToRawIntBits(((fB / 2.0f) - (f / 2.0f)) + l07Var.f(i))) & 4294967295L), (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32), (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), zy3.a);
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FinStreamingBlock$lambda$8$lambda$7(h37 h37Var, ria riaVar) {
        riaVar.getClass();
        h37Var.setValue(riaVar);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FinStreamingBlock$lambda$9(BlockRenderData blockRenderData, ox6 ox6Var, boolean z, int i, int i2, jt1 jt1Var, int i3) {
        FinStreamingBlock(blockRenderData, ox6Var, z, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:52:0x010c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0116  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    public static final void FinStreamingRow(final List<? extends Block> list, final StreamingPart streamingPart, ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        ox6 ox6Var2;
        ox6 ox6Var3;
        final FinRowStyle finRowStyle;
        fl6 fl6VarD;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar;
        final ox6 ox6Var4;
        xj8 xj8VarW;
        list.getClass();
        streamingPart.getClass();
        bj4 bj4VarO = jt1Var.o(-918532595);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.j(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(streamingPart) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !bj4VarO.r()) {
                if (i4 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                finRowStyle = FinAnswerRowKt.getFinRowStyle(GroupingPosition.STANDALONE, bj4VarO, 6);
                ox6 ox6VarH = eo7.h(ox6Var3, finRowStyle.getRowPadding());
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarH);
                bt1.c.getClass();
                aVar = bt1.a.b;
                if (bj4VarO.a == null) {
                    ml5.c();
                    throw null;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, fl6VarD);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                v5a.a(null, finRowStyle.getBubbleStyle().getShape(), finRowStyle.getBubbleStyle().m283getColor0d7_KjU(), 0L, 0.0f, 0.0f, finRowStyle.getBubbleStyle().getBorderStroke(), gr1.b(610304332, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.FinStreamingRowKt$FinStreamingRow$1$1
                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(jt1 jt1Var2, int i5) {
                        int i6;
                        jt1 jt1Var3 = jt1Var2;
                        if ((i5 & 3) == 2 && jt1Var3.r()) {
                            jt1Var3.u();
                            return;
                        }
                        go7 padding = finRowStyle.getBubbleStyle().getPadding();
                        ox6.a aVar2 = ox6.a.t;
                        ox6 ox6VarH2 = eo7.h(aVar2, padding);
                        c30.h hVar = new c30.h(16.0f, true, new a30());
                        StreamingPart streamingPart2 = streamingPart;
                        List<Block> list2 = list;
                        FinRowStyle finRowStyle2 = finRowStyle;
                        aj1 aj1VarA = yi1.a(hVar, di.a.m, jt1Var3, 6);
                        int iHashCode2 = Long.hashCode(jt1Var3.v());
                        kw7 kw7VarY = jt1Var3.y();
                        ox6 ox6VarC2 = it1.c(jt1Var3, ox6VarH2);
                        bt1.c.getClass();
                        qr5.a aVar3 = bt1.a.b;
                        if (jt1Var3.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var3.q();
                        if (jt1Var3.l()) {
                            jt1Var3.k(aVar3);
                        } else {
                            jt1Var3.z();
                        }
                        rd7.d(jt1Var3, bt1.a.f, aj1VarA);
                        rd7.d(jt1Var3, bt1.a.e, kw7VarY);
                        rd7.d(jt1Var3, bt1.a.g, Integer.valueOf(iHashCode2));
                        rd7.c(jt1Var3, bt1.a.h);
                        rd7.d(jt1Var3, bt1.a.d, ox6VarC2);
                        Metadata metadata = streamingPart2.getMetadata();
                        jt1Var3.K(-989627254);
                        if (metadata == null) {
                            i6 = 0;
                        } else {
                            List<Avatar> avatars = metadata.getAvatars();
                            ArrayList arrayList = new ArrayList(ph1.n(avatars, 10));
                            Iterator<T> it = avatars.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new AvatarWrapper((Avatar) it.next(), false, 2, null));
                            }
                            i6 = 0;
                            FinAnswerRowKt.FinAnswerMetadata(arrayList, metadata.getTitle(), null, metadata.getSuffix(), metadata.getTimestamp(), null, false, null, jt1Var2, 196608, 196);
                            jt1Var3 = jt1Var2;
                        }
                        jt1Var3.B();
                        jt1Var3.K(-989612763);
                        int i7 = i6;
                        for (Object obj : list2) {
                            int i8 = i7 + 1;
                            if (i7 < 0) {
                                ws0.m();
                                throw null;
                            }
                            FinStreamingRowKt.FinStreamingBlock(new BlockRenderData((Block) obj, new uh1(hi1.b(finRowStyle2.getBubbleStyle().m283getColor0d7_KjU(), jt1Var3)), null, null, BlockRenderTextStyle.m414copyZsBm6Y$default(BlockRenderTextStyle.Companion.getParagraphDefault(), 0L, null, 0L, null, new uh1(IntercomTheme.INSTANCE.getColors(jt1Var3, IntercomTheme.$stable).m752getActionContrastWhite0d7_KjU()), null, 47, null), 12, null), uma.a(aVar2, finRowStyle2.getContentShape()), i7 == list2.size() - 1 ? 1 : i6, jt1Var3, 0, 0);
                            jt1Var3 = jt1Var2;
                            i7 = i8;
                        }
                        jt1Var2.B();
                        jt1Var2.I();
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4VarO, 12582912, 57);
                bj4VarO.U(true);
                ox6Var4 = ox6Var3;
            } else {
                bj4VarO.u();
                ox6Var4 = ox6Var2;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: wz3
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return FinStreamingRowKt.FinStreamingRow$lambda$1(list, streamingPart, ox6Var4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        ox6Var2 = ox6Var;
        if ((i3 & 147) == 146) {
            if (i4 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            finRowStyle = FinAnswerRowKt.getFinRowStyle(GroupingPosition.STANDALONE, bj4VarO, 6);
            ox6 ox6VarH2 = eo7.h(ox6Var3, finRowStyle.getRowPadding());
            fl6VarD = dv0.d(di.a.a, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarH2);
            bt1.c.getClass();
            aVar = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, fl6VarD);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            v5a.a(null, finRowStyle.getBubbleStyle().getShape(), finRowStyle.getBubbleStyle().m283getColor0d7_KjU(), 0L, 0.0f, 0.0f, finRowStyle.getBubbleStyle().getBorderStroke(), gr1.b(610304332, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.FinStreamingRowKt$FinStreamingRow$1$1
                /* JADX WARN: Multi-variable type inference failed */
                public final void invoke(jt1 jt1Var2, int i5) {
                    int i6;
                    jt1 jt1Var3 = jt1Var2;
                    if ((i5 & 3) == 2 && jt1Var3.r()) {
                        jt1Var3.u();
                        return;
                    }
                    go7 padding = finRowStyle.getBubbleStyle().getPadding();
                    ox6.a aVar2 = ox6.a.t;
                    ox6 ox6VarH3 = eo7.h(aVar2, padding);
                    c30.h hVar = new c30.h(16.0f, true, new a30());
                    StreamingPart streamingPart2 = streamingPart;
                    List<Block> list2 = list;
                    FinRowStyle finRowStyle2 = finRowStyle;
                    aj1 aj1VarA = yi1.a(hVar, di.a.m, jt1Var3, 6);
                    int iHashCode2 = Long.hashCode(jt1Var3.v());
                    kw7 kw7VarY = jt1Var3.y();
                    ox6 ox6VarC2 = it1.c(jt1Var3, ox6VarH3);
                    bt1.c.getClass();
                    qr5.a aVar3 = bt1.a.b;
                    if (jt1Var3.s() == null) {
                        ml5.c();
                        throw null;
                    }
                    jt1Var3.q();
                    if (jt1Var3.l()) {
                        jt1Var3.k(aVar3);
                    } else {
                        jt1Var3.z();
                    }
                    rd7.d(jt1Var3, bt1.a.f, aj1VarA);
                    rd7.d(jt1Var3, bt1.a.e, kw7VarY);
                    rd7.d(jt1Var3, bt1.a.g, Integer.valueOf(iHashCode2));
                    rd7.c(jt1Var3, bt1.a.h);
                    rd7.d(jt1Var3, bt1.a.d, ox6VarC2);
                    Metadata metadata = streamingPart2.getMetadata();
                    jt1Var3.K(-989627254);
                    if (metadata == null) {
                        i6 = 0;
                    } else {
                        List<Avatar> avatars = metadata.getAvatars();
                        ArrayList arrayList = new ArrayList(ph1.n(avatars, 10));
                        Iterator<T> it = avatars.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new AvatarWrapper((Avatar) it.next(), false, 2, null));
                        }
                        i6 = 0;
                        FinAnswerRowKt.FinAnswerMetadata(arrayList, metadata.getTitle(), null, metadata.getSuffix(), metadata.getTimestamp(), null, false, null, jt1Var2, 196608, 196);
                        jt1Var3 = jt1Var2;
                    }
                    jt1Var3.B();
                    jt1Var3.K(-989612763);
                    int i7 = i6;
                    for (Object obj : list2) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            ws0.m();
                            throw null;
                        }
                        FinStreamingRowKt.FinStreamingBlock(new BlockRenderData((Block) obj, new uh1(hi1.b(finRowStyle2.getBubbleStyle().m283getColor0d7_KjU(), jt1Var3)), null, null, BlockRenderTextStyle.m414copyZsBm6Y$default(BlockRenderTextStyle.Companion.getParagraphDefault(), 0L, null, 0L, null, new uh1(IntercomTheme.INSTANCE.getColors(jt1Var3, IntercomTheme.$stable).m752getActionContrastWhite0d7_KjU()), null, 47, null), 12, null), uma.a(aVar2, finRowStyle2.getContentShape()), i7 == list2.size() - 1 ? 1 : i6, jt1Var3, 0, 0);
                        jt1Var3 = jt1Var2;
                        i7 = i8;
                    }
                    jt1Var2.B();
                    jt1Var2.I();
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, 12582912, 57);
            bj4VarO.U(true);
            ox6Var4 = ox6Var3;
        } else {
            if (i4 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            finRowStyle = FinAnswerRowKt.getFinRowStyle(GroupingPosition.STANDALONE, bj4VarO, 6);
            ox6 ox6VarH3 = eo7.h(ox6Var3, finRowStyle.getRowPadding());
            fl6VarD = dv0.d(di.a.a, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarH3);
            bt1.c.getClass();
            aVar = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, fl6VarD);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            v5a.a(null, finRowStyle.getBubbleStyle().getShape(), finRowStyle.getBubbleStyle().m283getColor0d7_KjU(), 0L, 0.0f, 0.0f, finRowStyle.getBubbleStyle().getBorderStroke(), gr1.b(610304332, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.FinStreamingRowKt$FinStreamingRow$1$1
                /* JADX WARN: Multi-variable type inference failed */
                public final void invoke(jt1 jt1Var2, int i5) {
                    int i6;
                    jt1 jt1Var3 = jt1Var2;
                    if ((i5 & 3) == 2 && jt1Var3.r()) {
                        jt1Var3.u();
                        return;
                    }
                    go7 padding = finRowStyle.getBubbleStyle().getPadding();
                    ox6.a aVar2 = ox6.a.t;
                    ox6 ox6VarH4 = eo7.h(aVar2, padding);
                    c30.h hVar = new c30.h(16.0f, true, new a30());
                    StreamingPart streamingPart2 = streamingPart;
                    List<Block> list2 = list;
                    FinRowStyle finRowStyle2 = finRowStyle;
                    aj1 aj1VarA = yi1.a(hVar, di.a.m, jt1Var3, 6);
                    int iHashCode2 = Long.hashCode(jt1Var3.v());
                    kw7 kw7VarY = jt1Var3.y();
                    ox6 ox6VarC2 = it1.c(jt1Var3, ox6VarH4);
                    bt1.c.getClass();
                    qr5.a aVar3 = bt1.a.b;
                    if (jt1Var3.s() == null) {
                        ml5.c();
                        throw null;
                    }
                    jt1Var3.q();
                    if (jt1Var3.l()) {
                        jt1Var3.k(aVar3);
                    } else {
                        jt1Var3.z();
                    }
                    rd7.d(jt1Var3, bt1.a.f, aj1VarA);
                    rd7.d(jt1Var3, bt1.a.e, kw7VarY);
                    rd7.d(jt1Var3, bt1.a.g, Integer.valueOf(iHashCode2));
                    rd7.c(jt1Var3, bt1.a.h);
                    rd7.d(jt1Var3, bt1.a.d, ox6VarC2);
                    Metadata metadata = streamingPart2.getMetadata();
                    jt1Var3.K(-989627254);
                    if (metadata == null) {
                        i6 = 0;
                    } else {
                        List<Avatar> avatars = metadata.getAvatars();
                        ArrayList arrayList = new ArrayList(ph1.n(avatars, 10));
                        Iterator<T> it = avatars.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new AvatarWrapper((Avatar) it.next(), false, 2, null));
                        }
                        i6 = 0;
                        FinAnswerRowKt.FinAnswerMetadata(arrayList, metadata.getTitle(), null, metadata.getSuffix(), metadata.getTimestamp(), null, false, null, jt1Var2, 196608, 196);
                        jt1Var3 = jt1Var2;
                    }
                    jt1Var3.B();
                    jt1Var3.K(-989612763);
                    int i7 = i6;
                    for (Object obj : list2) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            ws0.m();
                            throw null;
                        }
                        FinStreamingRowKt.FinStreamingBlock(new BlockRenderData((Block) obj, new uh1(hi1.b(finRowStyle2.getBubbleStyle().m283getColor0d7_KjU(), jt1Var3)), null, null, BlockRenderTextStyle.m414copyZsBm6Y$default(BlockRenderTextStyle.Companion.getParagraphDefault(), 0L, null, 0L, null, new uh1(IntercomTheme.INSTANCE.getColors(jt1Var3, IntercomTheme.$stable).m752getActionContrastWhite0d7_KjU()), null, 47, null), 12, null), uma.a(aVar2, finRowStyle2.getContentShape()), i7 == list2.size() - 1 ? 1 : i6, jt1Var3, 0, 0);
                        jt1Var3 = jt1Var2;
                        i7 = i8;
                    }
                    jt1Var2.B();
                    jt1Var2.I();
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4VarO, 12582912, 57);
            bj4VarO.U(true);
            ox6Var4 = ox6Var3;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: wz3
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return FinStreamingRowKt.FinStreamingRow$lambda$1(list, streamingPart, ox6Var4, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FinStreamingRow$lambda$1(List list, StreamingPart streamingPart, ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        FinStreamingRow(list, streamingPart, ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    private static final void FinStreamingRowPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-1248993407);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$FinStreamingRowKt.INSTANCE.m232getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: xz3
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return FinStreamingRowKt.FinStreamingRowPreview$lambda$10(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FinStreamingRowPreview$lambda$10(int i, jt1 jt1Var, int i2) {
        FinStreamingRowPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
