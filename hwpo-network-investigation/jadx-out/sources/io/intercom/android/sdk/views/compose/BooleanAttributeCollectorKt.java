package io.intercom.android.sdk.views.compose;

import defpackage.ae8;
import defpackage.al8;
import defpackage.as0;
import defpackage.b47;
import defpackage.b72;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bs0;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.di;
import defpackage.g2b;
import defpackage.gh5;
import defpackage.gi0;
import defpackage.gs0;
import defpackage.gz3;
import defpackage.h37;
import defpackage.hs0;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ly8;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.mm8;
import defpackage.nr1;
import defpackage.ns0;
import defpackage.ny8;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.oy8;
import defpackage.py8;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.uh1;
import defpackage.uma;
import defpackage.v33;
import defpackage.vaa;
import defpackage.we1;
import defpackage.xj5;
import defpackage.xj8;
import defpackage.z43;
import defpackage.zr0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.views.compose.BooleanAttributeCollectorKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class BooleanAttributeCollectorKt {
    /* JADX WARN: Code duplicated, block: B:100:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:103:0x01da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:104:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:108:0x021f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0226  */
    /* JADX WARN: Code duplicated, block: B:113:0x0235  */
    /* JADX WARN: Code duplicated, block: B:116:0x0243  */
    /* JADX WARN: Code duplicated, block: B:117:0x0245  */
    /* JADX WARN: Code duplicated, block: B:120:0x0252  */
    /* JADX WARN: Code duplicated, block: B:122:0x0256  */
    /* JADX WARN: Code duplicated, block: B:126:0x027e  */
    /* JADX WARN: Code duplicated, block: B:128:0x028b  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:77:0x00db  */
    /* JADX WARN: Code duplicated, block: B:80:0x0104 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x0106  */
    /* JADX WARN: Code duplicated, block: B:84:0x016c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0173  */
    /* JADX WARN: Code duplicated, block: B:87:0x0177  */
    /* JADX WARN: Code duplicated, block: B:90:0x0199  */
    /* JADX WARN: Code duplicated, block: B:91:0x019c  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c5  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void BooleanAttributeCollector(ox6 ox6Var, final AttributeData attributeData, boolean z, boolean z2, oh4<? super AttributeData, g2b> oh4Var, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        int i6;
        oh4<? super AttributeData, g2b> oh4Var2;
        int i7;
        ox6 ox6Var3;
        int i8;
        boolean z5;
        jt1.a.C0187a c0187a;
        final oh4<? super AttributeData, g2b> oh4Var3;
        final boolean zIsFormDisabled;
        final boolean submitted;
        boolean zC;
        Object objF;
        final h37 h37Var;
        long jM758getCollectorBorder0d7_KjU;
        b72 b72Var;
        ox6 ox6Var4;
        ny8 ny8VarA;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar;
        Boolean boolBooleanAttributeCollector$lambda$4;
        boolean z6;
        int i9;
        boolean z7;
        final AttributeData attributeData2;
        boolean zJ;
        Object objF2;
        final oh4<? super AttributeData, g2b> oh4Var4;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean zJ2;
        Object objF3;
        final boolean z11;
        final boolean z12;
        final oh4<? super AttributeData, g2b> oh4Var5;
        Object objF4;
        xj8 xj8VarW;
        attributeData.getClass();
        bj4 bj4VarO = jt1Var.o(2100686120);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            ox6Var2 = ox6Var;
        } else if ((i & 6) == 0) {
            ox6Var2 = ox6Var;
            i3 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i;
        } else {
            ox6Var2 = ox6Var;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(attributeData) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 == 0) {
            if ((i & 384) == 0) {
                z3 = z;
                i3 |= bj4VarO.c(z3) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z4 = z2;
                    if (bj4VarO.c(z4)) {
                        i5 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        oh4Var2 = oh4Var;
                        if (bj4VarO.j(oh4Var2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((i3 & 9363) == 9362 || !bj4VarO.r()) {
                        if (i10 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        i8 = 0;
                        if (i11 != 0) {
                            z3 = false;
                        }
                        if (i4 != 0) {
                            z5 = false;
                        } else {
                            z5 = z4;
                        }
                        c0187a = jt1.a.a;
                        if (i6 != 0) {
                            bj4VarO.K(-1684918389);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new bs0(i8);
                                bj4VarO.C(objF4);
                            }
                            oh4Var3 = (oh4) objF4;
                            bj4VarO.U(false);
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        zIsFormDisabled = attributeData.isFormDisabled();
                        submitted = attributeData.getAttribute().getSubmitted();
                        Object[] objArr = new Object[0];
                        bj4VarO.K(-1684913541);
                        zC = bj4VarO.c(submitted) | bj4VarO.c(zIsFormDisabled) | bj4VarO.j(attributeData);
                        objF = bj4VarO.f();
                        if (zC || objF == c0187a) {
                            objF = new mh4() { // from class: cs0
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$3$lambda$2(submitted, zIsFormDisabled, attributeData);
                                }
                            };
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        h37Var = (h37) mm8.d(objArr, (mh4) objF, bj4VarO, 0);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i12 = IntercomTheme.$stable;
                        jM758getCollectorBorder0d7_KjU = intercomTheme.getColors(bj4VarO, i12).m758getCollectorBorder0d7_KjU();
                        b72Var = intercomTheme.getShapes(bj4VarO, i12).b;
                        ox6 ox6VarA = ns0.a(ir9.d(ir9.c(uma.a(ox6Var3, b72Var), 1.0f), 40.0f), 1.0f, jM758getCollectorBorder0d7_KjU, b72Var);
                        ox6Var4 = ox6Var3;
                        ny8VarA = ly8.a(c30.e, di.a.k, bj4VarO, 54);
                        iHashCode = Long.hashCode(bj4VarO.T);
                        kw7VarP = bj4VarO.P();
                        ox6VarC = it1.c(bj4VarO, ox6VarA);
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
                        rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        if (z3) {
                            boolBooleanAttributeCollector$lambda$4 = null;
                        } else {
                            boolBooleanAttributeCollector$lambda$4 = BooleanAttributeCollector$lambda$4(h37Var);
                        }
                        if (z5 || !xj5.a(BooleanAttributeCollector$lambda$4(h37Var), Boolean.TRUE)) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        bj4VarO.K(2000063351);
                        boolean zJ3 = bj4VarO.J(h37Var);
                        i9 = i3 & 57344;
                        if (i9 == 16384) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        attributeData2 = attributeData;
                        zJ = zJ3 | z7 | bj4VarO.j(attributeData2);
                        objF2 = bj4VarO.f();
                        if (zJ || objF2 == c0187a) {
                            objF2 = new mh4() { // from class: ds0
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$7$lambda$6(oh4Var3, attributeData2, h37Var);
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        bj4VarO.U(false);
                        py8 py8Var = py8.a;
                        oh4Var4 = oh4Var3;
                        z8 = z5;
                        BooleanAttributeCollectorOption(py8Var, boolBooleanAttributeCollector$lambda$4, true, b72Var, zIsFormDisabled, submitted, z6, (mh4) objF2, bj4VarO, 390);
                        v33.b(ir9.b, 1.0f, jM758getCollectorBorder0d7_KjU, bj4VarO, 54);
                        Boolean boolBooleanAttributeCollector$lambda$5 = z3 ? null : BooleanAttributeCollector$lambda$4(h37Var);
                        if (z8 || !xj5.a(BooleanAttributeCollector$lambda$4(h37Var), Boolean.FALSE)) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        bj4VarO.K(2000082809);
                        boolean zJ4 = bj4VarO.J(h37Var);
                        if (i9 == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zJ2 = z10 | zJ4 | bj4VarO.j(attributeData2);
                        objF3 = bj4VarO.f();
                        if (zJ2 || objF3 == c0187a) {
                            objF3 = new mh4() { // from class: es0
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$9$lambda$8(oh4Var4, attributeData2, h37Var);
                                }
                            };
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        BooleanAttributeCollectorOption(py8Var, boolBooleanAttributeCollector$lambda$5, false, b72Var, zIsFormDisabled, submitted, z9, (mh4) objF3, bj4VarO, 390);
                        bj4VarO.U(true);
                        z11 = z8;
                        z12 = z3;
                        oh4Var5 = oh4Var4;
                    } else {
                        bj4VarO.u();
                        ox6Var4 = ox6Var2;
                        attributeData2 = attributeData;
                        z12 = z3;
                        z11 = z4;
                        oh4Var5 = oh4Var2;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        final AttributeData attributeData3 = attributeData2;
                        final ox6 ox6Var5 = ox6Var4;
                        xj8VarW.d = new ci4() { // from class: fs0
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$11(ox6Var5, attributeData3, z12, z11, oh4Var5, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                oh4Var2 = oh4Var;
                if ((i3 & 9363) == 9362) {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    i8 = 0;
                    if (i11 != 0) {
                        z3 = false;
                    }
                    if (i4 != 0) {
                        z5 = false;
                    } else {
                        z5 = z4;
                    }
                    c0187a = jt1.a.a;
                    if (i6 != 0) {
                        bj4VarO.K(-1684918389);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new bs0(i8);
                            bj4VarO.C(objF4);
                        }
                        oh4Var3 = (oh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    zIsFormDisabled = attributeData.isFormDisabled();
                    submitted = attributeData.getAttribute().getSubmitted();
                    Object[] objArr2 = new Object[0];
                    bj4VarO.K(-1684913541);
                    zC = bj4VarO.c(submitted) | bj4VarO.c(zIsFormDisabled) | bj4VarO.j(attributeData);
                    objF = bj4VarO.f();
                    if (zC) {
                        objF = new mh4() { // from class: cs0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$3$lambda$2(submitted, zIsFormDisabled, attributeData);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new mh4() { // from class: cs0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$3$lambda$2(submitted, zIsFormDisabled, attributeData);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    h37Var = (h37) mm8.d(objArr2, (mh4) objF, bj4VarO, 0);
                    IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                    int i13 = IntercomTheme.$stable;
                    jM758getCollectorBorder0d7_KjU = intercomTheme2.getColors(bj4VarO, i13).m758getCollectorBorder0d7_KjU();
                    b72Var = intercomTheme2.getShapes(bj4VarO, i13).b;
                    ox6 ox6VarA2 = ns0.a(ir9.d(ir9.c(uma.a(ox6Var3, b72Var), 1.0f), 40.0f), 1.0f, jM758getCollectorBorder0d7_KjU, b72Var);
                    ox6Var4 = ox6Var3;
                    ny8VarA = ly8.a(c30.e, di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarA2);
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
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    if (z3) {
                        boolBooleanAttributeCollector$lambda$4 = null;
                    } else {
                        boolBooleanAttributeCollector$lambda$4 = BooleanAttributeCollector$lambda$4(h37Var);
                    }
                    if (z5) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    bj4VarO.K(2000063351);
                    boolean zJ5 = bj4VarO.J(h37Var);
                    i9 = i3 & 57344;
                    if (i9 == 16384) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    attributeData2 = attributeData;
                    zJ = zJ5 | z7 | bj4VarO.j(attributeData2);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: ds0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$7$lambda$6(oh4Var3, attributeData2, h37Var);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: ds0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$7$lambda$6(oh4Var3, attributeData2, h37Var);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    py8 py8Var2 = py8.a;
                    oh4Var4 = oh4Var3;
                    z8 = z5;
                    BooleanAttributeCollectorOption(py8Var2, boolBooleanAttributeCollector$lambda$4, true, b72Var, zIsFormDisabled, submitted, z6, (mh4) objF2, bj4VarO, 390);
                    v33.b(ir9.b, 1.0f, jM758getCollectorBorder0d7_KjU, bj4VarO, 54);
                    Boolean boolBooleanAttributeCollector$lambda$6 = z3 ? null : BooleanAttributeCollector$lambda$4(h37Var);
                    if (z8) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    bj4VarO.K(2000082809);
                    boolean zJ6 = bj4VarO.J(h37Var);
                    if (i9 == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zJ2 = z10 | zJ6 | bj4VarO.j(attributeData2);
                    objF3 = bj4VarO.f();
                    if (zJ2) {
                        objF3 = new mh4() { // from class: es0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$9$lambda$8(oh4Var4, attributeData2, h37Var);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new mh4() { // from class: es0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$9$lambda$8(oh4Var4, attributeData2, h37Var);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    BooleanAttributeCollectorOption(py8Var2, boolBooleanAttributeCollector$lambda$6, false, b72Var, zIsFormDisabled, submitted, z9, (mh4) objF3, bj4VarO, 390);
                    bj4VarO.U(true);
                    z11 = z8;
                    z12 = z3;
                    oh4Var5 = oh4Var4;
                } else {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    i8 = 0;
                    if (i11 != 0) {
                        z3 = false;
                    }
                    if (i4 != 0) {
                        z5 = false;
                    } else {
                        z5 = z4;
                    }
                    c0187a = jt1.a.a;
                    if (i6 != 0) {
                        bj4VarO.K(-1684918389);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new bs0(i8);
                            bj4VarO.C(objF4);
                        }
                        oh4Var3 = (oh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    zIsFormDisabled = attributeData.isFormDisabled();
                    submitted = attributeData.getAttribute().getSubmitted();
                    Object[] objArr3 = new Object[0];
                    bj4VarO.K(-1684913541);
                    zC = bj4VarO.c(submitted) | bj4VarO.c(zIsFormDisabled) | bj4VarO.j(attributeData);
                    objF = bj4VarO.f();
                    if (zC) {
                        objF = new mh4() { // from class: cs0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$3$lambda$2(submitted, zIsFormDisabled, attributeData);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new mh4() { // from class: cs0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$3$lambda$2(submitted, zIsFormDisabled, attributeData);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    h37Var = (h37) mm8.d(objArr3, (mh4) objF, bj4VarO, 0);
                    IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                    int i14 = IntercomTheme.$stable;
                    jM758getCollectorBorder0d7_KjU = intercomTheme3.getColors(bj4VarO, i14).m758getCollectorBorder0d7_KjU();
                    b72Var = intercomTheme3.getShapes(bj4VarO, i14).b;
                    ox6 ox6VarA3 = ns0.a(ir9.d(ir9.c(uma.a(ox6Var3, b72Var), 1.0f), 40.0f), 1.0f, jM758getCollectorBorder0d7_KjU, b72Var);
                    ox6Var4 = ox6Var3;
                    ny8VarA = ly8.a(c30.e, di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarA3);
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
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    if (z3) {
                        boolBooleanAttributeCollector$lambda$4 = null;
                    } else {
                        boolBooleanAttributeCollector$lambda$4 = BooleanAttributeCollector$lambda$4(h37Var);
                    }
                    if (z5) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    bj4VarO.K(2000063351);
                    boolean zJ7 = bj4VarO.J(h37Var);
                    i9 = i3 & 57344;
                    if (i9 == 16384) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    attributeData2 = attributeData;
                    zJ = zJ7 | z7 | bj4VarO.j(attributeData2);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: ds0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$7$lambda$6(oh4Var3, attributeData2, h37Var);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: ds0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$7$lambda$6(oh4Var3, attributeData2, h37Var);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    py8 py8Var3 = py8.a;
                    oh4Var4 = oh4Var3;
                    z8 = z5;
                    BooleanAttributeCollectorOption(py8Var3, boolBooleanAttributeCollector$lambda$4, true, b72Var, zIsFormDisabled, submitted, z6, (mh4) objF2, bj4VarO, 390);
                    v33.b(ir9.b, 1.0f, jM758getCollectorBorder0d7_KjU, bj4VarO, 54);
                    Boolean boolBooleanAttributeCollector$lambda$7 = z3 ? null : BooleanAttributeCollector$lambda$4(h37Var);
                    if (z8) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    bj4VarO.K(2000082809);
                    boolean zJ8 = bj4VarO.J(h37Var);
                    if (i9 == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zJ2 = z10 | zJ8 | bj4VarO.j(attributeData2);
                    objF3 = bj4VarO.f();
                    if (zJ2) {
                        objF3 = new mh4() { // from class: es0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$9$lambda$8(oh4Var4, attributeData2, h37Var);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new mh4() { // from class: es0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$9$lambda$8(oh4Var4, attributeData2, h37Var);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    BooleanAttributeCollectorOption(py8Var3, boolBooleanAttributeCollector$lambda$7, false, b72Var, zIsFormDisabled, submitted, z9, (mh4) objF3, bj4VarO, 390);
                    bj4VarO.U(true);
                    z11 = z8;
                    z12 = z3;
                    oh4Var5 = oh4Var4;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    final AttributeData attributeData4 = attributeData2;
                    final ox6 ox6Var6 = ox6Var4;
                    xj8VarW.d = new ci4() { // from class: fs0
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$11(ox6Var6, attributeData4, z12, z11, oh4Var5, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            z4 = z2;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    oh4Var2 = oh4Var;
                    if (bj4VarO.j(oh4Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i3 & 9363) == 9362) {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    i8 = 0;
                    if (i11 != 0) {
                        z3 = false;
                    }
                    if (i4 != 0) {
                        z5 = false;
                    } else {
                        z5 = z4;
                    }
                    c0187a = jt1.a.a;
                    if (i6 != 0) {
                        bj4VarO.K(-1684918389);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new bs0(i8);
                            bj4VarO.C(objF4);
                        }
                        oh4Var3 = (oh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    zIsFormDisabled = attributeData.isFormDisabled();
                    submitted = attributeData.getAttribute().getSubmitted();
                    Object[] objArr4 = new Object[0];
                    bj4VarO.K(-1684913541);
                    zC = bj4VarO.c(submitted) | bj4VarO.c(zIsFormDisabled) | bj4VarO.j(attributeData);
                    objF = bj4VarO.f();
                    if (zC) {
                        objF = new mh4() { // from class: cs0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$3$lambda$2(submitted, zIsFormDisabled, attributeData);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new mh4() { // from class: cs0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$3$lambda$2(submitted, zIsFormDisabled, attributeData);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    h37Var = (h37) mm8.d(objArr4, (mh4) objF, bj4VarO, 0);
                    IntercomTheme intercomTheme4 = IntercomTheme.INSTANCE;
                    int i15 = IntercomTheme.$stable;
                    jM758getCollectorBorder0d7_KjU = intercomTheme4.getColors(bj4VarO, i15).m758getCollectorBorder0d7_KjU();
                    b72Var = intercomTheme4.getShapes(bj4VarO, i15).b;
                    ox6 ox6VarA4 = ns0.a(ir9.d(ir9.c(uma.a(ox6Var3, b72Var), 1.0f), 40.0f), 1.0f, jM758getCollectorBorder0d7_KjU, b72Var);
                    ox6Var4 = ox6Var3;
                    ny8VarA = ly8.a(c30.e, di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarA4);
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
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    if (z3) {
                        boolBooleanAttributeCollector$lambda$4 = null;
                    } else {
                        boolBooleanAttributeCollector$lambda$4 = BooleanAttributeCollector$lambda$4(h37Var);
                    }
                    if (z5) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    bj4VarO.K(2000063351);
                    boolean zJ9 = bj4VarO.J(h37Var);
                    i9 = i3 & 57344;
                    if (i9 == 16384) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    attributeData2 = attributeData;
                    zJ = zJ9 | z7 | bj4VarO.j(attributeData2);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: ds0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$7$lambda$6(oh4Var3, attributeData2, h37Var);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: ds0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$7$lambda$6(oh4Var3, attributeData2, h37Var);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    py8 py8Var4 = py8.a;
                    oh4Var4 = oh4Var3;
                    z8 = z5;
                    BooleanAttributeCollectorOption(py8Var4, boolBooleanAttributeCollector$lambda$4, true, b72Var, zIsFormDisabled, submitted, z6, (mh4) objF2, bj4VarO, 390);
                    v33.b(ir9.b, 1.0f, jM758getCollectorBorder0d7_KjU, bj4VarO, 54);
                    Boolean boolBooleanAttributeCollector$lambda$8 = z3 ? null : BooleanAttributeCollector$lambda$4(h37Var);
                    if (z8) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    bj4VarO.K(2000082809);
                    boolean zJ10 = bj4VarO.J(h37Var);
                    if (i9 == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zJ2 = z10 | zJ10 | bj4VarO.j(attributeData2);
                    objF3 = bj4VarO.f();
                    if (zJ2) {
                        objF3 = new mh4() { // from class: es0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$9$lambda$8(oh4Var4, attributeData2, h37Var);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new mh4() { // from class: es0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$9$lambda$8(oh4Var4, attributeData2, h37Var);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    BooleanAttributeCollectorOption(py8Var4, boolBooleanAttributeCollector$lambda$8, false, b72Var, zIsFormDisabled, submitted, z9, (mh4) objF3, bj4VarO, 390);
                    bj4VarO.U(true);
                    z11 = z8;
                    z12 = z3;
                    oh4Var5 = oh4Var4;
                } else {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    i8 = 0;
                    if (i11 != 0) {
                        z3 = false;
                    }
                    if (i4 != 0) {
                        z5 = false;
                    } else {
                        z5 = z4;
                    }
                    c0187a = jt1.a.a;
                    if (i6 != 0) {
                        bj4VarO.K(-1684918389);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new bs0(i8);
                            bj4VarO.C(objF4);
                        }
                        oh4Var3 = (oh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    zIsFormDisabled = attributeData.isFormDisabled();
                    submitted = attributeData.getAttribute().getSubmitted();
                    Object[] objArr5 = new Object[0];
                    bj4VarO.K(-1684913541);
                    zC = bj4VarO.c(submitted) | bj4VarO.c(zIsFormDisabled) | bj4VarO.j(attributeData);
                    objF = bj4VarO.f();
                    if (zC) {
                        objF = new mh4() { // from class: cs0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$3$lambda$2(submitted, zIsFormDisabled, attributeData);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new mh4() { // from class: cs0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$3$lambda$2(submitted, zIsFormDisabled, attributeData);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    h37Var = (h37) mm8.d(objArr5, (mh4) objF, bj4VarO, 0);
                    IntercomTheme intercomTheme5 = IntercomTheme.INSTANCE;
                    int i16 = IntercomTheme.$stable;
                    jM758getCollectorBorder0d7_KjU = intercomTheme5.getColors(bj4VarO, i16).m758getCollectorBorder0d7_KjU();
                    b72Var = intercomTheme5.getShapes(bj4VarO, i16).b;
                    ox6 ox6VarA5 = ns0.a(ir9.d(ir9.c(uma.a(ox6Var3, b72Var), 1.0f), 40.0f), 1.0f, jM758getCollectorBorder0d7_KjU, b72Var);
                    ox6Var4 = ox6Var3;
                    ny8VarA = ly8.a(c30.e, di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarA5);
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
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    if (z3) {
                        boolBooleanAttributeCollector$lambda$4 = null;
                    } else {
                        boolBooleanAttributeCollector$lambda$4 = BooleanAttributeCollector$lambda$4(h37Var);
                    }
                    if (z5) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    bj4VarO.K(2000063351);
                    boolean zJ11 = bj4VarO.J(h37Var);
                    i9 = i3 & 57344;
                    if (i9 == 16384) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    attributeData2 = attributeData;
                    zJ = zJ11 | z7 | bj4VarO.j(attributeData2);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: ds0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$7$lambda$6(oh4Var3, attributeData2, h37Var);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: ds0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$7$lambda$6(oh4Var3, attributeData2, h37Var);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    py8 py8Var5 = py8.a;
                    oh4Var4 = oh4Var3;
                    z8 = z5;
                    BooleanAttributeCollectorOption(py8Var5, boolBooleanAttributeCollector$lambda$4, true, b72Var, zIsFormDisabled, submitted, z6, (mh4) objF2, bj4VarO, 390);
                    v33.b(ir9.b, 1.0f, jM758getCollectorBorder0d7_KjU, bj4VarO, 54);
                    Boolean boolBooleanAttributeCollector$lambda$9 = z3 ? null : BooleanAttributeCollector$lambda$4(h37Var);
                    if (z8) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    bj4VarO.K(2000082809);
                    boolean zJ12 = bj4VarO.J(h37Var);
                    if (i9 == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zJ2 = z10 | zJ12 | bj4VarO.j(attributeData2);
                    objF3 = bj4VarO.f();
                    if (zJ2) {
                        objF3 = new mh4() { // from class: es0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$9$lambda$8(oh4Var4, attributeData2, h37Var);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new mh4() { // from class: es0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$9$lambda$8(oh4Var4, attributeData2, h37Var);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    BooleanAttributeCollectorOption(py8Var5, boolBooleanAttributeCollector$lambda$9, false, b72Var, zIsFormDisabled, submitted, z9, (mh4) objF3, bj4VarO, 390);
                    bj4VarO.U(true);
                    z11 = z8;
                    z12 = z3;
                    oh4Var5 = oh4Var4;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    final AttributeData attributeData5 = attributeData2;
                    final ox6 ox6Var7 = ox6Var4;
                    xj8VarW.d = new ci4() { // from class: fs0
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$11(ox6Var7, attributeData5, z12, z11, oh4Var5, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            oh4Var2 = oh4Var;
            if ((i3 & 9363) == 9362) {
                if (i10 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                i8 = 0;
                if (i11 != 0) {
                    z3 = false;
                }
                if (i4 != 0) {
                    z5 = false;
                } else {
                    z5 = z4;
                }
                c0187a = jt1.a.a;
                if (i6 != 0) {
                    bj4VarO.K(-1684918389);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new bs0(i8);
                        bj4VarO.C(objF4);
                    }
                    oh4Var3 = (oh4) objF4;
                    bj4VarO.U(false);
                } else {
                    oh4Var3 = oh4Var2;
                }
                zIsFormDisabled = attributeData.isFormDisabled();
                submitted = attributeData.getAttribute().getSubmitted();
                Object[] objArr6 = new Object[0];
                bj4VarO.K(-1684913541);
                zC = bj4VarO.c(submitted) | bj4VarO.c(zIsFormDisabled) | bj4VarO.j(attributeData);
                objF = bj4VarO.f();
                if (zC) {
                    objF = new mh4() { // from class: cs0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$3$lambda$2(submitted, zIsFormDisabled, attributeData);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new mh4() { // from class: cs0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$3$lambda$2(submitted, zIsFormDisabled, attributeData);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                h37Var = (h37) mm8.d(objArr6, (mh4) objF, bj4VarO, 0);
                IntercomTheme intercomTheme6 = IntercomTheme.INSTANCE;
                int i17 = IntercomTheme.$stable;
                jM758getCollectorBorder0d7_KjU = intercomTheme6.getColors(bj4VarO, i17).m758getCollectorBorder0d7_KjU();
                b72Var = intercomTheme6.getShapes(bj4VarO, i17).b;
                ox6 ox6VarA6 = ns0.a(ir9.d(ir9.c(uma.a(ox6Var3, b72Var), 1.0f), 40.0f), 1.0f, jM758getCollectorBorder0d7_KjU, b72Var);
                ox6Var4 = ox6Var3;
                ny8VarA = ly8.a(c30.e, di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarA6);
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
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                if (z3) {
                    boolBooleanAttributeCollector$lambda$4 = null;
                } else {
                    boolBooleanAttributeCollector$lambda$4 = BooleanAttributeCollector$lambda$4(h37Var);
                }
                if (z5) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                bj4VarO.K(2000063351);
                boolean zJ13 = bj4VarO.J(h37Var);
                i9 = i3 & 57344;
                if (i9 == 16384) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                attributeData2 = attributeData;
                zJ = zJ13 | z7 | bj4VarO.j(attributeData2);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new mh4() { // from class: ds0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$7$lambda$6(oh4Var3, attributeData2, h37Var);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: ds0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$7$lambda$6(oh4Var3, attributeData2, h37Var);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                py8 py8Var6 = py8.a;
                oh4Var4 = oh4Var3;
                z8 = z5;
                BooleanAttributeCollectorOption(py8Var6, boolBooleanAttributeCollector$lambda$4, true, b72Var, zIsFormDisabled, submitted, z6, (mh4) objF2, bj4VarO, 390);
                v33.b(ir9.b, 1.0f, jM758getCollectorBorder0d7_KjU, bj4VarO, 54);
                Boolean boolBooleanAttributeCollector$lambda$10 = z3 ? null : BooleanAttributeCollector$lambda$4(h37Var);
                if (z8) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                bj4VarO.K(2000082809);
                boolean zJ14 = bj4VarO.J(h37Var);
                if (i9 == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zJ2 = z10 | zJ14 | bj4VarO.j(attributeData2);
                objF3 = bj4VarO.f();
                if (zJ2) {
                    objF3 = new mh4() { // from class: es0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$9$lambda$8(oh4Var4, attributeData2, h37Var);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new mh4() { // from class: es0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$9$lambda$8(oh4Var4, attributeData2, h37Var);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                BooleanAttributeCollectorOption(py8Var6, boolBooleanAttributeCollector$lambda$10, false, b72Var, zIsFormDisabled, submitted, z9, (mh4) objF3, bj4VarO, 390);
                bj4VarO.U(true);
                z11 = z8;
                z12 = z3;
                oh4Var5 = oh4Var4;
            } else {
                if (i10 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                i8 = 0;
                if (i11 != 0) {
                    z3 = false;
                }
                if (i4 != 0) {
                    z5 = false;
                } else {
                    z5 = z4;
                }
                c0187a = jt1.a.a;
                if (i6 != 0) {
                    bj4VarO.K(-1684918389);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new bs0(i8);
                        bj4VarO.C(objF4);
                    }
                    oh4Var3 = (oh4) objF4;
                    bj4VarO.U(false);
                } else {
                    oh4Var3 = oh4Var2;
                }
                zIsFormDisabled = attributeData.isFormDisabled();
                submitted = attributeData.getAttribute().getSubmitted();
                Object[] objArr7 = new Object[0];
                bj4VarO.K(-1684913541);
                zC = bj4VarO.c(submitted) | bj4VarO.c(zIsFormDisabled) | bj4VarO.j(attributeData);
                objF = bj4VarO.f();
                if (zC) {
                    objF = new mh4() { // from class: cs0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$3$lambda$2(submitted, zIsFormDisabled, attributeData);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new mh4() { // from class: cs0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$3$lambda$2(submitted, zIsFormDisabled, attributeData);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                h37Var = (h37) mm8.d(objArr7, (mh4) objF, bj4VarO, 0);
                IntercomTheme intercomTheme7 = IntercomTheme.INSTANCE;
                int i18 = IntercomTheme.$stable;
                jM758getCollectorBorder0d7_KjU = intercomTheme7.getColors(bj4VarO, i18).m758getCollectorBorder0d7_KjU();
                b72Var = intercomTheme7.getShapes(bj4VarO, i18).b;
                ox6 ox6VarA7 = ns0.a(ir9.d(ir9.c(uma.a(ox6Var3, b72Var), 1.0f), 40.0f), 1.0f, jM758getCollectorBorder0d7_KjU, b72Var);
                ox6Var4 = ox6Var3;
                ny8VarA = ly8.a(c30.e, di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarA7);
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
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                if (z3) {
                    boolBooleanAttributeCollector$lambda$4 = null;
                } else {
                    boolBooleanAttributeCollector$lambda$4 = BooleanAttributeCollector$lambda$4(h37Var);
                }
                if (z5) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                bj4VarO.K(2000063351);
                boolean zJ15 = bj4VarO.J(h37Var);
                i9 = i3 & 57344;
                if (i9 == 16384) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                attributeData2 = attributeData;
                zJ = zJ15 | z7 | bj4VarO.j(attributeData2);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new mh4() { // from class: ds0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$7$lambda$6(oh4Var3, attributeData2, h37Var);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: ds0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$7$lambda$6(oh4Var3, attributeData2, h37Var);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                py8 py8Var7 = py8.a;
                oh4Var4 = oh4Var3;
                z8 = z5;
                BooleanAttributeCollectorOption(py8Var7, boolBooleanAttributeCollector$lambda$4, true, b72Var, zIsFormDisabled, submitted, z6, (mh4) objF2, bj4VarO, 390);
                v33.b(ir9.b, 1.0f, jM758getCollectorBorder0d7_KjU, bj4VarO, 54);
                Boolean boolBooleanAttributeCollector$lambda$11 = z3 ? null : BooleanAttributeCollector$lambda$4(h37Var);
                if (z8) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                bj4VarO.K(2000082809);
                boolean zJ16 = bj4VarO.J(h37Var);
                if (i9 == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zJ2 = z10 | zJ16 | bj4VarO.j(attributeData2);
                objF3 = bj4VarO.f();
                if (zJ2) {
                    objF3 = new mh4() { // from class: es0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$9$lambda$8(oh4Var4, attributeData2, h37Var);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new mh4() { // from class: es0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$9$lambda$8(oh4Var4, attributeData2, h37Var);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                BooleanAttributeCollectorOption(py8Var7, boolBooleanAttributeCollector$lambda$11, false, b72Var, zIsFormDisabled, submitted, z9, (mh4) objF3, bj4VarO, 390);
                bj4VarO.U(true);
                z11 = z8;
                z12 = z3;
                oh4Var5 = oh4Var4;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                final AttributeData attributeData6 = attributeData2;
                final ox6 ox6Var8 = ox6Var4;
                xj8VarW.d = new ci4() { // from class: fs0
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$11(ox6Var8, attributeData6, z12, z11, oh4Var5, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        z3 = z;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z4 = z2;
                if (bj4VarO.c(z4)) {
                    i5 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    oh4Var2 = oh4Var;
                    if (bj4VarO.j(oh4Var2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i3 & 9363) == 9362) {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    i8 = 0;
                    if (i11 != 0) {
                        z3 = false;
                    }
                    if (i4 != 0) {
                        z5 = false;
                    } else {
                        z5 = z4;
                    }
                    c0187a = jt1.a.a;
                    if (i6 != 0) {
                        bj4VarO.K(-1684918389);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new bs0(i8);
                            bj4VarO.C(objF4);
                        }
                        oh4Var3 = (oh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    zIsFormDisabled = attributeData.isFormDisabled();
                    submitted = attributeData.getAttribute().getSubmitted();
                    Object[] objArr8 = new Object[0];
                    bj4VarO.K(-1684913541);
                    zC = bj4VarO.c(submitted) | bj4VarO.c(zIsFormDisabled) | bj4VarO.j(attributeData);
                    objF = bj4VarO.f();
                    if (zC) {
                        objF = new mh4() { // from class: cs0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$3$lambda$2(submitted, zIsFormDisabled, attributeData);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new mh4() { // from class: cs0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$3$lambda$2(submitted, zIsFormDisabled, attributeData);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    h37Var = (h37) mm8.d(objArr8, (mh4) objF, bj4VarO, 0);
                    IntercomTheme intercomTheme8 = IntercomTheme.INSTANCE;
                    int i19 = IntercomTheme.$stable;
                    jM758getCollectorBorder0d7_KjU = intercomTheme8.getColors(bj4VarO, i19).m758getCollectorBorder0d7_KjU();
                    b72Var = intercomTheme8.getShapes(bj4VarO, i19).b;
                    ox6 ox6VarA8 = ns0.a(ir9.d(ir9.c(uma.a(ox6Var3, b72Var), 1.0f), 40.0f), 1.0f, jM758getCollectorBorder0d7_KjU, b72Var);
                    ox6Var4 = ox6Var3;
                    ny8VarA = ly8.a(c30.e, di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarA8);
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
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    if (z3) {
                        boolBooleanAttributeCollector$lambda$4 = null;
                    } else {
                        boolBooleanAttributeCollector$lambda$4 = BooleanAttributeCollector$lambda$4(h37Var);
                    }
                    if (z5) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    bj4VarO.K(2000063351);
                    boolean zJ17 = bj4VarO.J(h37Var);
                    i9 = i3 & 57344;
                    if (i9 == 16384) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    attributeData2 = attributeData;
                    zJ = zJ17 | z7 | bj4VarO.j(attributeData2);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: ds0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$7$lambda$6(oh4Var3, attributeData2, h37Var);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: ds0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$7$lambda$6(oh4Var3, attributeData2, h37Var);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    py8 py8Var8 = py8.a;
                    oh4Var4 = oh4Var3;
                    z8 = z5;
                    BooleanAttributeCollectorOption(py8Var8, boolBooleanAttributeCollector$lambda$4, true, b72Var, zIsFormDisabled, submitted, z6, (mh4) objF2, bj4VarO, 390);
                    v33.b(ir9.b, 1.0f, jM758getCollectorBorder0d7_KjU, bj4VarO, 54);
                    Boolean boolBooleanAttributeCollector$lambda$12 = z3 ? null : BooleanAttributeCollector$lambda$4(h37Var);
                    if (z8) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    bj4VarO.K(2000082809);
                    boolean zJ18 = bj4VarO.J(h37Var);
                    if (i9 == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zJ2 = z10 | zJ18 | bj4VarO.j(attributeData2);
                    objF3 = bj4VarO.f();
                    if (zJ2) {
                        objF3 = new mh4() { // from class: es0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$9$lambda$8(oh4Var4, attributeData2, h37Var);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new mh4() { // from class: es0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$9$lambda$8(oh4Var4, attributeData2, h37Var);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    BooleanAttributeCollectorOption(py8Var8, boolBooleanAttributeCollector$lambda$12, false, b72Var, zIsFormDisabled, submitted, z9, (mh4) objF3, bj4VarO, 390);
                    bj4VarO.U(true);
                    z11 = z8;
                    z12 = z3;
                    oh4Var5 = oh4Var4;
                } else {
                    if (i10 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    i8 = 0;
                    if (i11 != 0) {
                        z3 = false;
                    }
                    if (i4 != 0) {
                        z5 = false;
                    } else {
                        z5 = z4;
                    }
                    c0187a = jt1.a.a;
                    if (i6 != 0) {
                        bj4VarO.K(-1684918389);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new bs0(i8);
                            bj4VarO.C(objF4);
                        }
                        oh4Var3 = (oh4) objF4;
                        bj4VarO.U(false);
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    zIsFormDisabled = attributeData.isFormDisabled();
                    submitted = attributeData.getAttribute().getSubmitted();
                    Object[] objArr9 = new Object[0];
                    bj4VarO.K(-1684913541);
                    zC = bj4VarO.c(submitted) | bj4VarO.c(zIsFormDisabled) | bj4VarO.j(attributeData);
                    objF = bj4VarO.f();
                    if (zC) {
                        objF = new mh4() { // from class: cs0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$3$lambda$2(submitted, zIsFormDisabled, attributeData);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new mh4() { // from class: cs0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$3$lambda$2(submitted, zIsFormDisabled, attributeData);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    h37Var = (h37) mm8.d(objArr9, (mh4) objF, bj4VarO, 0);
                    IntercomTheme intercomTheme9 = IntercomTheme.INSTANCE;
                    int i110 = IntercomTheme.$stable;
                    jM758getCollectorBorder0d7_KjU = intercomTheme9.getColors(bj4VarO, i110).m758getCollectorBorder0d7_KjU();
                    b72Var = intercomTheme9.getShapes(bj4VarO, i110).b;
                    ox6 ox6VarA9 = ns0.a(ir9.d(ir9.c(uma.a(ox6Var3, b72Var), 1.0f), 40.0f), 1.0f, jM758getCollectorBorder0d7_KjU, b72Var);
                    ox6Var4 = ox6Var3;
                    ny8VarA = ly8.a(c30.e, di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6VarA9);
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
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    if (z3) {
                        boolBooleanAttributeCollector$lambda$4 = null;
                    } else {
                        boolBooleanAttributeCollector$lambda$4 = BooleanAttributeCollector$lambda$4(h37Var);
                    }
                    if (z5) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    bj4VarO.K(2000063351);
                    boolean zJ19 = bj4VarO.J(h37Var);
                    i9 = i3 & 57344;
                    if (i9 == 16384) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    attributeData2 = attributeData;
                    zJ = zJ19 | z7 | bj4VarO.j(attributeData2);
                    objF2 = bj4VarO.f();
                    if (zJ) {
                        objF2 = new mh4() { // from class: ds0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$7$lambda$6(oh4Var3, attributeData2, h37Var);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: ds0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$7$lambda$6(oh4Var3, attributeData2, h37Var);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    bj4VarO.U(false);
                    py8 py8Var9 = py8.a;
                    oh4Var4 = oh4Var3;
                    z8 = z5;
                    BooleanAttributeCollectorOption(py8Var9, boolBooleanAttributeCollector$lambda$4, true, b72Var, zIsFormDisabled, submitted, z6, (mh4) objF2, bj4VarO, 390);
                    v33.b(ir9.b, 1.0f, jM758getCollectorBorder0d7_KjU, bj4VarO, 54);
                    Boolean boolBooleanAttributeCollector$lambda$13 = z3 ? null : BooleanAttributeCollector$lambda$4(h37Var);
                    if (z8) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    bj4VarO.K(2000082809);
                    boolean zJ110 = bj4VarO.J(h37Var);
                    if (i9 == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zJ2 = z10 | zJ110 | bj4VarO.j(attributeData2);
                    objF3 = bj4VarO.f();
                    if (zJ2) {
                        objF3 = new mh4() { // from class: es0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$9$lambda$8(oh4Var4, attributeData2, h37Var);
                            }
                        };
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new mh4() { // from class: es0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$9$lambda$8(oh4Var4, attributeData2, h37Var);
                            }
                        };
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    BooleanAttributeCollectorOption(py8Var9, boolBooleanAttributeCollector$lambda$13, false, b72Var, zIsFormDisabled, submitted, z9, (mh4) objF3, bj4VarO, 390);
                    bj4VarO.U(true);
                    z11 = z8;
                    z12 = z3;
                    oh4Var5 = oh4Var4;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    final AttributeData attributeData7 = attributeData2;
                    final ox6 ox6Var9 = ox6Var4;
                    xj8VarW.d = new ci4() { // from class: fs0
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$11(ox6Var9, attributeData7, z12, z11, oh4Var5, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            oh4Var2 = oh4Var;
            if ((i3 & 9363) == 9362) {
                if (i10 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                i8 = 0;
                if (i11 != 0) {
                    z3 = false;
                }
                if (i4 != 0) {
                    z5 = false;
                } else {
                    z5 = z4;
                }
                c0187a = jt1.a.a;
                if (i6 != 0) {
                    bj4VarO.K(-1684918389);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new bs0(i8);
                        bj4VarO.C(objF4);
                    }
                    oh4Var3 = (oh4) objF4;
                    bj4VarO.U(false);
                } else {
                    oh4Var3 = oh4Var2;
                }
                zIsFormDisabled = attributeData.isFormDisabled();
                submitted = attributeData.getAttribute().getSubmitted();
                Object[] objArr10 = new Object[0];
                bj4VarO.K(-1684913541);
                zC = bj4VarO.c(submitted) | bj4VarO.c(zIsFormDisabled) | bj4VarO.j(attributeData);
                objF = bj4VarO.f();
                if (zC) {
                    objF = new mh4() { // from class: cs0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$3$lambda$2(submitted, zIsFormDisabled, attributeData);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new mh4() { // from class: cs0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$3$lambda$2(submitted, zIsFormDisabled, attributeData);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                h37Var = (h37) mm8.d(objArr10, (mh4) objF, bj4VarO, 0);
                IntercomTheme intercomTheme10 = IntercomTheme.INSTANCE;
                int i111 = IntercomTheme.$stable;
                jM758getCollectorBorder0d7_KjU = intercomTheme10.getColors(bj4VarO, i111).m758getCollectorBorder0d7_KjU();
                b72Var = intercomTheme10.getShapes(bj4VarO, i111).b;
                ox6 ox6VarA10 = ns0.a(ir9.d(ir9.c(uma.a(ox6Var3, b72Var), 1.0f), 40.0f), 1.0f, jM758getCollectorBorder0d7_KjU, b72Var);
                ox6Var4 = ox6Var3;
                ny8VarA = ly8.a(c30.e, di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarA10);
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
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                if (z3) {
                    boolBooleanAttributeCollector$lambda$4 = null;
                } else {
                    boolBooleanAttributeCollector$lambda$4 = BooleanAttributeCollector$lambda$4(h37Var);
                }
                if (z5) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                bj4VarO.K(2000063351);
                boolean zJ111 = bj4VarO.J(h37Var);
                i9 = i3 & 57344;
                if (i9 == 16384) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                attributeData2 = attributeData;
                zJ = zJ111 | z7 | bj4VarO.j(attributeData2);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new mh4() { // from class: ds0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$7$lambda$6(oh4Var3, attributeData2, h37Var);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: ds0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$7$lambda$6(oh4Var3, attributeData2, h37Var);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                py8 py8Var10 = py8.a;
                oh4Var4 = oh4Var3;
                z8 = z5;
                BooleanAttributeCollectorOption(py8Var10, boolBooleanAttributeCollector$lambda$4, true, b72Var, zIsFormDisabled, submitted, z6, (mh4) objF2, bj4VarO, 390);
                v33.b(ir9.b, 1.0f, jM758getCollectorBorder0d7_KjU, bj4VarO, 54);
                Boolean boolBooleanAttributeCollector$lambda$14 = z3 ? null : BooleanAttributeCollector$lambda$4(h37Var);
                if (z8) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                bj4VarO.K(2000082809);
                boolean zJ112 = bj4VarO.J(h37Var);
                if (i9 == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zJ2 = z10 | zJ112 | bj4VarO.j(attributeData2);
                objF3 = bj4VarO.f();
                if (zJ2) {
                    objF3 = new mh4() { // from class: es0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$9$lambda$8(oh4Var4, attributeData2, h37Var);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new mh4() { // from class: es0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$9$lambda$8(oh4Var4, attributeData2, h37Var);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                BooleanAttributeCollectorOption(py8Var10, boolBooleanAttributeCollector$lambda$14, false, b72Var, zIsFormDisabled, submitted, z9, (mh4) objF3, bj4VarO, 390);
                bj4VarO.U(true);
                z11 = z8;
                z12 = z3;
                oh4Var5 = oh4Var4;
            } else {
                if (i10 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                i8 = 0;
                if (i11 != 0) {
                    z3 = false;
                }
                if (i4 != 0) {
                    z5 = false;
                } else {
                    z5 = z4;
                }
                c0187a = jt1.a.a;
                if (i6 != 0) {
                    bj4VarO.K(-1684918389);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new bs0(i8);
                        bj4VarO.C(objF4);
                    }
                    oh4Var3 = (oh4) objF4;
                    bj4VarO.U(false);
                } else {
                    oh4Var3 = oh4Var2;
                }
                zIsFormDisabled = attributeData.isFormDisabled();
                submitted = attributeData.getAttribute().getSubmitted();
                Object[] objArr11 = new Object[0];
                bj4VarO.K(-1684913541);
                zC = bj4VarO.c(submitted) | bj4VarO.c(zIsFormDisabled) | bj4VarO.j(attributeData);
                objF = bj4VarO.f();
                if (zC) {
                    objF = new mh4() { // from class: cs0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$3$lambda$2(submitted, zIsFormDisabled, attributeData);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new mh4() { // from class: cs0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$3$lambda$2(submitted, zIsFormDisabled, attributeData);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                h37Var = (h37) mm8.d(objArr11, (mh4) objF, bj4VarO, 0);
                IntercomTheme intercomTheme11 = IntercomTheme.INSTANCE;
                int i112 = IntercomTheme.$stable;
                jM758getCollectorBorder0d7_KjU = intercomTheme11.getColors(bj4VarO, i112).m758getCollectorBorder0d7_KjU();
                b72Var = intercomTheme11.getShapes(bj4VarO, i112).b;
                ox6 ox6VarA11 = ns0.a(ir9.d(ir9.c(uma.a(ox6Var3, b72Var), 1.0f), 40.0f), 1.0f, jM758getCollectorBorder0d7_KjU, b72Var);
                ox6Var4 = ox6Var3;
                ny8VarA = ly8.a(c30.e, di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarA11);
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
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                if (z3) {
                    boolBooleanAttributeCollector$lambda$4 = null;
                } else {
                    boolBooleanAttributeCollector$lambda$4 = BooleanAttributeCollector$lambda$4(h37Var);
                }
                if (z5) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                bj4VarO.K(2000063351);
                boolean zJ113 = bj4VarO.J(h37Var);
                i9 = i3 & 57344;
                if (i9 == 16384) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                attributeData2 = attributeData;
                zJ = zJ113 | z7 | bj4VarO.j(attributeData2);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new mh4() { // from class: ds0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$7$lambda$6(oh4Var3, attributeData2, h37Var);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: ds0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$7$lambda$6(oh4Var3, attributeData2, h37Var);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                py8 py8Var11 = py8.a;
                oh4Var4 = oh4Var3;
                z8 = z5;
                BooleanAttributeCollectorOption(py8Var11, boolBooleanAttributeCollector$lambda$4, true, b72Var, zIsFormDisabled, submitted, z6, (mh4) objF2, bj4VarO, 390);
                v33.b(ir9.b, 1.0f, jM758getCollectorBorder0d7_KjU, bj4VarO, 54);
                Boolean boolBooleanAttributeCollector$lambda$15 = z3 ? null : BooleanAttributeCollector$lambda$4(h37Var);
                if (z8) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                bj4VarO.K(2000082809);
                boolean zJ114 = bj4VarO.J(h37Var);
                if (i9 == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zJ2 = z10 | zJ114 | bj4VarO.j(attributeData2);
                objF3 = bj4VarO.f();
                if (zJ2) {
                    objF3 = new mh4() { // from class: es0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$9$lambda$8(oh4Var4, attributeData2, h37Var);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new mh4() { // from class: es0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$9$lambda$8(oh4Var4, attributeData2, h37Var);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                BooleanAttributeCollectorOption(py8Var11, boolBooleanAttributeCollector$lambda$15, false, b72Var, zIsFormDisabled, submitted, z9, (mh4) objF3, bj4VarO, 390);
                bj4VarO.U(true);
                z11 = z8;
                z12 = z3;
                oh4Var5 = oh4Var4;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                final AttributeData attributeData8 = attributeData2;
                final ox6 ox6Var10 = ox6Var4;
                xj8VarW.d = new ci4() { // from class: fs0
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$11(ox6Var10, attributeData8, z12, z11, oh4Var5, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        z4 = z2;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                oh4Var2 = oh4Var;
                if (bj4VarO.j(oh4Var2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((i3 & 9363) == 9362) {
                if (i10 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                i8 = 0;
                if (i11 != 0) {
                    z3 = false;
                }
                if (i4 != 0) {
                    z5 = false;
                } else {
                    z5 = z4;
                }
                c0187a = jt1.a.a;
                if (i6 != 0) {
                    bj4VarO.K(-1684918389);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new bs0(i8);
                        bj4VarO.C(objF4);
                    }
                    oh4Var3 = (oh4) objF4;
                    bj4VarO.U(false);
                } else {
                    oh4Var3 = oh4Var2;
                }
                zIsFormDisabled = attributeData.isFormDisabled();
                submitted = attributeData.getAttribute().getSubmitted();
                Object[] objArr12 = new Object[0];
                bj4VarO.K(-1684913541);
                zC = bj4VarO.c(submitted) | bj4VarO.c(zIsFormDisabled) | bj4VarO.j(attributeData);
                objF = bj4VarO.f();
                if (zC) {
                    objF = new mh4() { // from class: cs0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$3$lambda$2(submitted, zIsFormDisabled, attributeData);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new mh4() { // from class: cs0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$3$lambda$2(submitted, zIsFormDisabled, attributeData);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                h37Var = (h37) mm8.d(objArr12, (mh4) objF, bj4VarO, 0);
                IntercomTheme intercomTheme12 = IntercomTheme.INSTANCE;
                int i113 = IntercomTheme.$stable;
                jM758getCollectorBorder0d7_KjU = intercomTheme12.getColors(bj4VarO, i113).m758getCollectorBorder0d7_KjU();
                b72Var = intercomTheme12.getShapes(bj4VarO, i113).b;
                ox6 ox6VarA12 = ns0.a(ir9.d(ir9.c(uma.a(ox6Var3, b72Var), 1.0f), 40.0f), 1.0f, jM758getCollectorBorder0d7_KjU, b72Var);
                ox6Var4 = ox6Var3;
                ny8VarA = ly8.a(c30.e, di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarA12);
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
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                if (z3) {
                    boolBooleanAttributeCollector$lambda$4 = null;
                } else {
                    boolBooleanAttributeCollector$lambda$4 = BooleanAttributeCollector$lambda$4(h37Var);
                }
                if (z5) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                bj4VarO.K(2000063351);
                boolean zJ115 = bj4VarO.J(h37Var);
                i9 = i3 & 57344;
                if (i9 == 16384) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                attributeData2 = attributeData;
                zJ = zJ115 | z7 | bj4VarO.j(attributeData2);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new mh4() { // from class: ds0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$7$lambda$6(oh4Var3, attributeData2, h37Var);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: ds0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$7$lambda$6(oh4Var3, attributeData2, h37Var);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                py8 py8Var12 = py8.a;
                oh4Var4 = oh4Var3;
                z8 = z5;
                BooleanAttributeCollectorOption(py8Var12, boolBooleanAttributeCollector$lambda$4, true, b72Var, zIsFormDisabled, submitted, z6, (mh4) objF2, bj4VarO, 390);
                v33.b(ir9.b, 1.0f, jM758getCollectorBorder0d7_KjU, bj4VarO, 54);
                Boolean boolBooleanAttributeCollector$lambda$16 = z3 ? null : BooleanAttributeCollector$lambda$4(h37Var);
                if (z8) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                bj4VarO.K(2000082809);
                boolean zJ116 = bj4VarO.J(h37Var);
                if (i9 == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zJ2 = z10 | zJ116 | bj4VarO.j(attributeData2);
                objF3 = bj4VarO.f();
                if (zJ2) {
                    objF3 = new mh4() { // from class: es0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$9$lambda$8(oh4Var4, attributeData2, h37Var);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new mh4() { // from class: es0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$9$lambda$8(oh4Var4, attributeData2, h37Var);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                BooleanAttributeCollectorOption(py8Var12, boolBooleanAttributeCollector$lambda$16, false, b72Var, zIsFormDisabled, submitted, z9, (mh4) objF3, bj4VarO, 390);
                bj4VarO.U(true);
                z11 = z8;
                z12 = z3;
                oh4Var5 = oh4Var4;
            } else {
                if (i10 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                i8 = 0;
                if (i11 != 0) {
                    z3 = false;
                }
                if (i4 != 0) {
                    z5 = false;
                } else {
                    z5 = z4;
                }
                c0187a = jt1.a.a;
                if (i6 != 0) {
                    bj4VarO.K(-1684918389);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new bs0(i8);
                        bj4VarO.C(objF4);
                    }
                    oh4Var3 = (oh4) objF4;
                    bj4VarO.U(false);
                } else {
                    oh4Var3 = oh4Var2;
                }
                zIsFormDisabled = attributeData.isFormDisabled();
                submitted = attributeData.getAttribute().getSubmitted();
                Object[] objArr13 = new Object[0];
                bj4VarO.K(-1684913541);
                zC = bj4VarO.c(submitted) | bj4VarO.c(zIsFormDisabled) | bj4VarO.j(attributeData);
                objF = bj4VarO.f();
                if (zC) {
                    objF = new mh4() { // from class: cs0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$3$lambda$2(submitted, zIsFormDisabled, attributeData);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new mh4() { // from class: cs0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$3$lambda$2(submitted, zIsFormDisabled, attributeData);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                h37Var = (h37) mm8.d(objArr13, (mh4) objF, bj4VarO, 0);
                IntercomTheme intercomTheme13 = IntercomTheme.INSTANCE;
                int i114 = IntercomTheme.$stable;
                jM758getCollectorBorder0d7_KjU = intercomTheme13.getColors(bj4VarO, i114).m758getCollectorBorder0d7_KjU();
                b72Var = intercomTheme13.getShapes(bj4VarO, i114).b;
                ox6 ox6VarA13 = ns0.a(ir9.d(ir9.c(uma.a(ox6Var3, b72Var), 1.0f), 40.0f), 1.0f, jM758getCollectorBorder0d7_KjU, b72Var);
                ox6Var4 = ox6Var3;
                ny8VarA = ly8.a(c30.e, di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6VarA13);
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
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                if (z3) {
                    boolBooleanAttributeCollector$lambda$4 = null;
                } else {
                    boolBooleanAttributeCollector$lambda$4 = BooleanAttributeCollector$lambda$4(h37Var);
                }
                if (z5) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                bj4VarO.K(2000063351);
                boolean zJ117 = bj4VarO.J(h37Var);
                i9 = i3 & 57344;
                if (i9 == 16384) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                attributeData2 = attributeData;
                zJ = zJ117 | z7 | bj4VarO.j(attributeData2);
                objF2 = bj4VarO.f();
                if (zJ) {
                    objF2 = new mh4() { // from class: ds0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$7$lambda$6(oh4Var3, attributeData2, h37Var);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: ds0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$7$lambda$6(oh4Var3, attributeData2, h37Var);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                py8 py8Var13 = py8.a;
                oh4Var4 = oh4Var3;
                z8 = z5;
                BooleanAttributeCollectorOption(py8Var13, boolBooleanAttributeCollector$lambda$4, true, b72Var, zIsFormDisabled, submitted, z6, (mh4) objF2, bj4VarO, 390);
                v33.b(ir9.b, 1.0f, jM758getCollectorBorder0d7_KjU, bj4VarO, 54);
                Boolean boolBooleanAttributeCollector$lambda$17 = z3 ? null : BooleanAttributeCollector$lambda$4(h37Var);
                if (z8) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                bj4VarO.K(2000082809);
                boolean zJ118 = bj4VarO.J(h37Var);
                if (i9 == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zJ2 = z10 | zJ118 | bj4VarO.j(attributeData2);
                objF3 = bj4VarO.f();
                if (zJ2) {
                    objF3 = new mh4() { // from class: es0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$9$lambda$8(oh4Var4, attributeData2, h37Var);
                        }
                    };
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new mh4() { // from class: es0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$9$lambda$8(oh4Var4, attributeData2, h37Var);
                        }
                    };
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                BooleanAttributeCollectorOption(py8Var13, boolBooleanAttributeCollector$lambda$17, false, b72Var, zIsFormDisabled, submitted, z9, (mh4) objF3, bj4VarO, 390);
                bj4VarO.U(true);
                z11 = z8;
                z12 = z3;
                oh4Var5 = oh4Var4;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                final AttributeData attributeData9 = attributeData2;
                final ox6 ox6Var11 = ox6Var4;
                xj8VarW.d = new ci4() { // from class: fs0
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$11(ox6Var11, attributeData9, z12, z11, oh4Var5, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        oh4Var2 = oh4Var;
        if ((i3 & 9363) == 9362) {
            if (i10 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            i8 = 0;
            if (i11 != 0) {
                z3 = false;
            }
            if (i4 != 0) {
                z5 = false;
            } else {
                z5 = z4;
            }
            c0187a = jt1.a.a;
            if (i6 != 0) {
                bj4VarO.K(-1684918389);
                objF4 = bj4VarO.f();
                if (objF4 == c0187a) {
                    objF4 = new bs0(i8);
                    bj4VarO.C(objF4);
                }
                oh4Var3 = (oh4) objF4;
                bj4VarO.U(false);
            } else {
                oh4Var3 = oh4Var2;
            }
            zIsFormDisabled = attributeData.isFormDisabled();
            submitted = attributeData.getAttribute().getSubmitted();
            Object[] objArr14 = new Object[0];
            bj4VarO.K(-1684913541);
            zC = bj4VarO.c(submitted) | bj4VarO.c(zIsFormDisabled) | bj4VarO.j(attributeData);
            objF = bj4VarO.f();
            if (zC) {
                objF = new mh4() { // from class: cs0
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$3$lambda$2(submitted, zIsFormDisabled, attributeData);
                    }
                };
                bj4VarO.C(objF);
            } else {
                objF = new mh4() { // from class: cs0
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$3$lambda$2(submitted, zIsFormDisabled, attributeData);
                    }
                };
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            h37Var = (h37) mm8.d(objArr14, (mh4) objF, bj4VarO, 0);
            IntercomTheme intercomTheme14 = IntercomTheme.INSTANCE;
            int i115 = IntercomTheme.$stable;
            jM758getCollectorBorder0d7_KjU = intercomTheme14.getColors(bj4VarO, i115).m758getCollectorBorder0d7_KjU();
            b72Var = intercomTheme14.getShapes(bj4VarO, i115).b;
            ox6 ox6VarA14 = ns0.a(ir9.d(ir9.c(uma.a(ox6Var3, b72Var), 1.0f), 40.0f), 1.0f, jM758getCollectorBorder0d7_KjU, b72Var);
            ox6Var4 = ox6Var3;
            ny8VarA = ly8.a(c30.e, di.a.k, bj4VarO, 54);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarA14);
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
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            if (z3) {
                boolBooleanAttributeCollector$lambda$4 = null;
            } else {
                boolBooleanAttributeCollector$lambda$4 = BooleanAttributeCollector$lambda$4(h37Var);
            }
            if (z5) {
                z6 = false;
            } else {
                z6 = false;
            }
            bj4VarO.K(2000063351);
            boolean zJ119 = bj4VarO.J(h37Var);
            i9 = i3 & 57344;
            if (i9 == 16384) {
                z7 = true;
            } else {
                z7 = false;
            }
            attributeData2 = attributeData;
            zJ = zJ119 | z7 | bj4VarO.j(attributeData2);
            objF2 = bj4VarO.f();
            if (zJ) {
                objF2 = new mh4() { // from class: ds0
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$7$lambda$6(oh4Var3, attributeData2, h37Var);
                    }
                };
                bj4VarO.C(objF2);
            } else {
                objF2 = new mh4() { // from class: ds0
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$7$lambda$6(oh4Var3, attributeData2, h37Var);
                    }
                };
                bj4VarO.C(objF2);
            }
            bj4VarO.U(false);
            py8 py8Var14 = py8.a;
            oh4Var4 = oh4Var3;
            z8 = z5;
            BooleanAttributeCollectorOption(py8Var14, boolBooleanAttributeCollector$lambda$4, true, b72Var, zIsFormDisabled, submitted, z6, (mh4) objF2, bj4VarO, 390);
            v33.b(ir9.b, 1.0f, jM758getCollectorBorder0d7_KjU, bj4VarO, 54);
            Boolean boolBooleanAttributeCollector$lambda$18 = z3 ? null : BooleanAttributeCollector$lambda$4(h37Var);
            if (z8) {
                z9 = false;
            } else {
                z9 = false;
            }
            bj4VarO.K(2000082809);
            boolean zJ1110 = bj4VarO.J(h37Var);
            if (i9 == 16384) {
                z10 = true;
            } else {
                z10 = false;
            }
            zJ2 = z10 | zJ1110 | bj4VarO.j(attributeData2);
            objF3 = bj4VarO.f();
            if (zJ2) {
                objF3 = new mh4() { // from class: es0
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$9$lambda$8(oh4Var4, attributeData2, h37Var);
                    }
                };
                bj4VarO.C(objF3);
            } else {
                objF3 = new mh4() { // from class: es0
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$9$lambda$8(oh4Var4, attributeData2, h37Var);
                    }
                };
                bj4VarO.C(objF3);
            }
            bj4VarO.U(false);
            BooleanAttributeCollectorOption(py8Var14, boolBooleanAttributeCollector$lambda$18, false, b72Var, zIsFormDisabled, submitted, z9, (mh4) objF3, bj4VarO, 390);
            bj4VarO.U(true);
            z11 = z8;
            z12 = z3;
            oh4Var5 = oh4Var4;
        } else {
            if (i10 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            i8 = 0;
            if (i11 != 0) {
                z3 = false;
            }
            if (i4 != 0) {
                z5 = false;
            } else {
                z5 = z4;
            }
            c0187a = jt1.a.a;
            if (i6 != 0) {
                bj4VarO.K(-1684918389);
                objF4 = bj4VarO.f();
                if (objF4 == c0187a) {
                    objF4 = new bs0(i8);
                    bj4VarO.C(objF4);
                }
                oh4Var3 = (oh4) objF4;
                bj4VarO.U(false);
            } else {
                oh4Var3 = oh4Var2;
            }
            zIsFormDisabled = attributeData.isFormDisabled();
            submitted = attributeData.getAttribute().getSubmitted();
            Object[] objArr15 = new Object[0];
            bj4VarO.K(-1684913541);
            zC = bj4VarO.c(submitted) | bj4VarO.c(zIsFormDisabled) | bj4VarO.j(attributeData);
            objF = bj4VarO.f();
            if (zC) {
                objF = new mh4() { // from class: cs0
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$3$lambda$2(submitted, zIsFormDisabled, attributeData);
                    }
                };
                bj4VarO.C(objF);
            } else {
                objF = new mh4() { // from class: cs0
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$3$lambda$2(submitted, zIsFormDisabled, attributeData);
                    }
                };
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            h37Var = (h37) mm8.d(objArr15, (mh4) objF, bj4VarO, 0);
            IntercomTheme intercomTheme15 = IntercomTheme.INSTANCE;
            int i116 = IntercomTheme.$stable;
            jM758getCollectorBorder0d7_KjU = intercomTheme15.getColors(bj4VarO, i116).m758getCollectorBorder0d7_KjU();
            b72Var = intercomTheme15.getShapes(bj4VarO, i116).b;
            ox6 ox6VarA15 = ns0.a(ir9.d(ir9.c(uma.a(ox6Var3, b72Var), 1.0f), 40.0f), 1.0f, jM758getCollectorBorder0d7_KjU, b72Var);
            ox6Var4 = ox6Var3;
            ny8VarA = ly8.a(c30.e, di.a.k, bj4VarO, 54);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6VarA15);
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
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            if (z3) {
                boolBooleanAttributeCollector$lambda$4 = null;
            } else {
                boolBooleanAttributeCollector$lambda$4 = BooleanAttributeCollector$lambda$4(h37Var);
            }
            if (z5) {
                z6 = false;
            } else {
                z6 = false;
            }
            bj4VarO.K(2000063351);
            boolean zJ1111 = bj4VarO.J(h37Var);
            i9 = i3 & 57344;
            if (i9 == 16384) {
                z7 = true;
            } else {
                z7 = false;
            }
            attributeData2 = attributeData;
            zJ = zJ1111 | z7 | bj4VarO.j(attributeData2);
            objF2 = bj4VarO.f();
            if (zJ) {
                objF2 = new mh4() { // from class: ds0
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$7$lambda$6(oh4Var3, attributeData2, h37Var);
                    }
                };
                bj4VarO.C(objF2);
            } else {
                objF2 = new mh4() { // from class: ds0
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$7$lambda$6(oh4Var3, attributeData2, h37Var);
                    }
                };
                bj4VarO.C(objF2);
            }
            bj4VarO.U(false);
            py8 py8Var15 = py8.a;
            oh4Var4 = oh4Var3;
            z8 = z5;
            BooleanAttributeCollectorOption(py8Var15, boolBooleanAttributeCollector$lambda$4, true, b72Var, zIsFormDisabled, submitted, z6, (mh4) objF2, bj4VarO, 390);
            v33.b(ir9.b, 1.0f, jM758getCollectorBorder0d7_KjU, bj4VarO, 54);
            Boolean boolBooleanAttributeCollector$lambda$19 = z3 ? null : BooleanAttributeCollector$lambda$4(h37Var);
            if (z8) {
                z9 = false;
            } else {
                z9 = false;
            }
            bj4VarO.K(2000082809);
            boolean zJ1112 = bj4VarO.J(h37Var);
            if (i9 == 16384) {
                z10 = true;
            } else {
                z10 = false;
            }
            zJ2 = z10 | zJ1112 | bj4VarO.j(attributeData2);
            objF3 = bj4VarO.f();
            if (zJ2) {
                objF3 = new mh4() { // from class: es0
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$9$lambda$8(oh4Var4, attributeData2, h37Var);
                    }
                };
                bj4VarO.C(objF3);
            } else {
                objF3 = new mh4() { // from class: es0
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$10$lambda$9$lambda$8(oh4Var4, attributeData2, h37Var);
                    }
                };
                bj4VarO.C(objF3);
            }
            bj4VarO.U(false);
            BooleanAttributeCollectorOption(py8Var15, boolBooleanAttributeCollector$lambda$19, false, b72Var, zIsFormDisabled, submitted, z9, (mh4) objF3, bj4VarO, 390);
            bj4VarO.U(true);
            z11 = z8;
            z12 = z3;
            oh4Var5 = oh4Var4;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            final AttributeData attributeData10 = attributeData2;
            final ox6 ox6Var12 = ox6Var4;
            xj8VarW.d = new ci4() { // from class: fs0
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return BooleanAttributeCollectorKt.BooleanAttributeCollector$lambda$11(ox6Var12, attributeData10, z12, z11, oh4Var5, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b BooleanAttributeCollector$lambda$1$lambda$0(AttributeData attributeData) {
        attributeData.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b BooleanAttributeCollector$lambda$10$lambda$7$lambda$6(oh4 oh4Var, AttributeData attributeData, h37 h37Var) {
        h37Var.setValue(Boolean.TRUE);
        oh4Var.invoke(AttributeData.copy$default(attributeData, Attribute.copy$default(attributeData.getAttribute(), null, null, null, false, null, null, null, "true", 127, null), null, false, 6, null));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b BooleanAttributeCollector$lambda$10$lambda$9$lambda$8(oh4 oh4Var, AttributeData attributeData, h37 h37Var) {
        h37Var.setValue(Boolean.FALSE);
        oh4Var.invoke(AttributeData.copy$default(attributeData, Attribute.copy$default(attributeData.getAttribute(), null, null, null, false, null, null, null, "false", 127, null), null, false, 6, null));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b BooleanAttributeCollector$lambda$11(ox6 ox6Var, AttributeData attributeData, boolean z, boolean z2, oh4 oh4Var, int i, int i2, jt1 jt1Var, int i3) {
        BooleanAttributeCollector(ox6Var, attributeData, z, z2, oh4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h37 BooleanAttributeCollector$lambda$3$lambda$2(boolean z, boolean z2, AttributeData attributeData) {
        String value;
        Boolean bool = null;
        if ((z || z2) && (value = attributeData.getAttribute().getValue()) != null) {
            if (value.equals("true")) {
                bool = Boolean.TRUE;
            } else if (value.equals("false")) {
                bool = Boolean.FALSE;
            }
        }
        return bl7.i(bool);
    }

    private static final Boolean BooleanAttributeCollector$lambda$4(h37<Boolean> h37Var) {
        return h37Var.getValue();
    }

    private static final void BooleanAttributeCollectorOption(final oy8 oy8Var, final Boolean bool, final boolean z, final b72 b72Var, final boolean z2, final boolean z3, final boolean z4, final mh4<g2b> mh4Var, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4Var;
        IntercomTheme intercomTheme;
        int i3;
        bj4 bj4Var2;
        bj4 bj4VarO = jt1Var.o(1323902640);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(oy8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.J(bool) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.c(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bj4VarO.J(b72Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bj4VarO.c(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bj4VarO.c(z3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bj4VarO.c(z4) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= bj4VarO.j(mh4Var) ? 8388608 : 4194304;
        }
        if ((i2 & 4793491) == 4793490 && bj4VarO.r()) {
            bj4VarO.u();
            bj4Var2 = bj4VarO;
        } else {
            z43 z43Var = new z43(0.0f);
            b72 b72VarB = z ? b72.b(b72Var, null, z43Var, z43Var, null, 9) : b72.b(b72Var, z43Var, null, null, z43Var, 6);
            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
            int i4 = IntercomTheme.$stable;
            long jM759getCollectorSelected0d7_KjU = intercomTheme2.getColors(bj4VarO, i4).m759getCollectorSelected0d7_KjU();
            long jB = uh1.b(0.38f, intercomTheme2.getColors(bj4VarO, i4).getText().m824getDefault0d7_KjU());
            ox6 ox6VarA = uma.a(ir9.b, b72VarB);
            if (!xj5.a(bool, Boolean.valueOf(z))) {
                jM759getCollectorSelected0d7_KjU = uh1.j;
            }
            ox6 ox6VarA2 = oy8Var.a(we1.c(gi0.c(ox6VarA, jM759getCollectorSelected0d7_KjU, al8.a), (z2 || z3) ? false : true, null, mh4Var, 14), 1.0f, true);
            ny8 ny8VarA = ly8.a(c30.d, di.a.k, bj4VarO, 54);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6VarA2);
            bt1.c.getClass();
            qr5.a aVar = bt1.a.b;
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
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bj4VarO.K(872785294);
            if (z4) {
                i3 = i4;
                long jA = gh5.a(intercomTheme2, bj4VarO, i3);
                ox6.a aVar2 = ox6.a.t;
                intercomTheme = intercomTheme2;
                ae8.a(ir9.j(aVar2, 20.0f), jA, 3.0f, 0L, 0, 0.0f, bj4VarO, 390, 56);
                bj4Var = bj4VarO;
                b47.b(bj4Var, ir9.n(aVar2, 4.0f));
            } else {
                bj4Var = bj4VarO;
                intercomTheme = intercomTheme2;
                i3 = i4;
            }
            bj4Var.U(false);
            String strF = nr1.f(bj4Var, z ? R.string.intercom_attribute_collector_positive : R.string.intercom_attribute_collector_negative);
            bj4Var.K(872804911);
            if (!z2 && !xj5.a(bool, Boolean.valueOf(!z))) {
                jB = gh5.a(intercomTheme, bj4Var, i3);
            }
            long j = jB;
            bj4Var.U(false);
            bj4 bj4Var3 = bj4Var;
            mia.b(strF, null, j, 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, null, bj4Var3, 0, 0, 261114);
            bj4Var2 = bj4Var3;
            bj4Var2.U(true);
        }
        xj8 xj8VarW = bj4Var2.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: yr0
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return BooleanAttributeCollectorKt.BooleanAttributeCollectorOption$lambda$13(oy8Var, bool, z, b72Var, z2, z3, z4, mh4Var, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b BooleanAttributeCollectorOption$lambda$13(oy8 oy8Var, Boolean bool, boolean z, b72 b72Var, boolean z2, boolean z3, boolean z4, mh4 mh4Var, int i, jt1 jt1Var, int i2) {
        BooleanAttributeCollectorOption(oy8Var, bool, z, b72Var, z2, z3, z4, mh4Var, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void BooleanAttributePreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1269323591);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BooleanAttributeCollectorKt.INSTANCE.m852getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new as0(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b BooleanAttributePreview$lambda$14(int i, jt1 jt1Var, int i2) {
        BooleanAttributePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void DisabledBooleanAttributePreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-2015578211);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BooleanAttributeCollectorKt.INSTANCE.m856getLambda6$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new hs0(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b DisabledBooleanAttributePreview$lambda$16(int i, jt1 jt1Var, int i2) {
        DisabledBooleanAttributePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void SubmittedAndDisabledBooleanAttributePreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1476435233);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BooleanAttributeCollectorKt.INSTANCE.m858getLambda8$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new zr0(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SubmittedAndDisabledBooleanAttributePreview$lambda$17(int i, jt1 jt1Var, int i2) {
        SubmittedAndDisabledBooleanAttributePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void SubmittedBooleanAttributePreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-875849702);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BooleanAttributeCollectorKt.INSTANCE.m854getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new gs0(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SubmittedBooleanAttributePreview$lambda$15(int i, jt1 jt1Var, int i2) {
        SubmittedBooleanAttributePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
