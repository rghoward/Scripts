package io.intercom.android.sdk.views.compose;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.intercom.twig.BuildConfig;
import defpackage.ae8;
import defpackage.al8;
import defpackage.as0;
import defpackage.b72;
import defpackage.bj4;
import defpackage.bl7;
import defpackage.bt1;
import defpackage.ci4;
import defpackage.di;
import defpackage.dp5;
import defpackage.dv0;
import defpackage.eo7;
import defpackage.es7;
import defpackage.fl6;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.gr1;
import defpackage.gs0;
import defpackage.gz3;
import defpackage.h37;
import defpackage.hs0;
import defpackage.ir9;
import defpackage.is7;
import defpackage.it1;
import defpackage.jba;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.lg1;
import defpackage.m65;
import defpackage.mba;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.mm8;
import defpackage.ms0;
import defpackage.oh4;
import defpackage.oj5;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.uh1;
import defpackage.uma;
import defpackage.we1;
import defpackage.xj5;
import defpackage.xj8;
import defpackage.z2a;
import defpackage.z43;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.CountryAreaCode;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.AttributeCollectorValidatorKt;
import io.intercom.android.sdk.utilities.AttributeValidatorUtils;
import io.intercom.android.sdk.utilities.PhoneNumberValidator;
import io.intercom.android.sdk.utilities.UtilsKt;
import io.intercom.android.sdk.views.compose.TextAttributeCollectorKt;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TextAttributeCollectorKt {
    @IntercomPreviews
    public static final void DisabledTextAttributePreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-1615951967);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextAttributeCollectorKt.INSTANCE.m878getLambda8$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: iba
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TextAttributeCollectorKt.DisabledTextAttributePreview$lambda$20(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b DisabledTextAttributePreview$lambda$20(int i, jt1 jt1Var, int i2) {
        DisabledTextAttributePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void EmptyTextAttributePreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(990171980);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextAttributeCollectorKt.INSTANCE.m874getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new lg1(i, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b EmptyTextAttributePreview$lambda$18(int i, jt1 jt1Var, int i2) {
        EmptyTextAttributePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void FilledTextAttributePreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1421911931);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextAttributeCollectorKt.INSTANCE.m872getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new hs0(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b FilledTextAttributePreview$lambda$17(int i, jt1 jt1Var, int i2) {
        FilledTextAttributePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void PhoneAttributePreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(2075517560);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextAttributeCollectorKt.INSTANCE.m871getLambda12$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: hba
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TextAttributeCollectorKt.PhoneAttributePreview$lambda$22(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b PhoneAttributePreview$lambda$22(int i, jt1 jt1Var, int i2) {
        PhoneAttributePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void SubmittedAndDisabledTextAttributePreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-1140989915);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextAttributeCollectorKt.INSTANCE.m869getLambda10$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new gs0(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SubmittedAndDisabledTextAttributePreview$lambda$21(int i, jt1 jt1Var, int i2) {
        SubmittedAndDisabledTextAttributePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void SubmittedTextAttributePreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(914016734);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextAttributeCollectorKt.INSTANCE.m876getLambda6$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new as0(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SubmittedTextAttributePreview$lambda$19(int i, jt1 jt1Var, int i2) {
        SubmittedTextAttributePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:103:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:104:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:109:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:112:0x0211 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x0213  */
    /* JADX WARN: Code duplicated, block: B:117:0x0280  */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00db  */
    /* JADX WARN: Code duplicated, block: B:78:0x00de  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:85:0x011a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0127  */
    /* JADX WARN: Code duplicated, block: B:90:0x0158 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x015a  */
    /* JADX WARN: Code duplicated, block: B:94:0x018a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x018c  */
    /* JADX WARN: Code duplicated, block: B:98:0x01a4  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void TextAttributeCollector(ox6 ox6Var, final AttributeData attributeData, boolean z, oh4<? super String, g2b> oh4Var, oh4<? super AttributeData, g2b> oh4Var2, jt1 jt1Var, final int i, final int i2) {
        ox6 ox6Var2;
        int i3;
        boolean z2;
        int i4;
        oh4<? super String, g2b> oh4Var3;
        int i5;
        int i6;
        oh4<? super AttributeData, g2b> oh4Var4;
        int i7;
        ox6 ox6Var3;
        boolean z3;
        jt1.a.C0187a c0187a;
        oh4<? super String, g2b> oh4Var5;
        oh4<? super AttributeData, g2b> oh4Var6;
        Context context;
        Locale localeCompat;
        final CountryAreaCode countryAreaCodeFromLocale;
        boolean zA;
        boolean zJ;
        Object objF;
        h37 h37Var;
        boolean zJ2;
        Object objF2;
        final h37 h37Var2;
        ox6 ox6VarD;
        int i8;
        fr1 fr1VarB;
        boolean zJ3;
        Object objF3;
        final boolean z4;
        bj4 bj4Var;
        final oh4<? super String, g2b> oh4Var7;
        final oh4<? super AttributeData, g2b> oh4Var8;
        Object objF4;
        Object objF5;
        final ox6 ox6Var4;
        xj8 xj8VarW;
        attributeData.getClass();
        bj4 bj4VarO = jt1Var.o(-1938202913);
        int i9 = i2 & 1;
        int i10 = 2;
        if (i9 != 0) {
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
                z2 = z;
                i3 |= bj4VarO.c(z2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    oh4Var3 = oh4Var;
                    if (bj4VarO.j(oh4Var3)) {
                        i5 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        oh4Var4 = oh4Var2;
                        if (bj4VarO.j(oh4Var4)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((i3 & 9363) == 9362 || !bj4VarO.r()) {
                        if (i9 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i11 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        c0187a = jt1.a.a;
                        if (i4 != 0) {
                            bj4VarO.K(1971770096);
                            objF5 = bj4VarO.f();
                            if (objF5 == c0187a) {
                                objF5 = new jba();
                                bj4VarO.C(objF5);
                            }
                            bj4VarO.U(false);
                            oh4Var5 = (oh4) objF5;
                        } else {
                            oh4Var5 = oh4Var3;
                        }
                        if (i6 != 0) {
                            bj4VarO.K(1971771792);
                            objF4 = bj4VarO.f();
                            if (objF4 == c0187a) {
                                objF4 = new ms0(i10);
                                bj4VarO.C(objF4);
                            }
                            bj4VarO.U(false);
                            oh4Var6 = (oh4) objF4;
                        } else {
                            oh4Var6 = oh4Var4;
                        }
                        context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                        Resources resources = context.getResources();
                        localeCompat = UtilsKt.getLocaleCompat(context);
                        b72 b72Var = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                        if (isPhoneType(attributeData)) {
                            PhoneNumberValidator.loadCountryAreaCodes(context);
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                        } else {
                            countryAreaCodeFromLocale = CountryAreaCode.UNKNOWN;
                        }
                        boolean zIsFormDisabled = attributeData.isFormDisabled();
                        boolean submitted = attributeData.getAttribute().getSubmitted();
                        zA = xj5.a(attributeData.getAttribute().getMultiline(), Boolean.TRUE);
                        Object[] objArr = new Object[0];
                        bj4VarO.K(1971791653);
                        zJ = bj4VarO.j(attributeData);
                        objF = bj4VarO.f();
                        if (zJ || objF == c0187a) {
                            objF = new mh4() { // from class: kba
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return TextAttributeCollectorKt.TextAttributeCollector$lambda$5$lambda$4(attributeData);
                                }
                            };
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        h37Var = (h37) mm8.d(objArr, (mh4) objF, bj4VarO, 0);
                        Object[] objArr2 = new Object[0];
                        bj4VarO.K(1971794796);
                        zJ2 = bj4VarO.j(attributeData) | bj4VarO.j(countryAreaCodeFromLocale);
                        objF2 = bj4VarO.f();
                        if (zJ2 || objF2 == c0187a) {
                            objF2 = new mh4() { // from class: lba
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return TextAttributeCollectorKt.TextAttributeCollector$lambda$9$lambda$8(attributeData, countryAreaCodeFromLocale);
                                }
                            };
                            bj4VarO.C(objF2);
                        }
                        boolean z5 = z3;
                        bj4VarO.U(false);
                        h37Var2 = (h37) mm8.d(objArr2, (mh4) objF2, bj4VarO, 0);
                        if (zA) {
                            ox6VarD = oj5.e(ox6Var3);
                        } else {
                            ox6VarD = ir9.d(ox6Var3, 40.0f);
                        }
                        ox6 ox6Var5 = ox6VarD;
                        String strTextAttributeCollector$lambda$6 = TextAttributeCollector$lambda$6(h37Var);
                        ox6 ox6Var6 = ox6Var3;
                        boolean z6 = !zIsFormDisabled;
                        oh4<? super String, g2b> oh4Var9 = oh4Var5;
                        dp5 dp5Var = new dp5(getKeyboardType(attributeData), 0, 123);
                        boolean z7 = !zA;
                        if (zA) {
                            i8 = 2;
                        } else {
                            i8 = 1;
                        }
                        bj4VarO.K(1971828325);
                        if (isPhoneType(attributeData)) {
                            fr1VarB = gr1.b(-1990705988, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.3
                                public final void invoke(jt1 jt1Var2, int i12) {
                                    if ((i12 & 3) == 2 && jt1Var2.r()) {
                                        jt1Var2.u();
                                    } else {
                                        mia.b(TextAttributeCollectorKt.TextAttributeCollector$lambda$10(h37Var2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
                                    }
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                    invoke(jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4VarO);
                        } else {
                            fr1VarB = null;
                        }
                        fr1 fr1Var = fr1VarB;
                        bj4VarO.U(false);
                        bj4VarO.K(1971804880);
                        zJ3 = bj4VarO.J(h37Var) | bj4VarO.j(attributeData) | bj4VarO.J(h37Var2);
                        objF3 = bj4VarO.f();
                        if (zJ3 || objF3 == c0187a) {
                            objF3 = new mba(attributeData, h37Var, h37Var2);
                            bj4VarO.C(objF3);
                        }
                        bj4VarO.U(false);
                        z4 = z5;
                        bj4Var = bj4VarO;
                        ox6Var2 = ox6Var6;
                        IntercomOutlinedTextFieldKt.IntercomOutlinedTextField(strTextAttributeCollector$lambda$6, (oh4) objF3, ox6Var5, z6, submitted, null, null, gr1.b(-1290485581, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.5
                            public final void invoke(jt1 jt1Var2, int i12) {
                                if ((i12 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                    return;
                                }
                                AttributeData attributeData2 = attributeData;
                                CountryAreaCode countryAreaCode = countryAreaCodeFromLocale;
                                countryAreaCode.getClass();
                                mia.b(TextAttributeCollectorKt.getHint(attributeData2, countryAreaCode), null, IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), fr1Var, gr1.b(930248561, new AnonymousClass6(zIsFormDisabled, submitted, z4, b72Var, h37Var, oh4Var9, resources, attributeData, oh4Var6), bj4VarO), false, null, dp5Var, null, z7, 3, i8, null, b72Var, null, null, bj4Var, 817889280, 196608, 0, 1715296);
                        oh4Var7 = oh4Var9;
                        oh4Var8 = oh4Var6;
                    } else {
                        bj4VarO.u();
                        z4 = z2;
                        oh4Var7 = oh4Var3;
                        bj4Var = bj4VarO;
                        oh4Var8 = oh4Var4;
                    }
                    ox6Var4 = ox6Var2;
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: fba
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TextAttributeCollectorKt.TextAttributeCollector$lambda$14(ox6Var4, attributeData, z4, oh4Var7, oh4Var8, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 24576;
                oh4Var4 = oh4Var2;
                if ((i3 & 9363) == 9362) {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i11 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(1971770096);
                        objF5 = bj4VarO.f();
                        if (objF5 == c0187a) {
                            objF5 = new jba();
                            bj4VarO.C(objF5);
                        }
                        bj4VarO.U(false);
                        oh4Var5 = (oh4) objF5;
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(1971771792);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new ms0(i10);
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF4;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    Resources resources2 = context.getResources();
                    localeCompat = UtilsKt.getLocaleCompat(context);
                    b72 b72Var2 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                    if (isPhoneType(attributeData)) {
                        PhoneNumberValidator.loadCountryAreaCodes(context);
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                    } else {
                        countryAreaCodeFromLocale = CountryAreaCode.UNKNOWN;
                    }
                    boolean zIsFormDisabled2 = attributeData.isFormDisabled();
                    boolean submitted2 = attributeData.getAttribute().getSubmitted();
                    zA = xj5.a(attributeData.getAttribute().getMultiline(), Boolean.TRUE);
                    Object[] objArr3 = new Object[0];
                    bj4VarO.K(1971791653);
                    zJ = bj4VarO.j(attributeData);
                    objF = bj4VarO.f();
                    if (zJ) {
                        objF = new mh4() { // from class: kba
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TextAttributeCollectorKt.TextAttributeCollector$lambda$5$lambda$4(attributeData);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new mh4() { // from class: kba
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TextAttributeCollectorKt.TextAttributeCollector$lambda$5$lambda$4(attributeData);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    h37Var = (h37) mm8.d(objArr3, (mh4) objF, bj4VarO, 0);
                    Object[] objArr4 = new Object[0];
                    bj4VarO.K(1971794796);
                    zJ2 = bj4VarO.j(attributeData) | bj4VarO.j(countryAreaCodeFromLocale);
                    objF2 = bj4VarO.f();
                    if (zJ2) {
                        objF2 = new mh4() { // from class: lba
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TextAttributeCollectorKt.TextAttributeCollector$lambda$9$lambda$8(attributeData, countryAreaCodeFromLocale);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: lba
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TextAttributeCollectorKt.TextAttributeCollector$lambda$9$lambda$8(attributeData, countryAreaCodeFromLocale);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    boolean z8 = z3;
                    bj4VarO.U(false);
                    h37Var2 = (h37) mm8.d(objArr4, (mh4) objF2, bj4VarO, 0);
                    if (zA) {
                        ox6VarD = oj5.e(ox6Var3);
                    } else {
                        ox6VarD = ir9.d(ox6Var3, 40.0f);
                    }
                    ox6 ox6Var7 = ox6VarD;
                    String strTextAttributeCollector$lambda$7 = TextAttributeCollector$lambda$6(h37Var);
                    ox6 ox6Var8 = ox6Var3;
                    boolean z9 = !zIsFormDisabled2;
                    oh4<? super String, g2b> oh4Var10 = oh4Var5;
                    dp5 dp5Var2 = new dp5(getKeyboardType(attributeData), 0, 123);
                    boolean z10 = !zA;
                    if (zA) {
                        i8 = 2;
                    } else {
                        i8 = 1;
                    }
                    bj4VarO.K(1971828325);
                    if (isPhoneType(attributeData)) {
                        fr1VarB = gr1.b(-1990705988, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.3
                            public final void invoke(jt1 jt1Var2, int i12) {
                                if ((i12 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(TextAttributeCollectorKt.TextAttributeCollector$lambda$10(h37Var2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO);
                    } else {
                        fr1VarB = null;
                    }
                    fr1 fr1Var2 = fr1VarB;
                    bj4VarO.U(false);
                    bj4VarO.K(1971804880);
                    zJ3 = bj4VarO.J(h37Var) | bj4VarO.j(attributeData) | bj4VarO.J(h37Var2);
                    objF3 = bj4VarO.f();
                    if (zJ3) {
                        objF3 = new mba(attributeData, h37Var, h37Var2);
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new mba(attributeData, h37Var, h37Var2);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    z4 = z8;
                    bj4Var = bj4VarO;
                    ox6Var2 = ox6Var8;
                    IntercomOutlinedTextFieldKt.IntercomOutlinedTextField(strTextAttributeCollector$lambda$7, (oh4) objF3, ox6Var7, z9, submitted2, null, null, gr1.b(-1290485581, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.5
                        public final void invoke(jt1 jt1Var2, int i12) {
                            if ((i12 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            AttributeData attributeData2 = attributeData;
                            CountryAreaCode countryAreaCode = countryAreaCodeFromLocale;
                            countryAreaCode.getClass();
                            mia.b(TextAttributeCollectorKt.getHint(attributeData2, countryAreaCode), null, IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), fr1Var2, gr1.b(930248561, new AnonymousClass6(zIsFormDisabled2, submitted2, z4, b72Var2, h37Var, oh4Var10, resources2, attributeData, oh4Var6), bj4VarO), false, null, dp5Var2, null, z10, 3, i8, null, b72Var2, null, null, bj4Var, 817889280, 196608, 0, 1715296);
                    oh4Var7 = oh4Var10;
                    oh4Var8 = oh4Var6;
                } else {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i11 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(1971770096);
                        objF5 = bj4VarO.f();
                        if (objF5 == c0187a) {
                            objF5 = new jba();
                            bj4VarO.C(objF5);
                        }
                        bj4VarO.U(false);
                        oh4Var5 = (oh4) objF5;
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(1971771792);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new ms0(i10);
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF4;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    Resources resources3 = context.getResources();
                    localeCompat = UtilsKt.getLocaleCompat(context);
                    b72 b72Var3 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                    if (isPhoneType(attributeData)) {
                        PhoneNumberValidator.loadCountryAreaCodes(context);
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                    } else {
                        countryAreaCodeFromLocale = CountryAreaCode.UNKNOWN;
                    }
                    boolean zIsFormDisabled3 = attributeData.isFormDisabled();
                    boolean submitted3 = attributeData.getAttribute().getSubmitted();
                    zA = xj5.a(attributeData.getAttribute().getMultiline(), Boolean.TRUE);
                    Object[] objArr5 = new Object[0];
                    bj4VarO.K(1971791653);
                    zJ = bj4VarO.j(attributeData);
                    objF = bj4VarO.f();
                    if (zJ) {
                        objF = new mh4() { // from class: kba
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TextAttributeCollectorKt.TextAttributeCollector$lambda$5$lambda$4(attributeData);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new mh4() { // from class: kba
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TextAttributeCollectorKt.TextAttributeCollector$lambda$5$lambda$4(attributeData);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    h37Var = (h37) mm8.d(objArr5, (mh4) objF, bj4VarO, 0);
                    Object[] objArr6 = new Object[0];
                    bj4VarO.K(1971794796);
                    zJ2 = bj4VarO.j(attributeData) | bj4VarO.j(countryAreaCodeFromLocale);
                    objF2 = bj4VarO.f();
                    if (zJ2) {
                        objF2 = new mh4() { // from class: lba
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TextAttributeCollectorKt.TextAttributeCollector$lambda$9$lambda$8(attributeData, countryAreaCodeFromLocale);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: lba
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TextAttributeCollectorKt.TextAttributeCollector$lambda$9$lambda$8(attributeData, countryAreaCodeFromLocale);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    boolean z11 = z3;
                    bj4VarO.U(false);
                    h37Var2 = (h37) mm8.d(objArr6, (mh4) objF2, bj4VarO, 0);
                    if (zA) {
                        ox6VarD = oj5.e(ox6Var3);
                    } else {
                        ox6VarD = ir9.d(ox6Var3, 40.0f);
                    }
                    ox6 ox6Var9 = ox6VarD;
                    String strTextAttributeCollector$lambda$8 = TextAttributeCollector$lambda$6(h37Var);
                    ox6 ox6Var10 = ox6Var3;
                    boolean z12 = !zIsFormDisabled3;
                    oh4<? super String, g2b> oh4Var11 = oh4Var5;
                    dp5 dp5Var3 = new dp5(getKeyboardType(attributeData), 0, 123);
                    boolean z13 = !zA;
                    if (zA) {
                        i8 = 2;
                    } else {
                        i8 = 1;
                    }
                    bj4VarO.K(1971828325);
                    if (isPhoneType(attributeData)) {
                        fr1VarB = gr1.b(-1990705988, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.3
                            public final void invoke(jt1 jt1Var2, int i12) {
                                if ((i12 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(TextAttributeCollectorKt.TextAttributeCollector$lambda$10(h37Var2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO);
                    } else {
                        fr1VarB = null;
                    }
                    fr1 fr1Var3 = fr1VarB;
                    bj4VarO.U(false);
                    bj4VarO.K(1971804880);
                    zJ3 = bj4VarO.J(h37Var) | bj4VarO.j(attributeData) | bj4VarO.J(h37Var2);
                    objF3 = bj4VarO.f();
                    if (zJ3) {
                        objF3 = new mba(attributeData, h37Var, h37Var2);
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new mba(attributeData, h37Var, h37Var2);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    z4 = z11;
                    bj4Var = bj4VarO;
                    ox6Var2 = ox6Var10;
                    IntercomOutlinedTextFieldKt.IntercomOutlinedTextField(strTextAttributeCollector$lambda$8, (oh4) objF3, ox6Var9, z12, submitted3, null, null, gr1.b(-1290485581, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.5
                        public final void invoke(jt1 jt1Var2, int i12) {
                            if ((i12 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            AttributeData attributeData2 = attributeData;
                            CountryAreaCode countryAreaCode = countryAreaCodeFromLocale;
                            countryAreaCode.getClass();
                            mia.b(TextAttributeCollectorKt.getHint(attributeData2, countryAreaCode), null, IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), fr1Var3, gr1.b(930248561, new AnonymousClass6(zIsFormDisabled3, submitted3, z4, b72Var3, h37Var, oh4Var11, resources3, attributeData, oh4Var6), bj4VarO), false, null, dp5Var3, null, z13, 3, i8, null, b72Var3, null, null, bj4Var, 817889280, 196608, 0, 1715296);
                    oh4Var7 = oh4Var11;
                    oh4Var8 = oh4Var6;
                }
                ox6Var4 = ox6Var2;
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: fba
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextAttributeCollectorKt.TextAttributeCollector$lambda$14(ox6Var4, attributeData, z4, oh4Var7, oh4Var8, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            oh4Var3 = oh4Var;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    oh4Var4 = oh4Var2;
                    if (bj4VarO.j(oh4Var4)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i3 & 9363) == 9362) {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i11 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(1971770096);
                        objF5 = bj4VarO.f();
                        if (objF5 == c0187a) {
                            objF5 = new jba();
                            bj4VarO.C(objF5);
                        }
                        bj4VarO.U(false);
                        oh4Var5 = (oh4) objF5;
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(1971771792);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new ms0(i10);
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF4;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    Resources resources4 = context.getResources();
                    localeCompat = UtilsKt.getLocaleCompat(context);
                    b72 b72Var4 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                    if (isPhoneType(attributeData)) {
                        PhoneNumberValidator.loadCountryAreaCodes(context);
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                    } else {
                        countryAreaCodeFromLocale = CountryAreaCode.UNKNOWN;
                    }
                    boolean zIsFormDisabled4 = attributeData.isFormDisabled();
                    boolean submitted4 = attributeData.getAttribute().getSubmitted();
                    zA = xj5.a(attributeData.getAttribute().getMultiline(), Boolean.TRUE);
                    Object[] objArr7 = new Object[0];
                    bj4VarO.K(1971791653);
                    zJ = bj4VarO.j(attributeData);
                    objF = bj4VarO.f();
                    if (zJ) {
                        objF = new mh4() { // from class: kba
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TextAttributeCollectorKt.TextAttributeCollector$lambda$5$lambda$4(attributeData);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new mh4() { // from class: kba
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TextAttributeCollectorKt.TextAttributeCollector$lambda$5$lambda$4(attributeData);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    h37Var = (h37) mm8.d(objArr7, (mh4) objF, bj4VarO, 0);
                    Object[] objArr8 = new Object[0];
                    bj4VarO.K(1971794796);
                    zJ2 = bj4VarO.j(attributeData) | bj4VarO.j(countryAreaCodeFromLocale);
                    objF2 = bj4VarO.f();
                    if (zJ2) {
                        objF2 = new mh4() { // from class: lba
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TextAttributeCollectorKt.TextAttributeCollector$lambda$9$lambda$8(attributeData, countryAreaCodeFromLocale);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: lba
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TextAttributeCollectorKt.TextAttributeCollector$lambda$9$lambda$8(attributeData, countryAreaCodeFromLocale);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    boolean z14 = z3;
                    bj4VarO.U(false);
                    h37Var2 = (h37) mm8.d(objArr8, (mh4) objF2, bj4VarO, 0);
                    if (zA) {
                        ox6VarD = oj5.e(ox6Var3);
                    } else {
                        ox6VarD = ir9.d(ox6Var3, 40.0f);
                    }
                    ox6 ox6Var11 = ox6VarD;
                    String strTextAttributeCollector$lambda$9 = TextAttributeCollector$lambda$6(h37Var);
                    ox6 ox6Var12 = ox6Var3;
                    boolean z15 = !zIsFormDisabled4;
                    oh4<? super String, g2b> oh4Var12 = oh4Var5;
                    dp5 dp5Var4 = new dp5(getKeyboardType(attributeData), 0, 123);
                    boolean z16 = !zA;
                    if (zA) {
                        i8 = 2;
                    } else {
                        i8 = 1;
                    }
                    bj4VarO.K(1971828325);
                    if (isPhoneType(attributeData)) {
                        fr1VarB = gr1.b(-1990705988, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.3
                            public final void invoke(jt1 jt1Var2, int i12) {
                                if ((i12 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(TextAttributeCollectorKt.TextAttributeCollector$lambda$10(h37Var2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO);
                    } else {
                        fr1VarB = null;
                    }
                    fr1 fr1Var4 = fr1VarB;
                    bj4VarO.U(false);
                    bj4VarO.K(1971804880);
                    zJ3 = bj4VarO.J(h37Var) | bj4VarO.j(attributeData) | bj4VarO.J(h37Var2);
                    objF3 = bj4VarO.f();
                    if (zJ3) {
                        objF3 = new mba(attributeData, h37Var, h37Var2);
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new mba(attributeData, h37Var, h37Var2);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    z4 = z14;
                    bj4Var = bj4VarO;
                    ox6Var2 = ox6Var12;
                    IntercomOutlinedTextFieldKt.IntercomOutlinedTextField(strTextAttributeCollector$lambda$9, (oh4) objF3, ox6Var11, z15, submitted4, null, null, gr1.b(-1290485581, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.5
                        public final void invoke(jt1 jt1Var2, int i12) {
                            if ((i12 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            AttributeData attributeData2 = attributeData;
                            CountryAreaCode countryAreaCode = countryAreaCodeFromLocale;
                            countryAreaCode.getClass();
                            mia.b(TextAttributeCollectorKt.getHint(attributeData2, countryAreaCode), null, IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), fr1Var4, gr1.b(930248561, new AnonymousClass6(zIsFormDisabled4, submitted4, z4, b72Var4, h37Var, oh4Var12, resources4, attributeData, oh4Var6), bj4VarO), false, null, dp5Var4, null, z16, 3, i8, null, b72Var4, null, null, bj4Var, 817889280, 196608, 0, 1715296);
                    oh4Var7 = oh4Var12;
                    oh4Var8 = oh4Var6;
                } else {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i11 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(1971770096);
                        objF5 = bj4VarO.f();
                        if (objF5 == c0187a) {
                            objF5 = new jba();
                            bj4VarO.C(objF5);
                        }
                        bj4VarO.U(false);
                        oh4Var5 = (oh4) objF5;
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(1971771792);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new ms0(i10);
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF4;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    Resources resources5 = context.getResources();
                    localeCompat = UtilsKt.getLocaleCompat(context);
                    b72 b72Var5 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                    if (isPhoneType(attributeData)) {
                        PhoneNumberValidator.loadCountryAreaCodes(context);
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                    } else {
                        countryAreaCodeFromLocale = CountryAreaCode.UNKNOWN;
                    }
                    boolean zIsFormDisabled5 = attributeData.isFormDisabled();
                    boolean submitted5 = attributeData.getAttribute().getSubmitted();
                    zA = xj5.a(attributeData.getAttribute().getMultiline(), Boolean.TRUE);
                    Object[] objArr9 = new Object[0];
                    bj4VarO.K(1971791653);
                    zJ = bj4VarO.j(attributeData);
                    objF = bj4VarO.f();
                    if (zJ) {
                        objF = new mh4() { // from class: kba
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TextAttributeCollectorKt.TextAttributeCollector$lambda$5$lambda$4(attributeData);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new mh4() { // from class: kba
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TextAttributeCollectorKt.TextAttributeCollector$lambda$5$lambda$4(attributeData);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    h37Var = (h37) mm8.d(objArr9, (mh4) objF, bj4VarO, 0);
                    Object[] objArr10 = new Object[0];
                    bj4VarO.K(1971794796);
                    zJ2 = bj4VarO.j(attributeData) | bj4VarO.j(countryAreaCodeFromLocale);
                    objF2 = bj4VarO.f();
                    if (zJ2) {
                        objF2 = new mh4() { // from class: lba
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TextAttributeCollectorKt.TextAttributeCollector$lambda$9$lambda$8(attributeData, countryAreaCodeFromLocale);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: lba
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TextAttributeCollectorKt.TextAttributeCollector$lambda$9$lambda$8(attributeData, countryAreaCodeFromLocale);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    boolean z17 = z3;
                    bj4VarO.U(false);
                    h37Var2 = (h37) mm8.d(objArr10, (mh4) objF2, bj4VarO, 0);
                    if (zA) {
                        ox6VarD = oj5.e(ox6Var3);
                    } else {
                        ox6VarD = ir9.d(ox6Var3, 40.0f);
                    }
                    ox6 ox6Var13 = ox6VarD;
                    String strTextAttributeCollector$lambda$10 = TextAttributeCollector$lambda$6(h37Var);
                    ox6 ox6Var14 = ox6Var3;
                    boolean z18 = !zIsFormDisabled5;
                    oh4<? super String, g2b> oh4Var13 = oh4Var5;
                    dp5 dp5Var5 = new dp5(getKeyboardType(attributeData), 0, 123);
                    boolean z19 = !zA;
                    if (zA) {
                        i8 = 2;
                    } else {
                        i8 = 1;
                    }
                    bj4VarO.K(1971828325);
                    if (isPhoneType(attributeData)) {
                        fr1VarB = gr1.b(-1990705988, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.3
                            public final void invoke(jt1 jt1Var2, int i12) {
                                if ((i12 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(TextAttributeCollectorKt.TextAttributeCollector$lambda$10(h37Var2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO);
                    } else {
                        fr1VarB = null;
                    }
                    fr1 fr1Var5 = fr1VarB;
                    bj4VarO.U(false);
                    bj4VarO.K(1971804880);
                    zJ3 = bj4VarO.J(h37Var) | bj4VarO.j(attributeData) | bj4VarO.J(h37Var2);
                    objF3 = bj4VarO.f();
                    if (zJ3) {
                        objF3 = new mba(attributeData, h37Var, h37Var2);
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new mba(attributeData, h37Var, h37Var2);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    z4 = z17;
                    bj4Var = bj4VarO;
                    ox6Var2 = ox6Var14;
                    IntercomOutlinedTextFieldKt.IntercomOutlinedTextField(strTextAttributeCollector$lambda$10, (oh4) objF3, ox6Var13, z18, submitted5, null, null, gr1.b(-1290485581, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.5
                        public final void invoke(jt1 jt1Var2, int i12) {
                            if ((i12 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            AttributeData attributeData2 = attributeData;
                            CountryAreaCode countryAreaCode = countryAreaCodeFromLocale;
                            countryAreaCode.getClass();
                            mia.b(TextAttributeCollectorKt.getHint(attributeData2, countryAreaCode), null, IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), fr1Var5, gr1.b(930248561, new AnonymousClass6(zIsFormDisabled5, submitted5, z4, b72Var5, h37Var, oh4Var13, resources5, attributeData, oh4Var6), bj4VarO), false, null, dp5Var5, null, z19, 3, i8, null, b72Var5, null, null, bj4Var, 817889280, 196608, 0, 1715296);
                    oh4Var7 = oh4Var13;
                    oh4Var8 = oh4Var6;
                }
                ox6Var4 = ox6Var2;
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: fba
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextAttributeCollectorKt.TextAttributeCollector$lambda$14(ox6Var4, attributeData, z4, oh4Var7, oh4Var8, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            oh4Var4 = oh4Var2;
            if ((i3 & 9363) == 9362) {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i11 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(1971770096);
                    objF5 = bj4VarO.f();
                    if (objF5 == c0187a) {
                        objF5 = new jba();
                        bj4VarO.C(objF5);
                    }
                    bj4VarO.U(false);
                    oh4Var5 = (oh4) objF5;
                } else {
                    oh4Var5 = oh4Var3;
                }
                if (i6 != 0) {
                    bj4VarO.K(1971771792);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new ms0(i10);
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    oh4Var6 = (oh4) objF4;
                } else {
                    oh4Var6 = oh4Var4;
                }
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                Resources resources6 = context.getResources();
                localeCompat = UtilsKt.getLocaleCompat(context);
                b72 b72Var6 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                if (isPhoneType(attributeData)) {
                    PhoneNumberValidator.loadCountryAreaCodes(context);
                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                } else {
                    countryAreaCodeFromLocale = CountryAreaCode.UNKNOWN;
                }
                boolean zIsFormDisabled6 = attributeData.isFormDisabled();
                boolean submitted6 = attributeData.getAttribute().getSubmitted();
                zA = xj5.a(attributeData.getAttribute().getMultiline(), Boolean.TRUE);
                Object[] objArr11 = new Object[0];
                bj4VarO.K(1971791653);
                zJ = bj4VarO.j(attributeData);
                objF = bj4VarO.f();
                if (zJ) {
                    objF = new mh4() { // from class: kba
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TextAttributeCollectorKt.TextAttributeCollector$lambda$5$lambda$4(attributeData);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new mh4() { // from class: kba
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TextAttributeCollectorKt.TextAttributeCollector$lambda$5$lambda$4(attributeData);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                h37Var = (h37) mm8.d(objArr11, (mh4) objF, bj4VarO, 0);
                Object[] objArr12 = new Object[0];
                bj4VarO.K(1971794796);
                zJ2 = bj4VarO.j(attributeData) | bj4VarO.j(countryAreaCodeFromLocale);
                objF2 = bj4VarO.f();
                if (zJ2) {
                    objF2 = new mh4() { // from class: lba
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TextAttributeCollectorKt.TextAttributeCollector$lambda$9$lambda$8(attributeData, countryAreaCodeFromLocale);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: lba
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TextAttributeCollectorKt.TextAttributeCollector$lambda$9$lambda$8(attributeData, countryAreaCodeFromLocale);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                boolean z110 = z3;
                bj4VarO.U(false);
                h37Var2 = (h37) mm8.d(objArr12, (mh4) objF2, bj4VarO, 0);
                if (zA) {
                    ox6VarD = oj5.e(ox6Var3);
                } else {
                    ox6VarD = ir9.d(ox6Var3, 40.0f);
                }
                ox6 ox6Var15 = ox6VarD;
                String strTextAttributeCollector$lambda$11 = TextAttributeCollector$lambda$6(h37Var);
                ox6 ox6Var16 = ox6Var3;
                boolean z111 = !zIsFormDisabled6;
                oh4<? super String, g2b> oh4Var14 = oh4Var5;
                dp5 dp5Var6 = new dp5(getKeyboardType(attributeData), 0, 123);
                boolean z112 = !zA;
                if (zA) {
                    i8 = 2;
                } else {
                    i8 = 1;
                }
                bj4VarO.K(1971828325);
                if (isPhoneType(attributeData)) {
                    fr1VarB = gr1.b(-1990705988, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.3
                        public final void invoke(jt1 jt1Var2, int i12) {
                            if ((i12 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(TextAttributeCollectorKt.TextAttributeCollector$lambda$10(h37Var2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO);
                } else {
                    fr1VarB = null;
                }
                fr1 fr1Var6 = fr1VarB;
                bj4VarO.U(false);
                bj4VarO.K(1971804880);
                zJ3 = bj4VarO.J(h37Var) | bj4VarO.j(attributeData) | bj4VarO.J(h37Var2);
                objF3 = bj4VarO.f();
                if (zJ3) {
                    objF3 = new mba(attributeData, h37Var, h37Var2);
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new mba(attributeData, h37Var, h37Var2);
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                z4 = z110;
                bj4Var = bj4VarO;
                ox6Var2 = ox6Var16;
                IntercomOutlinedTextFieldKt.IntercomOutlinedTextField(strTextAttributeCollector$lambda$11, (oh4) objF3, ox6Var15, z111, submitted6, null, null, gr1.b(-1290485581, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.5
                    public final void invoke(jt1 jt1Var2, int i12) {
                        if ((i12 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        AttributeData attributeData2 = attributeData;
                        CountryAreaCode countryAreaCode = countryAreaCodeFromLocale;
                        countryAreaCode.getClass();
                        mia.b(TextAttributeCollectorKt.getHint(attributeData2, countryAreaCode), null, IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), fr1Var6, gr1.b(930248561, new AnonymousClass6(zIsFormDisabled6, submitted6, z4, b72Var6, h37Var, oh4Var14, resources6, attributeData, oh4Var6), bj4VarO), false, null, dp5Var6, null, z112, 3, i8, null, b72Var6, null, null, bj4Var, 817889280, 196608, 0, 1715296);
                oh4Var7 = oh4Var14;
                oh4Var8 = oh4Var6;
            } else {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i11 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(1971770096);
                    objF5 = bj4VarO.f();
                    if (objF5 == c0187a) {
                        objF5 = new jba();
                        bj4VarO.C(objF5);
                    }
                    bj4VarO.U(false);
                    oh4Var5 = (oh4) objF5;
                } else {
                    oh4Var5 = oh4Var3;
                }
                if (i6 != 0) {
                    bj4VarO.K(1971771792);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new ms0(i10);
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    oh4Var6 = (oh4) objF4;
                } else {
                    oh4Var6 = oh4Var4;
                }
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                Resources resources7 = context.getResources();
                localeCompat = UtilsKt.getLocaleCompat(context);
                b72 b72Var7 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                if (isPhoneType(attributeData)) {
                    PhoneNumberValidator.loadCountryAreaCodes(context);
                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                } else {
                    countryAreaCodeFromLocale = CountryAreaCode.UNKNOWN;
                }
                boolean zIsFormDisabled7 = attributeData.isFormDisabled();
                boolean submitted7 = attributeData.getAttribute().getSubmitted();
                zA = xj5.a(attributeData.getAttribute().getMultiline(), Boolean.TRUE);
                Object[] objArr13 = new Object[0];
                bj4VarO.K(1971791653);
                zJ = bj4VarO.j(attributeData);
                objF = bj4VarO.f();
                if (zJ) {
                    objF = new mh4() { // from class: kba
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TextAttributeCollectorKt.TextAttributeCollector$lambda$5$lambda$4(attributeData);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new mh4() { // from class: kba
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TextAttributeCollectorKt.TextAttributeCollector$lambda$5$lambda$4(attributeData);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                h37Var = (h37) mm8.d(objArr13, (mh4) objF, bj4VarO, 0);
                Object[] objArr14 = new Object[0];
                bj4VarO.K(1971794796);
                zJ2 = bj4VarO.j(attributeData) | bj4VarO.j(countryAreaCodeFromLocale);
                objF2 = bj4VarO.f();
                if (zJ2) {
                    objF2 = new mh4() { // from class: lba
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TextAttributeCollectorKt.TextAttributeCollector$lambda$9$lambda$8(attributeData, countryAreaCodeFromLocale);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: lba
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TextAttributeCollectorKt.TextAttributeCollector$lambda$9$lambda$8(attributeData, countryAreaCodeFromLocale);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                boolean z113 = z3;
                bj4VarO.U(false);
                h37Var2 = (h37) mm8.d(objArr14, (mh4) objF2, bj4VarO, 0);
                if (zA) {
                    ox6VarD = oj5.e(ox6Var3);
                } else {
                    ox6VarD = ir9.d(ox6Var3, 40.0f);
                }
                ox6 ox6Var17 = ox6VarD;
                String strTextAttributeCollector$lambda$12 = TextAttributeCollector$lambda$6(h37Var);
                ox6 ox6Var18 = ox6Var3;
                boolean z114 = !zIsFormDisabled7;
                oh4<? super String, g2b> oh4Var15 = oh4Var5;
                dp5 dp5Var7 = new dp5(getKeyboardType(attributeData), 0, 123);
                boolean z115 = !zA;
                if (zA) {
                    i8 = 2;
                } else {
                    i8 = 1;
                }
                bj4VarO.K(1971828325);
                if (isPhoneType(attributeData)) {
                    fr1VarB = gr1.b(-1990705988, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.3
                        public final void invoke(jt1 jt1Var2, int i12) {
                            if ((i12 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(TextAttributeCollectorKt.TextAttributeCollector$lambda$10(h37Var2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO);
                } else {
                    fr1VarB = null;
                }
                fr1 fr1Var7 = fr1VarB;
                bj4VarO.U(false);
                bj4VarO.K(1971804880);
                zJ3 = bj4VarO.J(h37Var) | bj4VarO.j(attributeData) | bj4VarO.J(h37Var2);
                objF3 = bj4VarO.f();
                if (zJ3) {
                    objF3 = new mba(attributeData, h37Var, h37Var2);
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new mba(attributeData, h37Var, h37Var2);
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                z4 = z113;
                bj4Var = bj4VarO;
                ox6Var2 = ox6Var18;
                IntercomOutlinedTextFieldKt.IntercomOutlinedTextField(strTextAttributeCollector$lambda$12, (oh4) objF3, ox6Var17, z114, submitted7, null, null, gr1.b(-1290485581, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.5
                    public final void invoke(jt1 jt1Var2, int i12) {
                        if ((i12 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        AttributeData attributeData2 = attributeData;
                        CountryAreaCode countryAreaCode = countryAreaCodeFromLocale;
                        countryAreaCode.getClass();
                        mia.b(TextAttributeCollectorKt.getHint(attributeData2, countryAreaCode), null, IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), fr1Var7, gr1.b(930248561, new AnonymousClass6(zIsFormDisabled7, submitted7, z4, b72Var7, h37Var, oh4Var15, resources7, attributeData, oh4Var6), bj4VarO), false, null, dp5Var7, null, z115, 3, i8, null, b72Var7, null, null, bj4Var, 817889280, 196608, 0, 1715296);
                oh4Var7 = oh4Var15;
                oh4Var8 = oh4Var6;
            }
            ox6Var4 = ox6Var2;
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: fba
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TextAttributeCollectorKt.TextAttributeCollector$lambda$14(ox6Var4, attributeData, z4, oh4Var7, oh4Var8, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        z2 = z;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                oh4Var3 = oh4Var;
                if (bj4VarO.j(oh4Var3)) {
                    i5 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    oh4Var4 = oh4Var2;
                    if (bj4VarO.j(oh4Var4)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i3 & 9363) == 9362) {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i11 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(1971770096);
                        objF5 = bj4VarO.f();
                        if (objF5 == c0187a) {
                            objF5 = new jba();
                            bj4VarO.C(objF5);
                        }
                        bj4VarO.U(false);
                        oh4Var5 = (oh4) objF5;
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(1971771792);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new ms0(i10);
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF4;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    Resources resources8 = context.getResources();
                    localeCompat = UtilsKt.getLocaleCompat(context);
                    b72 b72Var8 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                    if (isPhoneType(attributeData)) {
                        PhoneNumberValidator.loadCountryAreaCodes(context);
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                    } else {
                        countryAreaCodeFromLocale = CountryAreaCode.UNKNOWN;
                    }
                    boolean zIsFormDisabled8 = attributeData.isFormDisabled();
                    boolean submitted8 = attributeData.getAttribute().getSubmitted();
                    zA = xj5.a(attributeData.getAttribute().getMultiline(), Boolean.TRUE);
                    Object[] objArr15 = new Object[0];
                    bj4VarO.K(1971791653);
                    zJ = bj4VarO.j(attributeData);
                    objF = bj4VarO.f();
                    if (zJ) {
                        objF = new mh4() { // from class: kba
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TextAttributeCollectorKt.TextAttributeCollector$lambda$5$lambda$4(attributeData);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new mh4() { // from class: kba
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TextAttributeCollectorKt.TextAttributeCollector$lambda$5$lambda$4(attributeData);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    h37Var = (h37) mm8.d(objArr15, (mh4) objF, bj4VarO, 0);
                    Object[] objArr16 = new Object[0];
                    bj4VarO.K(1971794796);
                    zJ2 = bj4VarO.j(attributeData) | bj4VarO.j(countryAreaCodeFromLocale);
                    objF2 = bj4VarO.f();
                    if (zJ2) {
                        objF2 = new mh4() { // from class: lba
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TextAttributeCollectorKt.TextAttributeCollector$lambda$9$lambda$8(attributeData, countryAreaCodeFromLocale);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: lba
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TextAttributeCollectorKt.TextAttributeCollector$lambda$9$lambda$8(attributeData, countryAreaCodeFromLocale);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    boolean z116 = z3;
                    bj4VarO.U(false);
                    h37Var2 = (h37) mm8.d(objArr16, (mh4) objF2, bj4VarO, 0);
                    if (zA) {
                        ox6VarD = oj5.e(ox6Var3);
                    } else {
                        ox6VarD = ir9.d(ox6Var3, 40.0f);
                    }
                    ox6 ox6Var19 = ox6VarD;
                    String strTextAttributeCollector$lambda$13 = TextAttributeCollector$lambda$6(h37Var);
                    ox6 ox6Var110 = ox6Var3;
                    boolean z117 = !zIsFormDisabled8;
                    oh4<? super String, g2b> oh4Var16 = oh4Var5;
                    dp5 dp5Var8 = new dp5(getKeyboardType(attributeData), 0, 123);
                    boolean z118 = !zA;
                    if (zA) {
                        i8 = 2;
                    } else {
                        i8 = 1;
                    }
                    bj4VarO.K(1971828325);
                    if (isPhoneType(attributeData)) {
                        fr1VarB = gr1.b(-1990705988, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.3
                            public final void invoke(jt1 jt1Var2, int i12) {
                                if ((i12 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(TextAttributeCollectorKt.TextAttributeCollector$lambda$10(h37Var2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO);
                    } else {
                        fr1VarB = null;
                    }
                    fr1 fr1Var8 = fr1VarB;
                    bj4VarO.U(false);
                    bj4VarO.K(1971804880);
                    zJ3 = bj4VarO.J(h37Var) | bj4VarO.j(attributeData) | bj4VarO.J(h37Var2);
                    objF3 = bj4VarO.f();
                    if (zJ3) {
                        objF3 = new mba(attributeData, h37Var, h37Var2);
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new mba(attributeData, h37Var, h37Var2);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    z4 = z116;
                    bj4Var = bj4VarO;
                    ox6Var2 = ox6Var110;
                    IntercomOutlinedTextFieldKt.IntercomOutlinedTextField(strTextAttributeCollector$lambda$13, (oh4) objF3, ox6Var19, z117, submitted8, null, null, gr1.b(-1290485581, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.5
                        public final void invoke(jt1 jt1Var2, int i12) {
                            if ((i12 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            AttributeData attributeData2 = attributeData;
                            CountryAreaCode countryAreaCode = countryAreaCodeFromLocale;
                            countryAreaCode.getClass();
                            mia.b(TextAttributeCollectorKt.getHint(attributeData2, countryAreaCode), null, IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), fr1Var8, gr1.b(930248561, new AnonymousClass6(zIsFormDisabled8, submitted8, z4, b72Var8, h37Var, oh4Var16, resources8, attributeData, oh4Var6), bj4VarO), false, null, dp5Var8, null, z118, 3, i8, null, b72Var8, null, null, bj4Var, 817889280, 196608, 0, 1715296);
                    oh4Var7 = oh4Var16;
                    oh4Var8 = oh4Var6;
                } else {
                    if (i9 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i11 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    c0187a = jt1.a.a;
                    if (i4 != 0) {
                        bj4VarO.K(1971770096);
                        objF5 = bj4VarO.f();
                        if (objF5 == c0187a) {
                            objF5 = new jba();
                            bj4VarO.C(objF5);
                        }
                        bj4VarO.U(false);
                        oh4Var5 = (oh4) objF5;
                    } else {
                        oh4Var5 = oh4Var3;
                    }
                    if (i6 != 0) {
                        bj4VarO.K(1971771792);
                        objF4 = bj4VarO.f();
                        if (objF4 == c0187a) {
                            objF4 = new ms0(i10);
                            bj4VarO.C(objF4);
                        }
                        bj4VarO.U(false);
                        oh4Var6 = (oh4) objF4;
                    } else {
                        oh4Var6 = oh4Var4;
                    }
                    context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    Resources resources9 = context.getResources();
                    localeCompat = UtilsKt.getLocaleCompat(context);
                    b72 b72Var9 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                    if (isPhoneType(attributeData)) {
                        PhoneNumberValidator.loadCountryAreaCodes(context);
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                    } else {
                        countryAreaCodeFromLocale = CountryAreaCode.UNKNOWN;
                    }
                    boolean zIsFormDisabled9 = attributeData.isFormDisabled();
                    boolean submitted9 = attributeData.getAttribute().getSubmitted();
                    zA = xj5.a(attributeData.getAttribute().getMultiline(), Boolean.TRUE);
                    Object[] objArr17 = new Object[0];
                    bj4VarO.K(1971791653);
                    zJ = bj4VarO.j(attributeData);
                    objF = bj4VarO.f();
                    if (zJ) {
                        objF = new mh4() { // from class: kba
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TextAttributeCollectorKt.TextAttributeCollector$lambda$5$lambda$4(attributeData);
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new mh4() { // from class: kba
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TextAttributeCollectorKt.TextAttributeCollector$lambda$5$lambda$4(attributeData);
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    h37Var = (h37) mm8.d(objArr17, (mh4) objF, bj4VarO, 0);
                    Object[] objArr18 = new Object[0];
                    bj4VarO.K(1971794796);
                    zJ2 = bj4VarO.j(attributeData) | bj4VarO.j(countryAreaCodeFromLocale);
                    objF2 = bj4VarO.f();
                    if (zJ2) {
                        objF2 = new mh4() { // from class: lba
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TextAttributeCollectorKt.TextAttributeCollector$lambda$9$lambda$8(attributeData, countryAreaCodeFromLocale);
                            }
                        };
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new mh4() { // from class: lba
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return TextAttributeCollectorKt.TextAttributeCollector$lambda$9$lambda$8(attributeData, countryAreaCodeFromLocale);
                            }
                        };
                        bj4VarO.C(objF2);
                    }
                    boolean z119 = z3;
                    bj4VarO.U(false);
                    h37Var2 = (h37) mm8.d(objArr18, (mh4) objF2, bj4VarO, 0);
                    if (zA) {
                        ox6VarD = oj5.e(ox6Var3);
                    } else {
                        ox6VarD = ir9.d(ox6Var3, 40.0f);
                    }
                    ox6 ox6Var111 = ox6VarD;
                    String strTextAttributeCollector$lambda$14 = TextAttributeCollector$lambda$6(h37Var);
                    ox6 ox6Var112 = ox6Var3;
                    boolean z1110 = !zIsFormDisabled9;
                    oh4<? super String, g2b> oh4Var17 = oh4Var5;
                    dp5 dp5Var9 = new dp5(getKeyboardType(attributeData), 0, 123);
                    boolean z1111 = !zA;
                    if (zA) {
                        i8 = 2;
                    } else {
                        i8 = 1;
                    }
                    bj4VarO.K(1971828325);
                    if (isPhoneType(attributeData)) {
                        fr1VarB = gr1.b(-1990705988, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.3
                            public final void invoke(jt1 jt1Var2, int i12) {
                                if ((i12 & 3) == 2 && jt1Var2.r()) {
                                    jt1Var2.u();
                                } else {
                                    mia.b(TextAttributeCollectorKt.TextAttributeCollector$lambda$10(h37Var2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
                                }
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO);
                    } else {
                        fr1VarB = null;
                    }
                    fr1 fr1Var9 = fr1VarB;
                    bj4VarO.U(false);
                    bj4VarO.K(1971804880);
                    zJ3 = bj4VarO.J(h37Var) | bj4VarO.j(attributeData) | bj4VarO.J(h37Var2);
                    objF3 = bj4VarO.f();
                    if (zJ3) {
                        objF3 = new mba(attributeData, h37Var, h37Var2);
                        bj4VarO.C(objF3);
                    } else {
                        objF3 = new mba(attributeData, h37Var, h37Var2);
                        bj4VarO.C(objF3);
                    }
                    bj4VarO.U(false);
                    z4 = z119;
                    bj4Var = bj4VarO;
                    ox6Var2 = ox6Var112;
                    IntercomOutlinedTextFieldKt.IntercomOutlinedTextField(strTextAttributeCollector$lambda$14, (oh4) objF3, ox6Var111, z1110, submitted9, null, null, gr1.b(-1290485581, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.5
                        public final void invoke(jt1 jt1Var2, int i12) {
                            if ((i12 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                                return;
                            }
                            AttributeData attributeData2 = attributeData;
                            CountryAreaCode countryAreaCode = countryAreaCodeFromLocale;
                            countryAreaCode.getClass();
                            mia.b(TextAttributeCollectorKt.getHint(attributeData2, countryAreaCode), null, IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), fr1Var9, gr1.b(930248561, new AnonymousClass6(zIsFormDisabled9, submitted9, z4, b72Var9, h37Var, oh4Var17, resources9, attributeData, oh4Var6), bj4VarO), false, null, dp5Var9, null, z1111, 3, i8, null, b72Var9, null, null, bj4Var, 817889280, 196608, 0, 1715296);
                    oh4Var7 = oh4Var17;
                    oh4Var8 = oh4Var6;
                }
                ox6Var4 = ox6Var2;
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: fba
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextAttributeCollectorKt.TextAttributeCollector$lambda$14(ox6Var4, attributeData, z4, oh4Var7, oh4Var8, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 24576;
            oh4Var4 = oh4Var2;
            if ((i3 & 9363) == 9362) {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i11 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(1971770096);
                    objF5 = bj4VarO.f();
                    if (objF5 == c0187a) {
                        objF5 = new jba();
                        bj4VarO.C(objF5);
                    }
                    bj4VarO.U(false);
                    oh4Var5 = (oh4) objF5;
                } else {
                    oh4Var5 = oh4Var3;
                }
                if (i6 != 0) {
                    bj4VarO.K(1971771792);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new ms0(i10);
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    oh4Var6 = (oh4) objF4;
                } else {
                    oh4Var6 = oh4Var4;
                }
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                Resources resources10 = context.getResources();
                localeCompat = UtilsKt.getLocaleCompat(context);
                b72 b72Var10 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                if (isPhoneType(attributeData)) {
                    PhoneNumberValidator.loadCountryAreaCodes(context);
                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                } else {
                    countryAreaCodeFromLocale = CountryAreaCode.UNKNOWN;
                }
                boolean zIsFormDisabled10 = attributeData.isFormDisabled();
                boolean submitted10 = attributeData.getAttribute().getSubmitted();
                zA = xj5.a(attributeData.getAttribute().getMultiline(), Boolean.TRUE);
                Object[] objArr19 = new Object[0];
                bj4VarO.K(1971791653);
                zJ = bj4VarO.j(attributeData);
                objF = bj4VarO.f();
                if (zJ) {
                    objF = new mh4() { // from class: kba
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TextAttributeCollectorKt.TextAttributeCollector$lambda$5$lambda$4(attributeData);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new mh4() { // from class: kba
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TextAttributeCollectorKt.TextAttributeCollector$lambda$5$lambda$4(attributeData);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                h37Var = (h37) mm8.d(objArr19, (mh4) objF, bj4VarO, 0);
                Object[] objArr110 = new Object[0];
                bj4VarO.K(1971794796);
                zJ2 = bj4VarO.j(attributeData) | bj4VarO.j(countryAreaCodeFromLocale);
                objF2 = bj4VarO.f();
                if (zJ2) {
                    objF2 = new mh4() { // from class: lba
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TextAttributeCollectorKt.TextAttributeCollector$lambda$9$lambda$8(attributeData, countryAreaCodeFromLocale);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: lba
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TextAttributeCollectorKt.TextAttributeCollector$lambda$9$lambda$8(attributeData, countryAreaCodeFromLocale);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                boolean z1112 = z3;
                bj4VarO.U(false);
                h37Var2 = (h37) mm8.d(objArr110, (mh4) objF2, bj4VarO, 0);
                if (zA) {
                    ox6VarD = oj5.e(ox6Var3);
                } else {
                    ox6VarD = ir9.d(ox6Var3, 40.0f);
                }
                ox6 ox6Var113 = ox6VarD;
                String strTextAttributeCollector$lambda$15 = TextAttributeCollector$lambda$6(h37Var);
                ox6 ox6Var114 = ox6Var3;
                boolean z1113 = !zIsFormDisabled10;
                oh4<? super String, g2b> oh4Var18 = oh4Var5;
                dp5 dp5Var10 = new dp5(getKeyboardType(attributeData), 0, 123);
                boolean z1114 = !zA;
                if (zA) {
                    i8 = 2;
                } else {
                    i8 = 1;
                }
                bj4VarO.K(1971828325);
                if (isPhoneType(attributeData)) {
                    fr1VarB = gr1.b(-1990705988, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.3
                        public final void invoke(jt1 jt1Var2, int i12) {
                            if ((i12 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(TextAttributeCollectorKt.TextAttributeCollector$lambda$10(h37Var2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO);
                } else {
                    fr1VarB = null;
                }
                fr1 fr1Var10 = fr1VarB;
                bj4VarO.U(false);
                bj4VarO.K(1971804880);
                zJ3 = bj4VarO.J(h37Var) | bj4VarO.j(attributeData) | bj4VarO.J(h37Var2);
                objF3 = bj4VarO.f();
                if (zJ3) {
                    objF3 = new mba(attributeData, h37Var, h37Var2);
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new mba(attributeData, h37Var, h37Var2);
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                z4 = z1112;
                bj4Var = bj4VarO;
                ox6Var2 = ox6Var114;
                IntercomOutlinedTextFieldKt.IntercomOutlinedTextField(strTextAttributeCollector$lambda$15, (oh4) objF3, ox6Var113, z1113, submitted10, null, null, gr1.b(-1290485581, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.5
                    public final void invoke(jt1 jt1Var2, int i12) {
                        if ((i12 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        AttributeData attributeData2 = attributeData;
                        CountryAreaCode countryAreaCode = countryAreaCodeFromLocale;
                        countryAreaCode.getClass();
                        mia.b(TextAttributeCollectorKt.getHint(attributeData2, countryAreaCode), null, IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), fr1Var10, gr1.b(930248561, new AnonymousClass6(zIsFormDisabled10, submitted10, z4, b72Var10, h37Var, oh4Var18, resources10, attributeData, oh4Var6), bj4VarO), false, null, dp5Var10, null, z1114, 3, i8, null, b72Var10, null, null, bj4Var, 817889280, 196608, 0, 1715296);
                oh4Var7 = oh4Var18;
                oh4Var8 = oh4Var6;
            } else {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i11 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(1971770096);
                    objF5 = bj4VarO.f();
                    if (objF5 == c0187a) {
                        objF5 = new jba();
                        bj4VarO.C(objF5);
                    }
                    bj4VarO.U(false);
                    oh4Var5 = (oh4) objF5;
                } else {
                    oh4Var5 = oh4Var3;
                }
                if (i6 != 0) {
                    bj4VarO.K(1971771792);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new ms0(i10);
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    oh4Var6 = (oh4) objF4;
                } else {
                    oh4Var6 = oh4Var4;
                }
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                Resources resources11 = context.getResources();
                localeCompat = UtilsKt.getLocaleCompat(context);
                b72 b72Var11 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                if (isPhoneType(attributeData)) {
                    PhoneNumberValidator.loadCountryAreaCodes(context);
                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                } else {
                    countryAreaCodeFromLocale = CountryAreaCode.UNKNOWN;
                }
                boolean zIsFormDisabled11 = attributeData.isFormDisabled();
                boolean submitted11 = attributeData.getAttribute().getSubmitted();
                zA = xj5.a(attributeData.getAttribute().getMultiline(), Boolean.TRUE);
                Object[] objArr111 = new Object[0];
                bj4VarO.K(1971791653);
                zJ = bj4VarO.j(attributeData);
                objF = bj4VarO.f();
                if (zJ) {
                    objF = new mh4() { // from class: kba
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TextAttributeCollectorKt.TextAttributeCollector$lambda$5$lambda$4(attributeData);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new mh4() { // from class: kba
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TextAttributeCollectorKt.TextAttributeCollector$lambda$5$lambda$4(attributeData);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                h37Var = (h37) mm8.d(objArr111, (mh4) objF, bj4VarO, 0);
                Object[] objArr112 = new Object[0];
                bj4VarO.K(1971794796);
                zJ2 = bj4VarO.j(attributeData) | bj4VarO.j(countryAreaCodeFromLocale);
                objF2 = bj4VarO.f();
                if (zJ2) {
                    objF2 = new mh4() { // from class: lba
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TextAttributeCollectorKt.TextAttributeCollector$lambda$9$lambda$8(attributeData, countryAreaCodeFromLocale);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: lba
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TextAttributeCollectorKt.TextAttributeCollector$lambda$9$lambda$8(attributeData, countryAreaCodeFromLocale);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                boolean z1115 = z3;
                bj4VarO.U(false);
                h37Var2 = (h37) mm8.d(objArr112, (mh4) objF2, bj4VarO, 0);
                if (zA) {
                    ox6VarD = oj5.e(ox6Var3);
                } else {
                    ox6VarD = ir9.d(ox6Var3, 40.0f);
                }
                ox6 ox6Var115 = ox6VarD;
                String strTextAttributeCollector$lambda$16 = TextAttributeCollector$lambda$6(h37Var);
                ox6 ox6Var116 = ox6Var3;
                boolean z1116 = !zIsFormDisabled11;
                oh4<? super String, g2b> oh4Var19 = oh4Var5;
                dp5 dp5Var11 = new dp5(getKeyboardType(attributeData), 0, 123);
                boolean z1117 = !zA;
                if (zA) {
                    i8 = 2;
                } else {
                    i8 = 1;
                }
                bj4VarO.K(1971828325);
                if (isPhoneType(attributeData)) {
                    fr1VarB = gr1.b(-1990705988, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.3
                        public final void invoke(jt1 jt1Var2, int i12) {
                            if ((i12 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(TextAttributeCollectorKt.TextAttributeCollector$lambda$10(h37Var2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO);
                } else {
                    fr1VarB = null;
                }
                fr1 fr1Var11 = fr1VarB;
                bj4VarO.U(false);
                bj4VarO.K(1971804880);
                zJ3 = bj4VarO.J(h37Var) | bj4VarO.j(attributeData) | bj4VarO.J(h37Var2);
                objF3 = bj4VarO.f();
                if (zJ3) {
                    objF3 = new mba(attributeData, h37Var, h37Var2);
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new mba(attributeData, h37Var, h37Var2);
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                z4 = z1115;
                bj4Var = bj4VarO;
                ox6Var2 = ox6Var116;
                IntercomOutlinedTextFieldKt.IntercomOutlinedTextField(strTextAttributeCollector$lambda$16, (oh4) objF3, ox6Var115, z1116, submitted11, null, null, gr1.b(-1290485581, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.5
                    public final void invoke(jt1 jt1Var2, int i12) {
                        if ((i12 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        AttributeData attributeData2 = attributeData;
                        CountryAreaCode countryAreaCode = countryAreaCodeFromLocale;
                        countryAreaCode.getClass();
                        mia.b(TextAttributeCollectorKt.getHint(attributeData2, countryAreaCode), null, IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), fr1Var11, gr1.b(930248561, new AnonymousClass6(zIsFormDisabled11, submitted11, z4, b72Var11, h37Var, oh4Var19, resources11, attributeData, oh4Var6), bj4VarO), false, null, dp5Var11, null, z1117, 3, i8, null, b72Var11, null, null, bj4Var, 817889280, 196608, 0, 1715296);
                oh4Var7 = oh4Var19;
                oh4Var8 = oh4Var6;
            }
            ox6Var4 = ox6Var2;
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: fba
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TextAttributeCollectorKt.TextAttributeCollector$lambda$14(ox6Var4, attributeData, z4, oh4Var7, oh4Var8, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        oh4Var3 = oh4Var;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                oh4Var4 = oh4Var2;
                if (bj4VarO.j(oh4Var4)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((i3 & 9363) == 9362) {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i11 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(1971770096);
                    objF5 = bj4VarO.f();
                    if (objF5 == c0187a) {
                        objF5 = new jba();
                        bj4VarO.C(objF5);
                    }
                    bj4VarO.U(false);
                    oh4Var5 = (oh4) objF5;
                } else {
                    oh4Var5 = oh4Var3;
                }
                if (i6 != 0) {
                    bj4VarO.K(1971771792);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new ms0(i10);
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    oh4Var6 = (oh4) objF4;
                } else {
                    oh4Var6 = oh4Var4;
                }
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                Resources resources12 = context.getResources();
                localeCompat = UtilsKt.getLocaleCompat(context);
                b72 b72Var12 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                if (isPhoneType(attributeData)) {
                    PhoneNumberValidator.loadCountryAreaCodes(context);
                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                } else {
                    countryAreaCodeFromLocale = CountryAreaCode.UNKNOWN;
                }
                boolean zIsFormDisabled12 = attributeData.isFormDisabled();
                boolean submitted12 = attributeData.getAttribute().getSubmitted();
                zA = xj5.a(attributeData.getAttribute().getMultiline(), Boolean.TRUE);
                Object[] objArr113 = new Object[0];
                bj4VarO.K(1971791653);
                zJ = bj4VarO.j(attributeData);
                objF = bj4VarO.f();
                if (zJ) {
                    objF = new mh4() { // from class: kba
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TextAttributeCollectorKt.TextAttributeCollector$lambda$5$lambda$4(attributeData);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new mh4() { // from class: kba
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TextAttributeCollectorKt.TextAttributeCollector$lambda$5$lambda$4(attributeData);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                h37Var = (h37) mm8.d(objArr113, (mh4) objF, bj4VarO, 0);
                Object[] objArr114 = new Object[0];
                bj4VarO.K(1971794796);
                zJ2 = bj4VarO.j(attributeData) | bj4VarO.j(countryAreaCodeFromLocale);
                objF2 = bj4VarO.f();
                if (zJ2) {
                    objF2 = new mh4() { // from class: lba
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TextAttributeCollectorKt.TextAttributeCollector$lambda$9$lambda$8(attributeData, countryAreaCodeFromLocale);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: lba
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TextAttributeCollectorKt.TextAttributeCollector$lambda$9$lambda$8(attributeData, countryAreaCodeFromLocale);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                boolean z1118 = z3;
                bj4VarO.U(false);
                h37Var2 = (h37) mm8.d(objArr114, (mh4) objF2, bj4VarO, 0);
                if (zA) {
                    ox6VarD = oj5.e(ox6Var3);
                } else {
                    ox6VarD = ir9.d(ox6Var3, 40.0f);
                }
                ox6 ox6Var117 = ox6VarD;
                String strTextAttributeCollector$lambda$17 = TextAttributeCollector$lambda$6(h37Var);
                ox6 ox6Var118 = ox6Var3;
                boolean z1119 = !zIsFormDisabled12;
                oh4<? super String, g2b> oh4Var110 = oh4Var5;
                dp5 dp5Var12 = new dp5(getKeyboardType(attributeData), 0, 123);
                boolean z11110 = !zA;
                if (zA) {
                    i8 = 2;
                } else {
                    i8 = 1;
                }
                bj4VarO.K(1971828325);
                if (isPhoneType(attributeData)) {
                    fr1VarB = gr1.b(-1990705988, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.3
                        public final void invoke(jt1 jt1Var2, int i12) {
                            if ((i12 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(TextAttributeCollectorKt.TextAttributeCollector$lambda$10(h37Var2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO);
                } else {
                    fr1VarB = null;
                }
                fr1 fr1Var12 = fr1VarB;
                bj4VarO.U(false);
                bj4VarO.K(1971804880);
                zJ3 = bj4VarO.J(h37Var) | bj4VarO.j(attributeData) | bj4VarO.J(h37Var2);
                objF3 = bj4VarO.f();
                if (zJ3) {
                    objF3 = new mba(attributeData, h37Var, h37Var2);
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new mba(attributeData, h37Var, h37Var2);
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                z4 = z1118;
                bj4Var = bj4VarO;
                ox6Var2 = ox6Var118;
                IntercomOutlinedTextFieldKt.IntercomOutlinedTextField(strTextAttributeCollector$lambda$17, (oh4) objF3, ox6Var117, z1119, submitted12, null, null, gr1.b(-1290485581, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.5
                    public final void invoke(jt1 jt1Var2, int i12) {
                        if ((i12 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        AttributeData attributeData2 = attributeData;
                        CountryAreaCode countryAreaCode = countryAreaCodeFromLocale;
                        countryAreaCode.getClass();
                        mia.b(TextAttributeCollectorKt.getHint(attributeData2, countryAreaCode), null, IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), fr1Var12, gr1.b(930248561, new AnonymousClass6(zIsFormDisabled12, submitted12, z4, b72Var12, h37Var, oh4Var110, resources12, attributeData, oh4Var6), bj4VarO), false, null, dp5Var12, null, z11110, 3, i8, null, b72Var12, null, null, bj4Var, 817889280, 196608, 0, 1715296);
                oh4Var7 = oh4Var110;
                oh4Var8 = oh4Var6;
            } else {
                if (i9 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i11 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                c0187a = jt1.a.a;
                if (i4 != 0) {
                    bj4VarO.K(1971770096);
                    objF5 = bj4VarO.f();
                    if (objF5 == c0187a) {
                        objF5 = new jba();
                        bj4VarO.C(objF5);
                    }
                    bj4VarO.U(false);
                    oh4Var5 = (oh4) objF5;
                } else {
                    oh4Var5 = oh4Var3;
                }
                if (i6 != 0) {
                    bj4VarO.K(1971771792);
                    objF4 = bj4VarO.f();
                    if (objF4 == c0187a) {
                        objF4 = new ms0(i10);
                        bj4VarO.C(objF4);
                    }
                    bj4VarO.U(false);
                    oh4Var6 = (oh4) objF4;
                } else {
                    oh4Var6 = oh4Var4;
                }
                context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                Resources resources13 = context.getResources();
                localeCompat = UtilsKt.getLocaleCompat(context);
                b72 b72Var13 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
                if (isPhoneType(attributeData)) {
                    PhoneNumberValidator.loadCountryAreaCodes(context);
                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                } else {
                    countryAreaCodeFromLocale = CountryAreaCode.UNKNOWN;
                }
                boolean zIsFormDisabled13 = attributeData.isFormDisabled();
                boolean submitted13 = attributeData.getAttribute().getSubmitted();
                zA = xj5.a(attributeData.getAttribute().getMultiline(), Boolean.TRUE);
                Object[] objArr115 = new Object[0];
                bj4VarO.K(1971791653);
                zJ = bj4VarO.j(attributeData);
                objF = bj4VarO.f();
                if (zJ) {
                    objF = new mh4() { // from class: kba
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TextAttributeCollectorKt.TextAttributeCollector$lambda$5$lambda$4(attributeData);
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new mh4() { // from class: kba
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TextAttributeCollectorKt.TextAttributeCollector$lambda$5$lambda$4(attributeData);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                h37Var = (h37) mm8.d(objArr115, (mh4) objF, bj4VarO, 0);
                Object[] objArr116 = new Object[0];
                bj4VarO.K(1971794796);
                zJ2 = bj4VarO.j(attributeData) | bj4VarO.j(countryAreaCodeFromLocale);
                objF2 = bj4VarO.f();
                if (zJ2) {
                    objF2 = new mh4() { // from class: lba
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TextAttributeCollectorKt.TextAttributeCollector$lambda$9$lambda$8(attributeData, countryAreaCodeFromLocale);
                        }
                    };
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new mh4() { // from class: lba
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return TextAttributeCollectorKt.TextAttributeCollector$lambda$9$lambda$8(attributeData, countryAreaCodeFromLocale);
                        }
                    };
                    bj4VarO.C(objF2);
                }
                boolean z11111 = z3;
                bj4VarO.U(false);
                h37Var2 = (h37) mm8.d(objArr116, (mh4) objF2, bj4VarO, 0);
                if (zA) {
                    ox6VarD = oj5.e(ox6Var3);
                } else {
                    ox6VarD = ir9.d(ox6Var3, 40.0f);
                }
                ox6 ox6Var119 = ox6VarD;
                String strTextAttributeCollector$lambda$18 = TextAttributeCollector$lambda$6(h37Var);
                ox6 ox6Var1110 = ox6Var3;
                boolean z11112 = !zIsFormDisabled13;
                oh4<? super String, g2b> oh4Var111 = oh4Var5;
                dp5 dp5Var13 = new dp5(getKeyboardType(attributeData), 0, 123);
                boolean z11113 = !zA;
                if (zA) {
                    i8 = 2;
                } else {
                    i8 = 1;
                }
                bj4VarO.K(1971828325);
                if (isPhoneType(attributeData)) {
                    fr1VarB = gr1.b(-1990705988, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.3
                        public final void invoke(jt1 jt1Var2, int i12) {
                            if ((i12 & 3) == 2 && jt1Var2.r()) {
                                jt1Var2.u();
                            } else {
                                mia.b(TextAttributeCollectorKt.TextAttributeCollector$lambda$10(h37Var2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
                            }
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO);
                } else {
                    fr1VarB = null;
                }
                fr1 fr1Var13 = fr1VarB;
                bj4VarO.U(false);
                bj4VarO.K(1971804880);
                zJ3 = bj4VarO.J(h37Var) | bj4VarO.j(attributeData) | bj4VarO.J(h37Var2);
                objF3 = bj4VarO.f();
                if (zJ3) {
                    objF3 = new mba(attributeData, h37Var, h37Var2);
                    bj4VarO.C(objF3);
                } else {
                    objF3 = new mba(attributeData, h37Var, h37Var2);
                    bj4VarO.C(objF3);
                }
                bj4VarO.U(false);
                z4 = z11111;
                bj4Var = bj4VarO;
                ox6Var2 = ox6Var1110;
                IntercomOutlinedTextFieldKt.IntercomOutlinedTextField(strTextAttributeCollector$lambda$18, (oh4) objF3, ox6Var119, z11112, submitted13, null, null, gr1.b(-1290485581, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.5
                    public final void invoke(jt1 jt1Var2, int i12) {
                        if ((i12 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                            return;
                        }
                        AttributeData attributeData2 = attributeData;
                        CountryAreaCode countryAreaCode = countryAreaCodeFromLocale;
                        countryAreaCode.getClass();
                        mia.b(TextAttributeCollectorKt.getHint(attributeData2, countryAreaCode), null, IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), fr1Var13, gr1.b(930248561, new AnonymousClass6(zIsFormDisabled13, submitted13, z4, b72Var13, h37Var, oh4Var111, resources13, attributeData, oh4Var6), bj4VarO), false, null, dp5Var13, null, z11113, 3, i8, null, b72Var13, null, null, bj4Var, 817889280, 196608, 0, 1715296);
                oh4Var7 = oh4Var111;
                oh4Var8 = oh4Var6;
            }
            ox6Var4 = ox6Var2;
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: fba
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TextAttributeCollectorKt.TextAttributeCollector$lambda$14(ox6Var4, attributeData, z4, oh4Var7, oh4Var8, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 24576;
        oh4Var4 = oh4Var2;
        if ((i3 & 9363) == 9362) {
            if (i9 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            if (i11 != 0) {
                z3 = false;
            } else {
                z3 = z2;
            }
            c0187a = jt1.a.a;
            if (i4 != 0) {
                bj4VarO.K(1971770096);
                objF5 = bj4VarO.f();
                if (objF5 == c0187a) {
                    objF5 = new jba();
                    bj4VarO.C(objF5);
                }
                bj4VarO.U(false);
                oh4Var5 = (oh4) objF5;
            } else {
                oh4Var5 = oh4Var3;
            }
            if (i6 != 0) {
                bj4VarO.K(1971771792);
                objF4 = bj4VarO.f();
                if (objF4 == c0187a) {
                    objF4 = new ms0(i10);
                    bj4VarO.C(objF4);
                }
                bj4VarO.U(false);
                oh4Var6 = (oh4) objF4;
            } else {
                oh4Var6 = oh4Var4;
            }
            context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            Resources resources14 = context.getResources();
            localeCompat = UtilsKt.getLocaleCompat(context);
            b72 b72Var14 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
            if (isPhoneType(attributeData)) {
                PhoneNumberValidator.loadCountryAreaCodes(context);
                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
            } else {
                countryAreaCodeFromLocale = CountryAreaCode.UNKNOWN;
            }
            boolean zIsFormDisabled14 = attributeData.isFormDisabled();
            boolean submitted14 = attributeData.getAttribute().getSubmitted();
            zA = xj5.a(attributeData.getAttribute().getMultiline(), Boolean.TRUE);
            Object[] objArr117 = new Object[0];
            bj4VarO.K(1971791653);
            zJ = bj4VarO.j(attributeData);
            objF = bj4VarO.f();
            if (zJ) {
                objF = new mh4() { // from class: kba
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return TextAttributeCollectorKt.TextAttributeCollector$lambda$5$lambda$4(attributeData);
                    }
                };
                bj4VarO.C(objF);
            } else {
                objF = new mh4() { // from class: kba
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return TextAttributeCollectorKt.TextAttributeCollector$lambda$5$lambda$4(attributeData);
                    }
                };
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            h37Var = (h37) mm8.d(objArr117, (mh4) objF, bj4VarO, 0);
            Object[] objArr118 = new Object[0];
            bj4VarO.K(1971794796);
            zJ2 = bj4VarO.j(attributeData) | bj4VarO.j(countryAreaCodeFromLocale);
            objF2 = bj4VarO.f();
            if (zJ2) {
                objF2 = new mh4() { // from class: lba
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return TextAttributeCollectorKt.TextAttributeCollector$lambda$9$lambda$8(attributeData, countryAreaCodeFromLocale);
                    }
                };
                bj4VarO.C(objF2);
            } else {
                objF2 = new mh4() { // from class: lba
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return TextAttributeCollectorKt.TextAttributeCollector$lambda$9$lambda$8(attributeData, countryAreaCodeFromLocale);
                    }
                };
                bj4VarO.C(objF2);
            }
            boolean z11114 = z3;
            bj4VarO.U(false);
            h37Var2 = (h37) mm8.d(objArr118, (mh4) objF2, bj4VarO, 0);
            if (zA) {
                ox6VarD = oj5.e(ox6Var3);
            } else {
                ox6VarD = ir9.d(ox6Var3, 40.0f);
            }
            ox6 ox6Var1111 = ox6VarD;
            String strTextAttributeCollector$lambda$19 = TextAttributeCollector$lambda$6(h37Var);
            ox6 ox6Var1112 = ox6Var3;
            boolean z11115 = !zIsFormDisabled14;
            oh4<? super String, g2b> oh4Var112 = oh4Var5;
            dp5 dp5Var14 = new dp5(getKeyboardType(attributeData), 0, 123);
            boolean z11116 = !zA;
            if (zA) {
                i8 = 2;
            } else {
                i8 = 1;
            }
            bj4VarO.K(1971828325);
            if (isPhoneType(attributeData)) {
                fr1VarB = gr1.b(-1990705988, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.3
                    public final void invoke(jt1 jt1Var2, int i12) {
                        if ((i12 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            mia.b(TextAttributeCollectorKt.TextAttributeCollector$lambda$10(h37Var2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO);
            } else {
                fr1VarB = null;
            }
            fr1 fr1Var14 = fr1VarB;
            bj4VarO.U(false);
            bj4VarO.K(1971804880);
            zJ3 = bj4VarO.J(h37Var) | bj4VarO.j(attributeData) | bj4VarO.J(h37Var2);
            objF3 = bj4VarO.f();
            if (zJ3) {
                objF3 = new mba(attributeData, h37Var, h37Var2);
                bj4VarO.C(objF3);
            } else {
                objF3 = new mba(attributeData, h37Var, h37Var2);
                bj4VarO.C(objF3);
            }
            bj4VarO.U(false);
            z4 = z11114;
            bj4Var = bj4VarO;
            ox6Var2 = ox6Var1112;
            IntercomOutlinedTextFieldKt.IntercomOutlinedTextField(strTextAttributeCollector$lambda$19, (oh4) objF3, ox6Var1111, z11115, submitted14, null, null, gr1.b(-1290485581, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.5
                public final void invoke(jt1 jt1Var2, int i12) {
                    if ((i12 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    AttributeData attributeData2 = attributeData;
                    CountryAreaCode countryAreaCode = countryAreaCodeFromLocale;
                    countryAreaCode.getClass();
                    mia.b(TextAttributeCollectorKt.getHint(attributeData2, countryAreaCode), null, IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), fr1Var14, gr1.b(930248561, new AnonymousClass6(zIsFormDisabled14, submitted14, z4, b72Var14, h37Var, oh4Var112, resources14, attributeData, oh4Var6), bj4VarO), false, null, dp5Var14, null, z11116, 3, i8, null, b72Var14, null, null, bj4Var, 817889280, 196608, 0, 1715296);
            oh4Var7 = oh4Var112;
            oh4Var8 = oh4Var6;
        } else {
            if (i9 != 0) {
                ox6Var3 = ox6.a.t;
            } else {
                ox6Var3 = ox6Var2;
            }
            if (i11 != 0) {
                z3 = false;
            } else {
                z3 = z2;
            }
            c0187a = jt1.a.a;
            if (i4 != 0) {
                bj4VarO.K(1971770096);
                objF5 = bj4VarO.f();
                if (objF5 == c0187a) {
                    objF5 = new jba();
                    bj4VarO.C(objF5);
                }
                bj4VarO.U(false);
                oh4Var5 = (oh4) objF5;
            } else {
                oh4Var5 = oh4Var3;
            }
            if (i6 != 0) {
                bj4VarO.K(1971771792);
                objF4 = bj4VarO.f();
                if (objF4 == c0187a) {
                    objF4 = new ms0(i10);
                    bj4VarO.C(objF4);
                }
                bj4VarO.U(false);
                oh4Var6 = (oh4) objF4;
            } else {
                oh4Var6 = oh4Var4;
            }
            context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
            Resources resources15 = context.getResources();
            localeCompat = UtilsKt.getLocaleCompat(context);
            b72 b72Var15 = IntercomTheme.INSTANCE.getShapes(bj4VarO, IntercomTheme.$stable).b;
            if (isPhoneType(attributeData)) {
                PhoneNumberValidator.loadCountryAreaCodes(context);
                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
            } else {
                countryAreaCodeFromLocale = CountryAreaCode.UNKNOWN;
            }
            boolean zIsFormDisabled15 = attributeData.isFormDisabled();
            boolean submitted15 = attributeData.getAttribute().getSubmitted();
            zA = xj5.a(attributeData.getAttribute().getMultiline(), Boolean.TRUE);
            Object[] objArr119 = new Object[0];
            bj4VarO.K(1971791653);
            zJ = bj4VarO.j(attributeData);
            objF = bj4VarO.f();
            if (zJ) {
                objF = new mh4() { // from class: kba
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return TextAttributeCollectorKt.TextAttributeCollector$lambda$5$lambda$4(attributeData);
                    }
                };
                bj4VarO.C(objF);
            } else {
                objF = new mh4() { // from class: kba
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return TextAttributeCollectorKt.TextAttributeCollector$lambda$5$lambda$4(attributeData);
                    }
                };
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            h37Var = (h37) mm8.d(objArr119, (mh4) objF, bj4VarO, 0);
            Object[] objArr1110 = new Object[0];
            bj4VarO.K(1971794796);
            zJ2 = bj4VarO.j(attributeData) | bj4VarO.j(countryAreaCodeFromLocale);
            objF2 = bj4VarO.f();
            if (zJ2) {
                objF2 = new mh4() { // from class: lba
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return TextAttributeCollectorKt.TextAttributeCollector$lambda$9$lambda$8(attributeData, countryAreaCodeFromLocale);
                    }
                };
                bj4VarO.C(objF2);
            } else {
                objF2 = new mh4() { // from class: lba
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return TextAttributeCollectorKt.TextAttributeCollector$lambda$9$lambda$8(attributeData, countryAreaCodeFromLocale);
                    }
                };
                bj4VarO.C(objF2);
            }
            boolean z11117 = z3;
            bj4VarO.U(false);
            h37Var2 = (h37) mm8.d(objArr1110, (mh4) objF2, bj4VarO, 0);
            if (zA) {
                ox6VarD = oj5.e(ox6Var3);
            } else {
                ox6VarD = ir9.d(ox6Var3, 40.0f);
            }
            ox6 ox6Var1113 = ox6VarD;
            String strTextAttributeCollector$lambda$110 = TextAttributeCollector$lambda$6(h37Var);
            ox6 ox6Var1114 = ox6Var3;
            boolean z11118 = !zIsFormDisabled15;
            oh4<? super String, g2b> oh4Var113 = oh4Var5;
            dp5 dp5Var15 = new dp5(getKeyboardType(attributeData), 0, 123);
            boolean z11119 = !zA;
            if (zA) {
                i8 = 2;
            } else {
                i8 = 1;
            }
            bj4VarO.K(1971828325);
            if (isPhoneType(attributeData)) {
                fr1VarB = gr1.b(-1990705988, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.3
                    public final void invoke(jt1 jt1Var2, int i12) {
                        if ((i12 & 3) == 2 && jt1Var2.r()) {
                            jt1Var2.u();
                        } else {
                            mia.b(TextAttributeCollectorKt.TextAttributeCollector$lambda$10(h37Var2), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262142);
                        }
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO);
            } else {
                fr1VarB = null;
            }
            fr1 fr1Var15 = fr1VarB;
            bj4VarO.U(false);
            bj4VarO.K(1971804880);
            zJ3 = bj4VarO.J(h37Var) | bj4VarO.j(attributeData) | bj4VarO.J(h37Var2);
            objF3 = bj4VarO.f();
            if (zJ3) {
                objF3 = new mba(attributeData, h37Var, h37Var2);
                bj4VarO.C(objF3);
            } else {
                objF3 = new mba(attributeData, h37Var, h37Var2);
                bj4VarO.C(objF3);
            }
            bj4VarO.U(false);
            z4 = z11117;
            bj4Var = bj4VarO;
            ox6Var2 = ox6Var1114;
            IntercomOutlinedTextFieldKt.IntercomOutlinedTextField(strTextAttributeCollector$lambda$110, (oh4) objF3, ox6Var1113, z11118, submitted15, null, null, gr1.b(-1290485581, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt.TextAttributeCollector.5
                public final void invoke(jt1 jt1Var2, int i12) {
                    if ((i12 & 3) == 2 && jt1Var2.r()) {
                        jt1Var2.u();
                        return;
                    }
                    AttributeData attributeData2 = attributeData;
                    CountryAreaCode countryAreaCode = countryAreaCodeFromLocale;
                    countryAreaCode.getClass();
                    mia.b(TextAttributeCollectorKt.getHint(attributeData2, countryAreaCode), null, IntercomTheme.INSTANCE.getColors(jt1Var2, IntercomTheme.$stable).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jt1Var2, 0, 0, 262138);
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), fr1Var15, gr1.b(930248561, new AnonymousClass6(zIsFormDisabled15, submitted15, z4, b72Var15, h37Var, oh4Var113, resources15, attributeData, oh4Var6), bj4VarO), false, null, dp5Var15, null, z11119, 3, i8, null, b72Var15, null, null, bj4Var, 817889280, 196608, 0, 1715296);
            oh4Var7 = oh4Var113;
            oh4Var8 = oh4Var6;
        }
        ox6Var4 = ox6Var2;
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: fba
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TextAttributeCollectorKt.TextAttributeCollector$lambda$14(ox6Var4, attributeData, z4, oh4Var7, oh4Var8, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TextAttributeCollector$lambda$1$lambda$0(String str) {
        str.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String TextAttributeCollector$lambda$10(h37<String> h37Var) {
        return h37Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TextAttributeCollector$lambda$13$lambda$12(AttributeData attributeData, h37 h37Var, h37 h37Var2, String str) {
        str.getClass();
        h37Var.setValue(str);
        if (isPhoneType(attributeData)) {
            h37Var2.setValue(getCountryAreaCodeFromText(str).getEmoji());
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TextAttributeCollector$lambda$14(ox6 ox6Var, AttributeData attributeData, boolean z, oh4 oh4Var, oh4 oh4Var2, int i, int i2, jt1 jt1Var, int i3) {
        TextAttributeCollector(ox6Var, attributeData, z, oh4Var, oh4Var2, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TextAttributeCollector$lambda$3$lambda$2(AttributeData attributeData) {
        attributeData.getClass();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h37 TextAttributeCollector$lambda$5$lambda$4(AttributeData attributeData) {
        String value = attributeData.getAttribute().getValue();
        if (value == null) {
            value = BuildConfig.FLAVOR;
        }
        return bl7.i(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String TextAttributeCollector$lambda$6(h37<String> h37Var) {
        return h37Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h37 TextAttributeCollector$lambda$9$lambda$8(AttributeData attributeData, CountryAreaCode countryAreaCode) {
        return bl7.i(isPhoneType(attributeData) ? countryAreaCode.getEmoji() : BuildConfig.FLAVOR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TextAttributeTrailingComponent(final boolean z, final boolean z2, final boolean z3, final b72 b72Var, final mh4<g2b> mh4Var, jt1 jt1Var, final int i) {
        int i2;
        long jM751getAction0d7_KjU;
        boolean z4;
        long jM769getOnAction0d7_KjU;
        bj4 bj4VarO = jt1Var.o(1872215775);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.c(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.c(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.c(z3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bj4VarO.J(b72Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bj4VarO.j(mh4Var) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            if (z2) {
                bj4VarO.K(803985965);
                bj4VarO.U(false);
                jM751getAction0d7_KjU = uh1.j;
            } else if (z) {
                bj4VarO.K(803987658);
                jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m764getDisabled0d7_KjU();
                bj4VarO.U(false);
            } else {
                bj4VarO.K(803989128);
                jM751getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m751getAction0d7_KjU();
                bj4VarO.U(false);
            }
            ox6.a aVar = ox6.a.t;
            ox6 ox6VarC = we1.c(ir9.n(gi0.c(uma.a(eo7.m(aVar, 8.0f, 0.0f, 0.0f, 0.0f, 14), b72.b(b72Var, new z43(0.0f), null, null, new z43(0.0f), 6)), jM751getAction0d7_KjU, al8.a).H(ir9.b), 40.0f), (z2 || z3 || z) ? false : true, null, mh4Var, 14);
            fl6 fl6VarD = dv0.d(di.a.e, false);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC2 = it1.c(bj4VarO, ox6VarC);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, fl6VarD);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC2);
            if (z2) {
                bj4VarO.K(1118233872);
                m65.b(is7.a(R.drawable.intercom_attribute_verified_tick, bj4VarO, 0), null, null, IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m753getActive0d7_KjU(), bj4VarO, 56, 4);
                bj4VarO.U(false);
                z4 = true;
            } else if (z3) {
                bj4VarO.K(305740973);
                z4 = true;
                ae8.a(ir9.j(aVar, 20.0f), IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m769getOnAction0d7_KjU(), 3.0f, 0L, 0, 0.0f, bj4VarO, 390, 56);
                bj4VarO = bj4VarO;
                bj4VarO.U(false);
            } else {
                z4 = true;
                bj4VarO.K(1118247800);
                es7 es7VarA = is7.a(R.drawable.intercom_chevron, bj4VarO, 0);
                if (z) {
                    bj4VarO.K(1118253609);
                    jM769getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).getText().m825getDisabled0d7_KjU();
                } else {
                    bj4VarO.K(1118254729);
                    jM769getOnAction0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m769getOnAction0d7_KjU();
                }
                bj4VarO.U(false);
                m65.b(es7VarA, null, null, jM769getOnAction0d7_KjU, bj4VarO, 56, 4);
                bj4VarO.U(false);
            }
            bj4VarO.U(z4);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: gba
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TextAttributeCollectorKt.TextAttributeTrailingComponent$lambda$16(z, z2, z3, b72Var, mh4Var, i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TextAttributeTrailingComponent$lambda$16(boolean z, boolean z2, boolean z3, b72 b72Var, mh4 mh4Var, int i, jt1 jt1Var, int i2) {
        TextAttributeTrailingComponent(z, z2, z3, b72Var, mh4Var, jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    private static final CountryAreaCode getCountryAreaCodeFromText(String str) {
        CountryAreaCode countryAreaCodeFromNumber = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(PhoneNumberValidator.normalizeNumber(str)));
        countryAreaCodeFromNumber.getClass();
        return countryAreaCodeFromNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getHint(AttributeData attributeData, CountryAreaCode countryAreaCode) {
        String str;
        String renderType = attributeData.getAttribute().getRenderType();
        if (xj5.a(renderType, "email")) {
            return "email@domain.com";
        }
        if (!xj5.a(renderType, AttributeType.PHONE)) {
            return BuildConfig.FLAVOR;
        }
        if (xj5.a(countryAreaCode, CountryAreaCode.UNKNOWN)) {
            str = "+1";
        } else {
            str = "+" + countryAreaCode.getDialCode();
        }
        return str.concat(" 123 456 7890");
    }

    private static final int getKeyboardType(AttributeData attributeData) {
        String renderType = attributeData.getAttribute().getRenderType();
        switch (renderType.hashCode()) {
            case -1034364087:
                return !renderType.equals(AttributeType.NUMBER) ? 1 : 3;
            case 96619420:
                return renderType.equals("email") ? 6 : 1;
            case 97526364:
                return !renderType.equals(AttributeType.FLOAT) ? 1 : 9;
            case 106642798:
                return !renderType.equals(AttributeType.PHONE) ? 1 : 4;
            default:
                return 1;
        }
    }

    private static final boolean isPhoneType(AttributeData attributeData) {
        return xj5.a(attributeData.getAttribute().getRenderType(), AttributeType.PHONE);
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.views.compose.TextAttributeCollectorKt$TextAttributeCollector$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass6 implements ci4<jt1, Integer, g2b> {
        final /* synthetic */ AttributeData $attributeData;
        final /* synthetic */ boolean $disabled;
        final /* synthetic */ boolean $loading;
        final /* synthetic */ oh4<AttributeData, g2b> $onSubmitAttribute;
        final /* synthetic */ oh4<String, g2b> $onValidationError;
        final /* synthetic */ Resources $resources;
        final /* synthetic */ b72 $shape;
        final /* synthetic */ boolean $submitted;
        final /* synthetic */ h37<String> $value$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(boolean z, boolean z2, boolean z3, b72 b72Var, h37<String> h37Var, oh4<? super String, g2b> oh4Var, Resources resources, AttributeData attributeData, oh4<? super AttributeData, g2b> oh4Var2) {
            this.$disabled = z;
            this.$submitted = z2;
            this.$loading = z3;
            this.$shape = b72Var;
            this.$value$delegate = h37Var;
            this.$onValidationError = oh4Var;
            this.$resources = resources;
            this.$attributeData = attributeData;
            this.$onSubmitAttribute = oh4Var2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$1$lambda$0(oh4 oh4Var, Resources resources, AttributeData attributeData, oh4 oh4Var2, h37 h37Var) {
            String string = z2a.R(TextAttributeCollectorKt.TextAttributeCollector$lambda$6(h37Var)).toString();
            if (string.length() == 0) {
                String string2 = resources.getString(R.string.intercom_string_is_incorrect);
                string2.getClass();
                oh4Var.invoke(string2);
            } else {
                Attribute attribute = attributeData.getAttribute();
                int iValidateAttribute = AttributeValidatorUtils.validateAttribute(string, attribute.getRenderType());
                if (iValidateAttribute == 0) {
                    oh4Var.invoke(BuildConfig.FLAVOR);
                    oh4Var2.invoke(AttributeData.copy$default(attributeData, Attribute.copy$default(attribute, null, null, null, false, null, null, null, string, 127, null), null, false, 6, null));
                } else {
                    resources.getClass();
                    oh4Var.invoke(AttributeCollectorValidatorKt.getErrorStringFromCode(resources, iValidateAttribute));
                }
            }
            return g2b.a;
        }

        public final void invoke(jt1 jt1Var, int i) {
            if ((i & 3) == 2 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            boolean z = this.$disabled;
            boolean z2 = this.$submitted;
            boolean z3 = this.$loading;
            b72 b72Var = this.$shape;
            jt1Var.K(201032765);
            boolean zJ = jt1Var.J(this.$value$delegate) | jt1Var.J(this.$onValidationError) | jt1Var.j(this.$resources) | jt1Var.j(this.$attributeData) | jt1Var.J(this.$onSubmitAttribute);
            final oh4<String, g2b> oh4Var = this.$onValidationError;
            final Resources resources = this.$resources;
            final AttributeData attributeData = this.$attributeData;
            final oh4<AttributeData, g2b> oh4Var2 = this.$onSubmitAttribute;
            final h37<String> h37Var = this.$value$delegate;
            Object objF = jt1Var.f();
            if (zJ || objF == jt1.a.a) {
                mh4 mh4Var = new mh4() { // from class: io.intercom.android.sdk.views.compose.f
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return TextAttributeCollectorKt.AnonymousClass6.invoke$lambda$1$lambda$0(oh4Var, resources, attributeData, oh4Var2, h37Var);
                    }
                };
                jt1Var.C(mh4Var);
                objF = mh4Var;
            }
            jt1Var.B();
            TextAttributeCollectorKt.TextAttributeTrailingComponent(z, z2, z3, b72Var, (mh4) objF, jt1Var, 0);
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
            invoke(jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
