package io.intercom.android.sdk.m5.conversation.ui.components.row;

import defpackage.a30;
import defpackage.ay8;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.cc5;
import defpackage.ci4;
import defpackage.d73;
import defpackage.di;
import defpackage.e6a;
import defpackage.eo7;
import defpackage.f6a;
import defpackage.g2b;
import defpackage.gi0;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.kw7;
import defpackage.ly8;
import defpackage.ml5;
import defpackage.ns0;
import defpackage.ny8;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.qn8;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.ub5;
import defpackage.uh1;
import defpackage.us3;
import defpackage.vs0;
import defpackage.wb5;
import defpackage.ws0;
import defpackage.xj8;
import defpackage.xv;
import defpackage.yz9;
import defpackage.zx8;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.ui.components.row.TypingIndicatorKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.extension.ModifierExtensionsKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class TypingIndicatorKt {
    private static final int AnimateDuration = 600;

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
    public static final void AnimatedTypingDots(final ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        bj4 bj4VarO = jt1Var.o(-950116908);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            ox6.a aVar = ox6.a.t;
            if (i4 != 0) {
                ox6Var = aVar;
            }
            ny8 ny8VarA = ly8.a(new c30.h(4.0f, true, new a30()), di.a.k, bj4VarO, 54);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6Var);
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
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            List listI = ws0.i(0, 200, Integer.valueOf(CarouselScreenFragment.CAROUSEL_ANIMATION_MS));
            bj4VarO.K(850676747);
            Iterator it = listI.iterator();
            while (it.hasNext()) {
                final yz9<Float> yz9VarAnimateDotAlpha = animateDotAlpha(((Number) it.next()).intValue(), bj4VarO, 0);
                final long jM778isTyping0d7_KjU = IntercomTheme.INSTANCE.getColors(bj4VarO, IntercomTheme.$stable).m778isTyping0d7_KjU();
                ox6 ox6VarJ = ir9.j(aVar, 8.0f);
                bj4VarO.K(387186938);
                boolean zI = bj4VarO.i(jM778isTyping0d7_KjU) | bj4VarO.J(yz9VarAnimateDotAlpha);
                Object objF = bj4VarO.f();
                if (zI || objF == jt1.a.a) {
                    objF = new oh4() { // from class: e0b
                        @Override // defpackage.oh4
                        public final Object invoke(Object obj) {
                            return TypingIndicatorKt.AnimatedTypingDots$lambda$6$lambda$5$lambda$4$lambda$3(jM778isTyping0d7_KjU, yz9VarAnimateDotAlpha, (d73) obj);
                        }
                    };
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                us3.b(ox6VarJ, (oh4) objF, bj4VarO, 6);
            }
            bj4VarO.U(false);
            bj4VarO.U(true);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: f0b
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TypingIndicatorKt.AnimatedTypingDots$lambda$7(ox6Var, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    private static final float AnimatedTypingDots$lambda$6$lambda$5$lambda$2(yz9<Float> yz9Var) {
        return yz9Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b AnimatedTypingDots$lambda$6$lambda$5$lambda$4$lambda$3(long j, yz9 yz9Var, d73 d73Var) {
        d73Var.getClass();
        d73.N(d73Var, uh1.b(AnimatedTypingDots$lambda$6$lambda$5$lambda$2(yz9Var), j), 0.0f, 0L, 0, 126);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b AnimatedTypingDots$lambda$7(ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        AnimatedTypingDots(ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

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
    private static final void TeammateTypingIndicator(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(349650241);
        int i2 = 1;
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            zx8 zx8VarB = ay8.b(20.0f);
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i3 = IntercomTheme.$stable;
            final TypingIndicatorStyle typingIndicatorStyle = new TypingIndicatorStyle(zx8VarB, ws0.b(1.0f, intercomTheme.getColors(bj4VarO, i3).m755getAdminBorder0d7_KjU()), intercomTheme.getColors(bj4VarO, i3).m754getAdminBackground0d7_KjU(), null);
            ox6 ox6VarC = gi0.c(ox6.a.t, typingIndicatorStyle.m294getColor0d7_KjU(), typingIndicatorStyle.getShape());
            boolean z = typingIndicatorStyle.getBorderStroke() != null;
            bj4VarO.K(-676438007);
            boolean zJ = bj4VarO.J(typingIndicatorStyle);
            Object objF = bj4VarO.f();
            if (zJ || objF == jt1.a.a) {
                objF = new oh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.p
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return TypingIndicatorKt.TeammateTypingIndicator$lambda$10$lambda$9(typingIndicatorStyle, (ox6) obj);
                    }
                };
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            AnimatedTypingDots(eo7.j(16.0f, 18.0f, ModifierExtensionsKt.ifTrue(ox6VarC, z, (oh4) objF)), bj4VarO, 0, 0);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new f6a(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ox6 TeammateTypingIndicator$lambda$10$lambda$9(TypingIndicatorStyle typingIndicatorStyle, ox6 ox6Var) {
        ox6Var.getClass();
        vs0 borderStroke = typingIndicatorStyle.getBorderStroke();
        if (borderStroke != null) {
            ox6 ox6VarB = ns0.b(ox6Var, borderStroke.a, borderStroke.b, typingIndicatorStyle.getShape());
            if (ox6VarB != null) {
                return ox6VarB;
            }
        }
        return ox6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TeammateTypingIndicator$lambda$11(int i, jt1 jt1Var, int i2) {
        TeammateTypingIndicator(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:59:0x0109  */
    /* JADX WARN: Code duplicated, block: B:61:0x0115  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: TypingIndicator-6a0pyJM, reason: not valid java name */
    public static final void m290TypingIndicator6a0pyJM(ox6 ox6Var, final CurrentlyTypingState currentlyTypingState, float f, jt1 jt1Var, final int i, final int i2) {
        final ox6 ox6Var2;
        int i3;
        CurrentlyTypingState currentlyTypingState2;
        int i4;
        float f2;
        int i5;
        ox6.a aVar;
        float f3;
        ny8 ny8VarA;
        int iHashCode;
        kw7 kw7VarP;
        ox6 ox6VarC;
        qr5.a aVar2;
        final float f4;
        xj8 xj8VarW;
        currentlyTypingState.getClass();
        bj4 bj4VarO = jt1Var.o(1574154580);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            ox6Var2 = ox6Var;
        } else if ((i & 6) == 0) {
            ox6Var2 = ox6Var;
            i3 = (bj4VarO.J(ox6Var2) ? 4 : 2) | i;
        } else {
            ox6Var2 = ox6Var;
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 48) == 0) {
                currentlyTypingState2 = currentlyTypingState;
                i3 |= bj4VarO.j(currentlyTypingState2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    f2 = f;
                    if (bj4VarO.g(f2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i3 & 147) == 146 || !bj4VarO.r()) {
                    aVar = ox6.a.t;
                    if (i6 != 0) {
                        ox6Var2 = aVar;
                    }
                    if (i4 != 0) {
                        f3 = 36.0f;
                    } else {
                        f3 = f2;
                    }
                    ny8VarA = ly8.a(new c30.h(8.0f, true, new a30()), di.a.k, bj4VarO, 54);
                    iHashCode = Long.hashCode(bj4VarO.T);
                    kw7VarP = bj4VarO.P();
                    ox6VarC = it1.c(bj4VarO, ox6Var2);
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
                    rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    bj4VarO.K(-1949038310);
                    if (currentlyTypingState2.getShowAvatar()) {
                        AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, f3), currentlyTypingState2.getAvatarWrapper(), null, false, 0L, null, bj4VarO, 0, 60);
                    }
                    bj4VarO.U(false);
                    TeammateTypingIndicator(bj4VarO, 0);
                    bj4VarO.U(true);
                    f4 = f3;
                } else {
                    bj4VarO.u();
                    f4 = f2;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: d0b
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TypingIndicatorKt.TypingIndicator_6a0pyJM$lambda$1(ox6Var2, currentlyTypingState, f4, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 384;
            f2 = f;
            if ((i3 & 147) == 146) {
                aVar = ox6.a.t;
                if (i6 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    f3 = 36.0f;
                } else {
                    f3 = f2;
                }
                ny8VarA = ly8.a(new c30.h(8.0f, true, new a30()), di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
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
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(-1949038310);
                if (currentlyTypingState2.getShowAvatar()) {
                    AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, f3), currentlyTypingState2.getAvatarWrapper(), null, false, 0L, null, bj4VarO, 0, 60);
                }
                bj4VarO.U(false);
                TeammateTypingIndicator(bj4VarO, 0);
                bj4VarO.U(true);
                f4 = f3;
            } else {
                aVar = ox6.a.t;
                if (i6 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    f3 = 36.0f;
                } else {
                    f3 = f2;
                }
                ny8VarA = ly8.a(new c30.h(8.0f, true, new a30()), di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
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
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(-1949038310);
                if (currentlyTypingState2.getShowAvatar()) {
                    AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, f3), currentlyTypingState2.getAvatarWrapper(), null, false, 0L, null, bj4VarO, 0, 60);
                }
                bj4VarO.U(false);
                TeammateTypingIndicator(bj4VarO, 0);
                bj4VarO.U(true);
                f4 = f3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: d0b
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TypingIndicatorKt.TypingIndicator_6a0pyJM$lambda$1(ox6Var2, currentlyTypingState, f4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        currentlyTypingState2 = currentlyTypingState;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                f2 = f;
                if (bj4VarO.g(f2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i3 & 147) == 146) {
                aVar = ox6.a.t;
                if (i6 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    f3 = 36.0f;
                } else {
                    f3 = f2;
                }
                ny8VarA = ly8.a(new c30.h(8.0f, true, new a30()), di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
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
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(-1949038310);
                if (currentlyTypingState2.getShowAvatar()) {
                    AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, f3), currentlyTypingState2.getAvatarWrapper(), null, false, 0L, null, bj4VarO, 0, 60);
                }
                bj4VarO.U(false);
                TeammateTypingIndicator(bj4VarO, 0);
                bj4VarO.U(true);
                f4 = f3;
            } else {
                aVar = ox6.a.t;
                if (i6 != 0) {
                    ox6Var2 = aVar;
                }
                if (i4 != 0) {
                    f3 = 36.0f;
                } else {
                    f3 = f2;
                }
                ny8VarA = ly8.a(new c30.h(8.0f, true, new a30()), di.a.k, bj4VarO, 54);
                iHashCode = Long.hashCode(bj4VarO.T);
                kw7VarP = bj4VarO.P();
                ox6VarC = it1.c(bj4VarO, ox6Var2);
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
                rd7.d(bj4VarO, bt1.a.f, ny8VarA);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                bj4VarO.K(-1949038310);
                if (currentlyTypingState2.getShowAvatar()) {
                    AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, f3), currentlyTypingState2.getAvatarWrapper(), null, false, 0L, null, bj4VarO, 0, 60);
                }
                bj4VarO.U(false);
                TeammateTypingIndicator(bj4VarO, 0);
                bj4VarO.U(true);
                f4 = f3;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: d0b
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TypingIndicatorKt.TypingIndicator_6a0pyJM$lambda$1(ox6Var2, currentlyTypingState, f4, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        f2 = f;
        if ((i3 & 147) == 146) {
            aVar = ox6.a.t;
            if (i6 != 0) {
                ox6Var2 = aVar;
            }
            if (i4 != 0) {
                f3 = 36.0f;
            } else {
                f3 = f2;
            }
            ny8VarA = ly8.a(new c30.h(8.0f, true, new a30()), di.a.k, bj4VarO, 54);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6Var2);
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
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bj4VarO.K(-1949038310);
            if (currentlyTypingState2.getShowAvatar()) {
                AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, f3), currentlyTypingState2.getAvatarWrapper(), null, false, 0L, null, bj4VarO, 0, 60);
            }
            bj4VarO.U(false);
            TeammateTypingIndicator(bj4VarO, 0);
            bj4VarO.U(true);
            f4 = f3;
        } else {
            aVar = ox6.a.t;
            if (i6 != 0) {
                ox6Var2 = aVar;
            }
            if (i4 != 0) {
                f3 = 36.0f;
            } else {
                f3 = f2;
            }
            ny8VarA = ly8.a(new c30.h(8.0f, true, new a30()), di.a.k, bj4VarO, 54);
            iHashCode = Long.hashCode(bj4VarO.T);
            kw7VarP = bj4VarO.P();
            ox6VarC = it1.c(bj4VarO, ox6Var2);
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
            rd7.d(bj4VarO, bt1.a.f, ny8VarA);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            bj4VarO.K(-1949038310);
            if (currentlyTypingState2.getShowAvatar()) {
                AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, f3), currentlyTypingState2.getAvatarWrapper(), null, false, 0L, null, bj4VarO, 0, 60);
            }
            bj4VarO.U(false);
            TeammateTypingIndicator(bj4VarO, 0);
            bj4VarO.U(true);
            f4 = f3;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: d0b
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TypingIndicatorKt.TypingIndicator_6a0pyJM$lambda$1(ox6Var2, currentlyTypingState, f4, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    @IntercomPreviews
    public static final void TypingIndicatorPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-955207145);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TypingIndicatorKt.INSTANCE.m271getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: c0b
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TypingIndicatorKt.TypingIndicatorPreview$lambda$12(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TypingIndicatorPreview$lambda$12(int i, jt1 jt1Var, int i2) {
        TypingIndicatorPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void TypingIndicatorWithoutAvatarPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-544244118);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TypingIndicatorKt.INSTANCE.m273getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new e6a(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TypingIndicatorWithoutAvatarPreview$lambda$13(int i, jt1 jt1Var, int i2) {
        TypingIndicatorWithoutAvatarPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TypingIndicator_6a0pyJM$lambda$1(ox6 ox6Var, CurrentlyTypingState currentlyTypingState, float f, int i, int i2, jt1 jt1Var, int i3) {
        m290TypingIndicator6a0pyJM(ox6Var, currentlyTypingState, f, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    private static final yz9<Float> animateDotAlpha(int i, jt1 jt1Var, int i2) {
        jt1Var.K(-1913274997);
        wb5.a aVarA = cc5.a(cc5.c("IsTypingInfiniteTransition", jt1Var, 0), 1.0f, 0.1f, new ub5(xv.c(AnimateDuration, 0, null, 6), qn8.u, i * (-1)), "IsTypingAnimation", jt1Var, 29112, 0);
        jt1Var.B();
        return aVarA;
    }
}
