package io.intercom.android.sdk.m5.home.ui.header;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.a4a;
import defpackage.al8;
import defpackage.b85;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.ci4;
import defpackage.di;
import defpackage.dv0;
import defpackage.f50;
import defpackage.fl6;
import defpackage.fx0;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.gz3;
import defpackage.h86;
import defpackage.i05;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.k85;
import defpackage.kk;
import defpackage.kv0;
import defpackage.kw7;
import defpackage.mh4;
import defpackage.ml5;
import defpackage.mq3;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.tb4;
import defpackage.u;
import defpackage.uh1;
import defpackage.wb4;
import defpackage.ws0;
import defpackage.xj8;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.m5.home.ui.header.HomeHeaderBackdropKt;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ThemeUtils;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class HomeHeaderBackdropKt {
    public static final void ConsistentFadeBehaviorPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-551060646);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderBackdropKt.INSTANCE.m354getLambda7$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new mq3(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ConsistentFadeBehaviorPreview$lambda$10(int i, jt1 jt1Var, int i2) {
        ConsistentFadeBehaviorPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void CrossTypeGradientToSolidPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(60882784);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderBackdropKt.INSTANCE.m353getLambda6$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new wb4(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b CrossTypeGradientToSolidPreview$lambda$9(int i, jt1 jt1Var, int i2) {
        CrossTypeGradientToSolidPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void CrossTypeSolidToGradientPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(1289954070);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderBackdropKt.INSTANCE.m352getLambda5$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: h05
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HomeHeaderBackdropKt.CrossTypeSolidToGradientPreview$lambda$8(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b CrossTypeSolidToGradientPreview$lambda$8(int i, jt1 jt1Var, int i2) {
        CrossTypeSolidToGradientPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void GradientHeaderBackdropPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-1564631091);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderBackdropKt.INSTANCE.m349getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: e05
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HomeHeaderBackdropKt.GradientHeaderBackdropPreview$lambda$5(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b GradientHeaderBackdropPreview$lambda$5(int i, jt1 jt1Var, int i2) {
        GradientHeaderBackdropPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void GradientHeaderBackdropWithFadePreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-205873713);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderBackdropKt.INSTANCE.m351getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: f05
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HomeHeaderBackdropKt.GradientHeaderBackdropWithFadePreview$lambda$7(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b GradientHeaderBackdropWithFadePreview$lambda$7(int i, jt1 jt1Var, int i2) {
        GradientHeaderBackdropWithFadePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0257  */
    /* JADX WARN: Code duplicated, block: B:103:0x0265  */
    /* JADX WARN: Code duplicated, block: B:105:0x0272  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:69:0x011f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0122  */
    /* JADX WARN: Code duplicated, block: B:72:0x0138  */
    /* JADX WARN: Code duplicated, block: B:74:0x013e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0186  */
    /* JADX WARN: Code duplicated, block: B:77:0x0188  */
    /* JADX WARN: Code duplicated, block: B:80:0x018f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0193  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:93:0x0208  */
    /* JADX WARN: Code duplicated, block: B:95:0x0230  */
    /* JADX WARN: Code duplicated, block: B:96:0x0233  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v4 */
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
    /* JADX INFO: renamed from: HomeHeaderBackdrop-AjpBEmI, reason: not valid java name */
    public static final void m359HomeHeaderBackdropAjpBEmI(final float f, final HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle, HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle2, final mh4<g2b> mh4Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle3;
        int i4;
        HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle4;
        int i5;
        int i6;
        final HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle5;
        HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle6;
        int i7;
        fl6 fl6VarD;
        int iHashCode;
        kw7 kw7VarP;
        ox6.a aVar;
        ox6 ox6VarC;
        qr5.a aVar2;
        boolean z;
        al8.a aVar3;
        HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle7;
        ?? r1;
        ox6.a aVar4;
        HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid solid;
        float f2;
        boolean z2;
        Object objF;
        float f3;
        HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient gradient;
        float f4;
        xj8 xj8VarW;
        headerBackdropStyle.getClass();
        mh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(1754935872);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.g(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 48) == 0) {
                headerBackdropStyle3 = headerBackdropStyle;
                i3 |= bj4VarO.J(headerBackdropStyle3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    headerBackdropStyle4 = headerBackdropStyle2;
                    if (bj4VarO.J(headerBackdropStyle4)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    if (bj4VarO.j(mh4Var)) {
                        i6 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i6 = 1024;
                    }
                    i3 |= i6;
                }
                if ((i3 & 1171) == 1170 || !bj4VarO.r()) {
                    if (i4 != 0) {
                        headerBackdropStyle5 = null;
                    } else {
                        headerBackdropStyle5 = headerBackdropStyle4;
                    }
                    if (ThemeUtils.INSTANCE.isDarkModeCompose$intercom_sdk_base_release(bj4VarO, 6) || headerBackdropStyle5 == null) {
                        headerBackdropStyle6 = headerBackdropStyle3;
                    } else {
                        headerBackdropStyle6 = headerBackdropStyle5;
                    }
                    i7 = 0;
                    fl6VarD = dv0.d(di.a.a, false);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    aVar = ox6.a.t;
                    ox6VarC = it1.c(bj4VarO, aVar);
                    bt1.c.getClass();
                    aVar2 = bt1.a.b;
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
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    if (headerBackdropStyle6 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient) {
                        bj4VarO.K(1047420935);
                        gradient = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient) headerBackdropStyle6;
                        ox6 ox6VarB = gi0.b(aVar, new h86(gradient.getColors(), null, 0L, 9187343241974906880L));
                        if (gradient.getFade()) {
                            f4 = 160.0f;
                        } else {
                            f4 = 80.0f;
                        }
                        dv0.a(ir9.c(ir9.d(ox6VarB, f4 + f), 1.0f), bj4VarO, 0);
                        bj4VarO.U(false);
                        headerBackdropStyle7 = headerBackdropStyle6;
                        r1 = 0;
                        aVar4 = aVar;
                    } else {
                        z = headerBackdropStyle6 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image;
                        aVar3 = al8.a;
                        if (z) {
                            bj4VarO.K(1047880603);
                            Context context = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                            k85.a aVar5 = new k85.a(context);
                            HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image image = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image) headerBackdropStyle6;
                            aVar5.c = image.getImageUrl();
                            aVar5.b();
                            k85 k85VarA = aVar5.a();
                            b85 imageLoader = IntercomImageLoaderKt.getImageLoader(context);
                            ox6 ox6VarC2 = ir9.c(ir9.d(gi0.c(aVar, image.m330getFallbackColor0d7_KjU(), aVar3), f + 80.0f), 1.0f);
                            bj4VarO.K(-1074554204);
                            if ((i3 & 7168) == 2048) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objF = bj4VarO.f();
                            if (z2 || objF == jt1.a.a) {
                                objF = new i05(i7, mh4Var);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            headerBackdropStyle7 = headerBackdropStyle6;
                            r1 = 0;
                            aVar4 = aVar;
                            a4a.a(k85VarA, null, imageLoader, ox6VarC2, null, null, null, (oh4) objF, null, bj4VarO, 48, 384, 257520);
                            bj4VarO.U(false);
                        } else {
                            headerBackdropStyle7 = headerBackdropStyle6;
                            r1 = 0;
                            aVar4 = aVar;
                            if (!(headerBackdropStyle7 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid)) {
                                bj4VarO.K(-1074592113);
                                bj4VarO.U(false);
                                u.b();
                                return;
                            }
                            bj4VarO.K(1048705854);
                            solid = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid) headerBackdropStyle7;
                            ox6 ox6VarC3 = gi0.c(aVar4, solid.m334getColor0d7_KjU(), aVar3);
                            if (solid.getFade()) {
                                f2 = 160.0f;
                            } else {
                                f2 = 80.0f;
                            }
                            dv0.a(ir9.c(ir9.d(ox6VarC3, f + f2), 1.0f), bj4VarO, 0);
                            bj4VarO.U(false);
                        }
                    }
                    bj4VarO.K(-1074538393);
                    if (headerBackdropStyle7.getFade()) {
                        ox6 ox6VarB2 = gi0.b(aVar4, fx0.a.a(ws0.i(new uh1(uh1.j), new uh1(kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable)))));
                        if (headerBackdropStyle7 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image) {
                            f3 = 80.0f;
                        } else {
                            f3 = 160.0f;
                        }
                        dv0.a(kv0.a.f(ir9.c(ir9.d(ox6VarB2, f3), 1.0f), di.a.h), bj4VarO, r1);
                    }
                    bj4VarO.U(r1);
                    bj4VarO.U(true);
                } else {
                    bj4VarO.u();
                    headerBackdropStyle5 = headerBackdropStyle4;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: j05
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HomeHeaderBackdropKt.HomeHeaderBackdrop_AjpBEmI$lambda$3(f, headerBackdropStyle, headerBackdropStyle5, mh4Var, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 384;
            headerBackdropStyle4 = headerBackdropStyle2;
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (bj4VarO.j(mh4Var)) {
                    i6 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i3 & 1171) == 1170) {
                if (i4 != 0) {
                    headerBackdropStyle5 = null;
                } else {
                    headerBackdropStyle5 = headerBackdropStyle4;
                }
                if (ThemeUtils.INSTANCE.isDarkModeCompose$intercom_sdk_base_release(bj4VarO, 6)) {
                    headerBackdropStyle6 = headerBackdropStyle3;
                } else {
                    headerBackdropStyle6 = headerBackdropStyle3;
                }
                i7 = 0;
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                aVar = ox6.a.t;
                ox6VarC = it1.c(bj4VarO, aVar);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
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
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                if (headerBackdropStyle6 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient) {
                    bj4VarO.K(1047420935);
                    gradient = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient) headerBackdropStyle6;
                    ox6 ox6VarB3 = gi0.b(aVar, new h86(gradient.getColors(), null, 0L, 9187343241974906880L));
                    if (gradient.getFade()) {
                        f4 = 160.0f;
                    } else {
                        f4 = 80.0f;
                    }
                    dv0.a(ir9.c(ir9.d(ox6VarB3, f4 + f), 1.0f), bj4VarO, 0);
                    bj4VarO.U(false);
                    headerBackdropStyle7 = headerBackdropStyle6;
                    r1 = 0;
                    aVar4 = aVar;
                } else {
                    z = headerBackdropStyle6 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image;
                    aVar3 = al8.a;
                    if (z) {
                        bj4VarO.K(1047880603);
                        Context context2 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                        k85.a aVar6 = new k85.a(context2);
                        HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image image2 = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image) headerBackdropStyle6;
                        aVar6.c = image2.getImageUrl();
                        aVar6.b();
                        k85 k85VarA2 = aVar6.a();
                        b85 imageLoader2 = IntercomImageLoaderKt.getImageLoader(context2);
                        ox6 ox6VarC4 = ir9.c(ir9.d(gi0.c(aVar, image2.m330getFallbackColor0d7_KjU(), aVar3), f + 80.0f), 1.0f);
                        bj4VarO.K(-1074554204);
                        if ((i3 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF = bj4VarO.f();
                        if (z2) {
                            objF = new i05(i7, mh4Var);
                            bj4VarO.C(objF);
                        } else {
                            objF = new i05(i7, mh4Var);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        headerBackdropStyle7 = headerBackdropStyle6;
                        r1 = 0;
                        aVar4 = aVar;
                        a4a.a(k85VarA2, null, imageLoader2, ox6VarC4, null, null, null, (oh4) objF, null, bj4VarO, 48, 384, 257520);
                        bj4VarO.U(false);
                    } else {
                        headerBackdropStyle7 = headerBackdropStyle6;
                        r1 = 0;
                        aVar4 = aVar;
                        if (!(headerBackdropStyle7 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid)) {
                            bj4VarO.K(-1074592113);
                            bj4VarO.U(false);
                            u.b();
                            return;
                        }
                        bj4VarO.K(1048705854);
                        solid = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid) headerBackdropStyle7;
                        ox6 ox6VarC5 = gi0.c(aVar4, solid.m334getColor0d7_KjU(), aVar3);
                        if (solid.getFade()) {
                            f2 = 160.0f;
                        } else {
                            f2 = 80.0f;
                        }
                        dv0.a(ir9.c(ir9.d(ox6VarC5, f + f2), 1.0f), bj4VarO, 0);
                        bj4VarO.U(false);
                    }
                }
                bj4VarO.K(-1074538393);
                if (headerBackdropStyle7.getFade()) {
                    ox6 ox6VarB4 = gi0.b(aVar4, fx0.a.a(ws0.i(new uh1(uh1.j), new uh1(kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable)))));
                    if (headerBackdropStyle7 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image) {
                        f3 = 80.0f;
                    } else {
                        f3 = 160.0f;
                    }
                    dv0.a(kv0.a.f(ir9.c(ir9.d(ox6VarB4, f3), 1.0f), di.a.h), bj4VarO, r1);
                }
                bj4VarO.U(r1);
                bj4VarO.U(true);
            } else {
                if (i4 != 0) {
                    headerBackdropStyle5 = null;
                } else {
                    headerBackdropStyle5 = headerBackdropStyle4;
                }
                if (ThemeUtils.INSTANCE.isDarkModeCompose$intercom_sdk_base_release(bj4VarO, 6)) {
                    headerBackdropStyle6 = headerBackdropStyle3;
                } else {
                    headerBackdropStyle6 = headerBackdropStyle3;
                }
                i7 = 0;
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                aVar = ox6.a.t;
                ox6VarC = it1.c(bj4VarO, aVar);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
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
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                if (headerBackdropStyle6 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient) {
                    bj4VarO.K(1047420935);
                    gradient = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient) headerBackdropStyle6;
                    ox6 ox6VarB5 = gi0.b(aVar, new h86(gradient.getColors(), null, 0L, 9187343241974906880L));
                    if (gradient.getFade()) {
                        f4 = 160.0f;
                    } else {
                        f4 = 80.0f;
                    }
                    dv0.a(ir9.c(ir9.d(ox6VarB5, f4 + f), 1.0f), bj4VarO, 0);
                    bj4VarO.U(false);
                    headerBackdropStyle7 = headerBackdropStyle6;
                    r1 = 0;
                    aVar4 = aVar;
                } else {
                    z = headerBackdropStyle6 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image;
                    aVar3 = al8.a;
                    if (z) {
                        bj4VarO.K(1047880603);
                        Context context3 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                        k85.a aVar7 = new k85.a(context3);
                        HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image image3 = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image) headerBackdropStyle6;
                        aVar7.c = image3.getImageUrl();
                        aVar7.b();
                        k85 k85VarA3 = aVar7.a();
                        b85 imageLoader3 = IntercomImageLoaderKt.getImageLoader(context3);
                        ox6 ox6VarC6 = ir9.c(ir9.d(gi0.c(aVar, image3.m330getFallbackColor0d7_KjU(), aVar3), f + 80.0f), 1.0f);
                        bj4VarO.K(-1074554204);
                        if ((i3 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF = bj4VarO.f();
                        if (z2) {
                            objF = new i05(i7, mh4Var);
                            bj4VarO.C(objF);
                        } else {
                            objF = new i05(i7, mh4Var);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        headerBackdropStyle7 = headerBackdropStyle6;
                        r1 = 0;
                        aVar4 = aVar;
                        a4a.a(k85VarA3, null, imageLoader3, ox6VarC6, null, null, null, (oh4) objF, null, bj4VarO, 48, 384, 257520);
                        bj4VarO.U(false);
                    } else {
                        headerBackdropStyle7 = headerBackdropStyle6;
                        r1 = 0;
                        aVar4 = aVar;
                        if (!(headerBackdropStyle7 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid)) {
                            bj4VarO.K(-1074592113);
                            bj4VarO.U(false);
                            u.b();
                            return;
                        }
                        bj4VarO.K(1048705854);
                        solid = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid) headerBackdropStyle7;
                        ox6 ox6VarC7 = gi0.c(aVar4, solid.m334getColor0d7_KjU(), aVar3);
                        if (solid.getFade()) {
                            f2 = 160.0f;
                        } else {
                            f2 = 80.0f;
                        }
                        dv0.a(ir9.c(ir9.d(ox6VarC7, f + f2), 1.0f), bj4VarO, 0);
                        bj4VarO.U(false);
                    }
                }
                bj4VarO.K(-1074538393);
                if (headerBackdropStyle7.getFade()) {
                    ox6 ox6VarB6 = gi0.b(aVar4, fx0.a.a(ws0.i(new uh1(uh1.j), new uh1(kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable)))));
                    if (headerBackdropStyle7 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image) {
                        f3 = 80.0f;
                    } else {
                        f3 = 160.0f;
                    }
                    dv0.a(kv0.a.f(ir9.c(ir9.d(ox6VarB6, f3), 1.0f), di.a.h), bj4VarO, r1);
                }
                bj4VarO.U(r1);
                bj4VarO.U(true);
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: j05
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HomeHeaderBackdropKt.HomeHeaderBackdrop_AjpBEmI$lambda$3(f, headerBackdropStyle, headerBackdropStyle5, mh4Var, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        headerBackdropStyle3 = headerBackdropStyle;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                headerBackdropStyle4 = headerBackdropStyle2;
                if (bj4VarO.J(headerBackdropStyle4)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (bj4VarO.j(mh4Var)) {
                    i6 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            if ((i3 & 1171) == 1170) {
                if (i4 != 0) {
                    headerBackdropStyle5 = null;
                } else {
                    headerBackdropStyle5 = headerBackdropStyle4;
                }
                if (ThemeUtils.INSTANCE.isDarkModeCompose$intercom_sdk_base_release(bj4VarO, 6)) {
                    headerBackdropStyle6 = headerBackdropStyle3;
                } else {
                    headerBackdropStyle6 = headerBackdropStyle3;
                }
                i7 = 0;
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                aVar = ox6.a.t;
                ox6VarC = it1.c(bj4VarO, aVar);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
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
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                if (headerBackdropStyle6 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient) {
                    bj4VarO.K(1047420935);
                    gradient = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient) headerBackdropStyle6;
                    ox6 ox6VarB7 = gi0.b(aVar, new h86(gradient.getColors(), null, 0L, 9187343241974906880L));
                    if (gradient.getFade()) {
                        f4 = 160.0f;
                    } else {
                        f4 = 80.0f;
                    }
                    dv0.a(ir9.c(ir9.d(ox6VarB7, f4 + f), 1.0f), bj4VarO, 0);
                    bj4VarO.U(false);
                    headerBackdropStyle7 = headerBackdropStyle6;
                    r1 = 0;
                    aVar4 = aVar;
                } else {
                    z = headerBackdropStyle6 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image;
                    aVar3 = al8.a;
                    if (z) {
                        bj4VarO.K(1047880603);
                        Context context4 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                        k85.a aVar8 = new k85.a(context4);
                        HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image image4 = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image) headerBackdropStyle6;
                        aVar8.c = image4.getImageUrl();
                        aVar8.b();
                        k85 k85VarA4 = aVar8.a();
                        b85 imageLoader4 = IntercomImageLoaderKt.getImageLoader(context4);
                        ox6 ox6VarC8 = ir9.c(ir9.d(gi0.c(aVar, image4.m330getFallbackColor0d7_KjU(), aVar3), f + 80.0f), 1.0f);
                        bj4VarO.K(-1074554204);
                        if ((i3 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF = bj4VarO.f();
                        if (z2) {
                            objF = new i05(i7, mh4Var);
                            bj4VarO.C(objF);
                        } else {
                            objF = new i05(i7, mh4Var);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        headerBackdropStyle7 = headerBackdropStyle6;
                        r1 = 0;
                        aVar4 = aVar;
                        a4a.a(k85VarA4, null, imageLoader4, ox6VarC8, null, null, null, (oh4) objF, null, bj4VarO, 48, 384, 257520);
                        bj4VarO.U(false);
                    } else {
                        headerBackdropStyle7 = headerBackdropStyle6;
                        r1 = 0;
                        aVar4 = aVar;
                        if (!(headerBackdropStyle7 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid)) {
                            bj4VarO.K(-1074592113);
                            bj4VarO.U(false);
                            u.b();
                            return;
                        }
                        bj4VarO.K(1048705854);
                        solid = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid) headerBackdropStyle7;
                        ox6 ox6VarC9 = gi0.c(aVar4, solid.m334getColor0d7_KjU(), aVar3);
                        if (solid.getFade()) {
                            f2 = 160.0f;
                        } else {
                            f2 = 80.0f;
                        }
                        dv0.a(ir9.c(ir9.d(ox6VarC9, f + f2), 1.0f), bj4VarO, 0);
                        bj4VarO.U(false);
                    }
                }
                bj4VarO.K(-1074538393);
                if (headerBackdropStyle7.getFade()) {
                    ox6 ox6VarB8 = gi0.b(aVar4, fx0.a.a(ws0.i(new uh1(uh1.j), new uh1(kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable)))));
                    if (headerBackdropStyle7 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image) {
                        f3 = 80.0f;
                    } else {
                        f3 = 160.0f;
                    }
                    dv0.a(kv0.a.f(ir9.c(ir9.d(ox6VarB8, f3), 1.0f), di.a.h), bj4VarO, r1);
                }
                bj4VarO.U(r1);
                bj4VarO.U(true);
            } else {
                if (i4 != 0) {
                    headerBackdropStyle5 = null;
                } else {
                    headerBackdropStyle5 = headerBackdropStyle4;
                }
                if (ThemeUtils.INSTANCE.isDarkModeCompose$intercom_sdk_base_release(bj4VarO, 6)) {
                    headerBackdropStyle6 = headerBackdropStyle3;
                } else {
                    headerBackdropStyle6 = headerBackdropStyle3;
                }
                i7 = 0;
                fl6VarD = dv0.d(di.a.a, false);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                aVar = ox6.a.t;
                ox6VarC = it1.c(bj4VarO, aVar);
                bt1.c.getClass();
                aVar2 = bt1.a.b;
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
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                if (headerBackdropStyle6 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient) {
                    bj4VarO.K(1047420935);
                    gradient = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient) headerBackdropStyle6;
                    ox6 ox6VarB9 = gi0.b(aVar, new h86(gradient.getColors(), null, 0L, 9187343241974906880L));
                    if (gradient.getFade()) {
                        f4 = 160.0f;
                    } else {
                        f4 = 80.0f;
                    }
                    dv0.a(ir9.c(ir9.d(ox6VarB9, f4 + f), 1.0f), bj4VarO, 0);
                    bj4VarO.U(false);
                    headerBackdropStyle7 = headerBackdropStyle6;
                    r1 = 0;
                    aVar4 = aVar;
                } else {
                    z = headerBackdropStyle6 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image;
                    aVar3 = al8.a;
                    if (z) {
                        bj4VarO.K(1047880603);
                        Context context5 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                        k85.a aVar9 = new k85.a(context5);
                        HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image image5 = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image) headerBackdropStyle6;
                        aVar9.c = image5.getImageUrl();
                        aVar9.b();
                        k85 k85VarA5 = aVar9.a();
                        b85 imageLoader5 = IntercomImageLoaderKt.getImageLoader(context5);
                        ox6 ox6VarC10 = ir9.c(ir9.d(gi0.c(aVar, image5.m330getFallbackColor0d7_KjU(), aVar3), f + 80.0f), 1.0f);
                        bj4VarO.K(-1074554204);
                        if ((i3 & 7168) == 2048) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objF = bj4VarO.f();
                        if (z2) {
                            objF = new i05(i7, mh4Var);
                            bj4VarO.C(objF);
                        } else {
                            objF = new i05(i7, mh4Var);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        headerBackdropStyle7 = headerBackdropStyle6;
                        r1 = 0;
                        aVar4 = aVar;
                        a4a.a(k85VarA5, null, imageLoader5, ox6VarC10, null, null, null, (oh4) objF, null, bj4VarO, 48, 384, 257520);
                        bj4VarO.U(false);
                    } else {
                        headerBackdropStyle7 = headerBackdropStyle6;
                        r1 = 0;
                        aVar4 = aVar;
                        if (!(headerBackdropStyle7 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid)) {
                            bj4VarO.K(-1074592113);
                            bj4VarO.U(false);
                            u.b();
                            return;
                        }
                        bj4VarO.K(1048705854);
                        solid = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid) headerBackdropStyle7;
                        ox6 ox6VarC11 = gi0.c(aVar4, solid.m334getColor0d7_KjU(), aVar3);
                        if (solid.getFade()) {
                            f2 = 160.0f;
                        } else {
                            f2 = 80.0f;
                        }
                        dv0.a(ir9.c(ir9.d(ox6VarC11, f + f2), 1.0f), bj4VarO, 0);
                        bj4VarO.U(false);
                    }
                }
                bj4VarO.K(-1074538393);
                if (headerBackdropStyle7.getFade()) {
                    ox6 ox6VarB10 = gi0.b(aVar4, fx0.a.a(ws0.i(new uh1(uh1.j), new uh1(kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable)))));
                    if (headerBackdropStyle7 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image) {
                        f3 = 80.0f;
                    } else {
                        f3 = 160.0f;
                    }
                    dv0.a(kv0.a.f(ir9.c(ir9.d(ox6VarB10, f3), 1.0f), di.a.h), bj4VarO, r1);
                }
                bj4VarO.U(r1);
                bj4VarO.U(true);
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: j05
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HomeHeaderBackdropKt.HomeHeaderBackdrop_AjpBEmI$lambda$3(f, headerBackdropStyle, headerBackdropStyle5, mh4Var, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        headerBackdropStyle4 = headerBackdropStyle2;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (bj4VarO.j(mh4Var)) {
                i6 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i3 & 1171) == 1170) {
            if (i4 != 0) {
                headerBackdropStyle5 = null;
            } else {
                headerBackdropStyle5 = headerBackdropStyle4;
            }
            if (ThemeUtils.INSTANCE.isDarkModeCompose$intercom_sdk_base_release(bj4VarO, 6)) {
                headerBackdropStyle6 = headerBackdropStyle3;
            } else {
                headerBackdropStyle6 = headerBackdropStyle3;
            }
            i7 = 0;
            fl6VarD = dv0.d(di.a.a, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            aVar = ox6.a.t;
            ox6VarC = it1.c(bj4VarO, aVar);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
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
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            if (headerBackdropStyle6 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient) {
                bj4VarO.K(1047420935);
                gradient = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient) headerBackdropStyle6;
                ox6 ox6VarB11 = gi0.b(aVar, new h86(gradient.getColors(), null, 0L, 9187343241974906880L));
                if (gradient.getFade()) {
                    f4 = 160.0f;
                } else {
                    f4 = 80.0f;
                }
                dv0.a(ir9.c(ir9.d(ox6VarB11, f4 + f), 1.0f), bj4VarO, 0);
                bj4VarO.U(false);
                headerBackdropStyle7 = headerBackdropStyle6;
                r1 = 0;
                aVar4 = aVar;
            } else {
                z = headerBackdropStyle6 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image;
                aVar3 = al8.a;
                if (z) {
                    bj4VarO.K(1047880603);
                    Context context6 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    k85.a aVar10 = new k85.a(context6);
                    HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image image6 = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image) headerBackdropStyle6;
                    aVar10.c = image6.getImageUrl();
                    aVar10.b();
                    k85 k85VarA6 = aVar10.a();
                    b85 imageLoader6 = IntercomImageLoaderKt.getImageLoader(context6);
                    ox6 ox6VarC12 = ir9.c(ir9.d(gi0.c(aVar, image6.m330getFallbackColor0d7_KjU(), aVar3), f + 80.0f), 1.0f);
                    bj4VarO.K(-1074554204);
                    if ((i3 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objF = bj4VarO.f();
                    if (z2) {
                        objF = new i05(i7, mh4Var);
                        bj4VarO.C(objF);
                    } else {
                        objF = new i05(i7, mh4Var);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    headerBackdropStyle7 = headerBackdropStyle6;
                    r1 = 0;
                    aVar4 = aVar;
                    a4a.a(k85VarA6, null, imageLoader6, ox6VarC12, null, null, null, (oh4) objF, null, bj4VarO, 48, 384, 257520);
                    bj4VarO.U(false);
                } else {
                    headerBackdropStyle7 = headerBackdropStyle6;
                    r1 = 0;
                    aVar4 = aVar;
                    if (!(headerBackdropStyle7 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid)) {
                        bj4VarO.K(-1074592113);
                        bj4VarO.U(false);
                        u.b();
                        return;
                    }
                    bj4VarO.K(1048705854);
                    solid = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid) headerBackdropStyle7;
                    ox6 ox6VarC13 = gi0.c(aVar4, solid.m334getColor0d7_KjU(), aVar3);
                    if (solid.getFade()) {
                        f2 = 160.0f;
                    } else {
                        f2 = 80.0f;
                    }
                    dv0.a(ir9.c(ir9.d(ox6VarC13, f + f2), 1.0f), bj4VarO, 0);
                    bj4VarO.U(false);
                }
            }
            bj4VarO.K(-1074538393);
            if (headerBackdropStyle7.getFade()) {
                ox6 ox6VarB12 = gi0.b(aVar4, fx0.a.a(ws0.i(new uh1(uh1.j), new uh1(kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable)))));
                if (headerBackdropStyle7 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image) {
                    f3 = 80.0f;
                } else {
                    f3 = 160.0f;
                }
                dv0.a(kv0.a.f(ir9.c(ir9.d(ox6VarB12, f3), 1.0f), di.a.h), bj4VarO, r1);
            }
            bj4VarO.U(r1);
            bj4VarO.U(true);
        } else {
            if (i4 != 0) {
                headerBackdropStyle5 = null;
            } else {
                headerBackdropStyle5 = headerBackdropStyle4;
            }
            if (ThemeUtils.INSTANCE.isDarkModeCompose$intercom_sdk_base_release(bj4VarO, 6)) {
                headerBackdropStyle6 = headerBackdropStyle3;
            } else {
                headerBackdropStyle6 = headerBackdropStyle3;
            }
            i7 = 0;
            fl6VarD = dv0.d(di.a.a, false);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            aVar = ox6.a.t;
            ox6VarC = it1.c(bj4VarO, aVar);
            bt1.c.getClass();
            aVar2 = bt1.a.b;
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
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            if (headerBackdropStyle6 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient) {
                bj4VarO.K(1047420935);
                gradient = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient) headerBackdropStyle6;
                ox6 ox6VarB13 = gi0.b(aVar, new h86(gradient.getColors(), null, 0L, 9187343241974906880L));
                if (gradient.getFade()) {
                    f4 = 160.0f;
                } else {
                    f4 = 80.0f;
                }
                dv0.a(ir9.c(ir9.d(ox6VarB13, f4 + f), 1.0f), bj4VarO, 0);
                bj4VarO.U(false);
                headerBackdropStyle7 = headerBackdropStyle6;
                r1 = 0;
                aVar4 = aVar;
            } else {
                z = headerBackdropStyle6 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image;
                aVar3 = al8.a;
                if (z) {
                    bj4VarO.K(1047880603);
                    Context context7 = (Context) bj4VarO.F(AndroidCompositionLocals_androidKt.b);
                    k85.a aVar11 = new k85.a(context7);
                    HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image image7 = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image) headerBackdropStyle6;
                    aVar11.c = image7.getImageUrl();
                    aVar11.b();
                    k85 k85VarA7 = aVar11.a();
                    b85 imageLoader7 = IntercomImageLoaderKt.getImageLoader(context7);
                    ox6 ox6VarC14 = ir9.c(ir9.d(gi0.c(aVar, image7.m330getFallbackColor0d7_KjU(), aVar3), f + 80.0f), 1.0f);
                    bj4VarO.K(-1074554204);
                    if ((i3 & 7168) == 2048) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objF = bj4VarO.f();
                    if (z2) {
                        objF = new i05(i7, mh4Var);
                        bj4VarO.C(objF);
                    } else {
                        objF = new i05(i7, mh4Var);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    headerBackdropStyle7 = headerBackdropStyle6;
                    r1 = 0;
                    aVar4 = aVar;
                    a4a.a(k85VarA7, null, imageLoader7, ox6VarC14, null, null, null, (oh4) objF, null, bj4VarO, 48, 384, 257520);
                    bj4VarO.U(false);
                } else {
                    headerBackdropStyle7 = headerBackdropStyle6;
                    r1 = 0;
                    aVar4 = aVar;
                    if (!(headerBackdropStyle7 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid)) {
                        bj4VarO.K(-1074592113);
                        bj4VarO.U(false);
                        u.b();
                        return;
                    }
                    bj4VarO.K(1048705854);
                    solid = (HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid) headerBackdropStyle7;
                    ox6 ox6VarC15 = gi0.c(aVar4, solid.m334getColor0d7_KjU(), aVar3);
                    if (solid.getFade()) {
                        f2 = 160.0f;
                    } else {
                        f2 = 80.0f;
                    }
                    dv0.a(ir9.c(ir9.d(ox6VarC15, f + f2), 1.0f), bj4VarO, 0);
                    bj4VarO.U(false);
                }
            }
            bj4VarO.K(-1074538393);
            if (headerBackdropStyle7.getFade()) {
                ox6 ox6VarB14 = gi0.b(aVar4, fx0.a.a(ws0.i(new uh1(uh1.j), new uh1(kk.a(IntercomTheme.INSTANCE, bj4VarO, IntercomTheme.$stable)))));
                if (headerBackdropStyle7 instanceof HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image) {
                    f3 = 80.0f;
                } else {
                    f3 = 160.0f;
                }
                dv0.a(kv0.a.f(ir9.c(ir9.d(ox6VarB14, f3), 1.0f), di.a.h), bj4VarO, r1);
            }
            bj4VarO.U(r1);
            bj4VarO.U(true);
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: j05
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HomeHeaderBackdropKt.HomeHeaderBackdrop_AjpBEmI$lambda$3(f, headerBackdropStyle, headerBackdropStyle5, mh4Var, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HomeHeaderBackdrop_AjpBEmI$lambda$2$lambda$1$lambda$0(mh4 mh4Var, f50.a.d dVar) {
        dVar.getClass();
        mh4Var.invoke();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b HomeHeaderBackdrop_AjpBEmI$lambda$3(float f, HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle, HomeUiState.Content.ContentHeader.HeaderBackdropStyle headerBackdropStyle2, mh4 mh4Var, int i, int i2, jt1 jt1Var, int i3) {
        m359HomeHeaderBackdropAjpBEmI(f, headerBackdropStyle, headerBackdropStyle2, mh4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    public static final void SolidHeaderBackdropPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(784552236);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderBackdropKt.INSTANCE.m348getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new tb4(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SolidHeaderBackdropPreview$lambda$4(int i, jt1 jt1Var, int i2) {
        SolidHeaderBackdropPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void SolidHeaderBackdropWithFadePreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(14975022);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderBackdropKt.INSTANCE.m350getLambda3$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: g05
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HomeHeaderBackdropKt.SolidHeaderBackdropWithFadePreview$lambda$6(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b SolidHeaderBackdropWithFadePreview$lambda$6(int i, jt1 jt1Var, int i2) {
        SolidHeaderBackdropWithFadePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }
}
