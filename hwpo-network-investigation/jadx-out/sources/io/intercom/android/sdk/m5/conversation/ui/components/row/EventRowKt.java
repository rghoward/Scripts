package io.intercom.android.sdk.m5.conversation.ui.components.row;

import com.intercom.twig.BuildConfig;
import defpackage.b30;
import defpackage.bj4;
import defpackage.c30;
import defpackage.c84;
import defpackage.ci4;
import defpackage.di;
import defpackage.ec9;
import defpackage.ei4;
import defpackage.eo7;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.hc9;
import defpackage.ir9;
import defpackage.iw;
import defpackage.jt1;
import defpackage.mia;
import defpackage.o32;
import defpackage.ob4;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.pb9;
import defpackage.s74;
import defpackage.th1;
import defpackage.u;
import defpackage.u7d;
import defpackage.uh1;
import defpackage.vaa;
import defpackage.wja;
import defpackage.ww9;
import defpackage.xj8;
import defpackage.z20;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.EventLabelSegment;
import io.intercom.android.sdk.m5.conversation.ui.components.row.EventRowKt;
import io.intercom.android.sdk.models.Weight;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class EventRowKt {
    /* JADX WARN: Code duplicated, block: B:41:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    public static final void EventRow(ox6 ox6Var, final List<EventLabelSegment> list, final AvatarWrapper avatarWrapper, jt1 jt1Var, final int i, final int i2) {
        int i3;
        AvatarWrapper avatarWrapper2;
        Object objF;
        int i4;
        final ox6 ox6Var2;
        xj8 xj8VarW;
        list.getClass();
        avatarWrapper.getClass();
        bj4 bj4VarO = jt1Var.o(150762908);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.J(ox6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bj4VarO.j(list) ? 32 : 16;
        }
        if ((i2 & 4) == 0) {
            if ((i & 384) == 0) {
                avatarWrapper2 = avatarWrapper;
                i3 |= bj4VarO.j(avatarWrapper2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !bj4VarO.r()) {
                if (i5 != 0) {
                    ox6Var = ox6.a.t;
                }
                wja type04Point5 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5();
                bj4VarO.K(1628137782);
                objF = bj4VarO.f();
                i4 = 1;
                if (objF == jt1.a.a) {
                    objF = new o32(i4);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                s74.a(eo7.k(ir9.c(ox6Var, 1.0f), 16.0f, 0.0f, 2), new c30.h(6.0f, true, new b30(di.a.n)), new c30.h(6.0f, false, new z20(di.a.k)), null, 0, 0, gr1.b(639828375, new AnonymousClass1(20.0f, avatarWrapper2, "Event: ".concat(th1.F(list, BuildConfig.FLAVOR, null, null, (oh4) objF, 30)), type04Point5, list), bj4VarO), bj4VarO, 1573296);
            } else {
                bj4VarO.u();
            }
            ox6Var2 = ox6Var;
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: zm3
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return EventRowKt.EventRow$lambda$2(ox6Var2, list, avatarWrapper, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        avatarWrapper2 = avatarWrapper;
        if ((i3 & 147) == 146) {
            if (i5 != 0) {
                ox6Var = ox6.a.t;
            }
            wja type04Point6 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5();
            bj4VarO.K(1628137782);
            objF = bj4VarO.f();
            i4 = 1;
            if (objF == jt1.a.a) {
                objF = new o32(i4);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            s74.a(eo7.k(ir9.c(ox6Var, 1.0f), 16.0f, 0.0f, 2), new c30.h(6.0f, true, new b30(di.a.n)), new c30.h(6.0f, false, new z20(di.a.k)), null, 0, 0, gr1.b(639828375, new AnonymousClass1(20.0f, avatarWrapper2, "Event: ".concat(th1.F(list, BuildConfig.FLAVOR, null, null, (oh4) objF, 30)), type04Point6, list), bj4VarO), bj4VarO, 1573296);
        } else {
            if (i5 != 0) {
                ox6Var = ox6.a.t;
            }
            wja type04Point7 = IntercomTheme.INSTANCE.getTypography(bj4VarO, IntercomTheme.$stable).getType04Point5();
            bj4VarO.K(1628137782);
            objF = bj4VarO.f();
            i4 = 1;
            if (objF == jt1.a.a) {
                objF = new o32(i4);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            s74.a(eo7.k(ir9.c(ox6Var, 1.0f), 16.0f, 0.0f, 2), new c30.h(6.0f, true, new b30(di.a.n)), new c30.h(6.0f, false, new z20(di.a.k)), null, 0, 0, gr1.b(639828375, new AnonymousClass1(20.0f, avatarWrapper2, "Event: ".concat(th1.F(list, BuildConfig.FLAVOR, null, null, (oh4) objF, 30)), type04Point7, list), bj4VarO), bj4VarO, 1573296);
        }
        ox6Var2 = ox6Var;
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: zm3
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return EventRowKt.EventRow$lambda$2(ox6Var2, list, avatarWrapper, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence EventRow$lambda$1$lambda$0(EventLabelSegment eventLabelSegment) {
        eventLabelSegment.getClass();
        return eventLabelSegment.getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b EventRow$lambda$2(ox6 ox6Var, List list, AvatarWrapper avatarWrapper, int i, int i2, jt1 jt1Var, int i3) {
        EventRow(ox6Var, list, avatarWrapper, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    private static final void ParticipantAddedRowPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(524974868);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$EventRowKt.INSTANCE.m222getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: ym3
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return EventRowKt.ParticipantAddedRowPreview$lambda$3(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ParticipantAddedRowPreview$lambda$3(int i, jt1 jt1Var, int i2) {
        ParticipantAddedRowPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.EventRowKt$EventRow$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class AnonymousClass1 implements ei4<c84, jt1, Integer, g2b> {
        final /* synthetic */ AvatarWrapper $avatar;
        final /* synthetic */ float $avatarSize;
        final /* synthetic */ String $contentDescription;
        final /* synthetic */ List<EventLabelSegment> $labelSegments;
        final /* synthetic */ wja $textStyle;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.EventRowKt$EventRow$1$WhenMappings */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Weight.values().length];
                try {
                    iArr[Weight.REGULAR.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Weight.LIGHT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Weight.MEDIUM.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Weight.SEMI_BOLD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Weight.BOLD.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public AnonymousClass1(float f, AvatarWrapper avatarWrapper, String str, wja wjaVar, List<EventLabelSegment> list) {
            this.$avatarSize = f;
            this.$avatar = avatarWrapper;
            this.$contentDescription = str;
            this.$textStyle = wjaVar;
            this.$labelSegments = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invoke$lambda$4$lambda$3(String str, hc9 hc9Var) {
            hc9Var.getClass();
            ec9.b(str, hc9Var);
            return g2b.a;
        }

        public final void invoke(c84 c84Var, jt1 jt1Var, int i) {
            ob4 ob4Var;
            long jM827getMuted0d7_KjU;
            c84Var.getClass();
            if ((i & 17) == 16 && jt1Var.r()) {
                jt1Var.u();
                return;
            }
            float f = this.$avatarSize;
            ox6.a aVar = ox6.a.t;
            AvatarIconKt.m91AvatarIconRd90Nhg(ir9.j(aVar, f), this.$avatar, null, false, 0L, new uh1(u7d.d(4294046193L)), jt1Var, 196614, 28);
            jt1Var.K(-1441488030);
            List<EventLabelSegment> list = this.$labelSegments;
            iw.b bVar = new iw.b();
            jt1Var.K(-1441486521);
            for (EventLabelSegment eventLabelSegment : list) {
                Weight weight = eventLabelSegment.getWeight();
                int i2 = weight == null ? -1 : WhenMappings.$EnumSwitchMapping$0[weight.ordinal()];
                if (i2 == -1 || i2 == 1) {
                    ob4Var = ob4.y;
                } else if (i2 == 2) {
                    ob4Var = ob4.x;
                } else if (i2 == 3) {
                    ob4Var = ob4.z;
                } else if (i2 == 4) {
                    ob4Var = ob4.A;
                } else {
                    if (i2 != 5) {
                        u.b();
                        return;
                    }
                    ob4Var = ob4.B;
                }
                ob4 ob4Var2 = ob4Var;
                if (eventLabelSegment.getWeight() == null || eventLabelSegment.getWeight() == Weight.REGULAR) {
                    jt1Var.K(1299870835);
                    jM827getMuted0d7_KjU = IntercomTheme.INSTANCE.getColors(jt1Var, IntercomTheme.$stable).getText().m827getMuted0d7_KjU();
                    jt1Var.B();
                } else {
                    jt1Var.K(1299792529);
                    jM827getMuted0d7_KjU = IntercomTheme.INSTANCE.getColors(jt1Var, IntercomTheme.$stable).getText().m824getDefault0d7_KjU();
                    jt1Var.B();
                }
                int iH = bVar.h(new ww9(jM827getMuted0d7_KjU, 0L, ob4Var2, null, null, null, null, 0L, null, null, null, 0L, null, null, 65530));
                try {
                    bVar.c(eventLabelSegment.getText());
                    g2b g2bVar = g2b.a;
                    bVar.e(iH);
                } catch (Throwable th) {
                    bVar.e(iH);
                    throw th;
                }
            }
            jt1Var.B();
            iw iwVarI = bVar.i();
            jt1Var.B();
            jt1Var.K(-1441447562);
            boolean zJ = jt1Var.J(this.$contentDescription);
            final String str = this.$contentDescription;
            Object objF = jt1Var.f();
            if (zJ || objF == jt1.a.a) {
                objF = new oh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.l
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj) {
                        return EventRowKt.AnonymousClass1.invoke$lambda$4$lambda$3(str, (hc9) obj);
                    }
                };
                jt1Var.C(objF);
            }
            jt1Var.B();
            mia.c(iwVarI, pb9.b(aVar, false, (oh4) objF), 0L, 0L, null, 0L, new vaa(3), 0L, 0, false, 0, 0, null, null, this.$textStyle, jt1Var, 0, 0, 261116);
        }

        @Override // defpackage.ei4
        public /* bridge */ /* synthetic */ g2b invoke(c84 c84Var, jt1 jt1Var, Integer num) {
            invoke(c84Var, jt1Var, num.intValue());
            return g2b.a;
        }
    }
}
