package io.intercom.android.sdk.m5.components;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.intercom.twig.BuildConfig;
import defpackage.a30;
import defpackage.aj1;
import defpackage.b22;
import defpackage.b47;
import defpackage.b50;
import defpackage.beb;
import defpackage.bj4;
import defpackage.bt1;
import defpackage.c30;
import defpackage.ci4;
import defpackage.cj2;
import defpackage.d73;
import defpackage.di;
import defpackage.dv0;
import defpackage.eo7;
import defpackage.fl6;
import defpackage.g2b;
import defpackage.g3;
import defpackage.go7;
import defpackage.gr1;
import defpackage.gz3;
import defpackage.ir9;
import defpackage.it1;
import defpackage.jt1;
import defpackage.ko7;
import defpackage.kw7;
import defpackage.lg1;
import defpackage.ly8;
import defpackage.mh4;
import defpackage.mia;
import defpackage.ml5;
import defpackage.nr1;
import defpackage.ny8;
import defpackage.ob4;
import defpackage.oh4;
import defpackage.ox6;
import defpackage.ph1;
import defpackage.py8;
import defpackage.qr5;
import defpackage.rd7;
import defpackage.sp0;
import defpackage.th1;
import defpackage.u7d;
import defpackage.us3;
import defpackage.v5a;
import defpackage.we1;
import defpackage.wja;
import defpackage.ws0;
import defpackage.xj8;
import defpackage.yi1;
import defpackage.z12;
import defpackage.zr0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.ConversationItemKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.ui.components.row.TypingIndicatorKt;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationItemKt {
    @IntercomPreviews
    public static final void ConversationCardWithLongTitlePreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(-672592241);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationItemKt.INSTANCE.m37getLambda4$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new zr0(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ConversationCardWithLongTitlePreview$lambda$11(int i, jt1 jt1Var, int i2) {
        ConversationCardWithLongTitlePreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0132  */
    /* JADX WARN: Code duplicated, block: B:106:0x016e  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x0105  */
    /* JADX WARN: Code duplicated, block: B:93:0x0112  */
    /* JADX WARN: Code duplicated, block: B:97:0x0126  */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x00cc, please report this as an issue */
    public static final void ConversationItem(final Conversation conversation, ox6 ox6Var, CurrentlyTypingState currentlyTypingState, go7 go7Var, boolean z, final mh4<g2b> mh4Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        ox6 ox6Var2;
        int i4;
        CurrentlyTypingState currentlyTypingState2;
        int i5;
        int i6;
        go7 ko7Var;
        int i7;
        boolean z2;
        int i8;
        ox6 ox6Var3;
        int i9;
        final CurrentlyTypingState currentlyTypingState3;
        final boolean z3;
        final go7 go7Var2;
        int i10;
        boolean z4;
        Object objF;
        bj4 bj4Var;
        final CurrentlyTypingState currentlyTypingState4;
        final ox6 ox6Var4;
        xj8 xj8VarW;
        conversation.getClass();
        mh4Var.getClass();
        bj4 bj4VarO = jt1Var.o(-2074390483);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bj4VarO.j(conversation) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 48) == 0) {
                ox6Var2 = ox6Var;
                i3 |= bj4VarO.J(ox6Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    currentlyTypingState2 = currentlyTypingState;
                    if (bj4VarO.j(currentlyTypingState2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        ko7Var = go7Var;
                        if (bj4VarO.J(ko7Var)) {
                            i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    if ((i & 24576) == 0) {
                        if ((i2 & 16) == 0) {
                            z2 = z;
                            int i12 = bj4VarO.c(z2) ? 16384 : 8192;
                            i3 |= i12;
                        } else {
                            z2 = z;
                        }
                        i3 |= i12;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 32) != 0) {
                        i3 |= 196608;
                    } else if ((i & 196608) == 0) {
                        if (bj4VarO.j(mh4Var)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i3 |= i8;
                    }
                    if ((74899 & i3) == 74898 || !bj4VarO.r()) {
                        bj4VarO.v0();
                        if ((i & 1) != 0 || bj4VarO.c0()) {
                            if (i11 != 0) {
                                ox6Var3 = ox6.a.t;
                            } else {
                                ox6Var3 = ox6Var2;
                            }
                            if (i4 != 0) {
                                currentlyTypingState2 = null;
                            }
                            if (i6 != 0) {
                                ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                            if ((i2 & 16) != 0) {
                                CurrentlyTypingState currentlyTypingState5 = currentlyTypingState2;
                                i9 = i3 & (-57345);
                                currentlyTypingState3 = currentlyTypingState5;
                                z3 = !conversation.isRead();
                                go7Var2 = ko7Var;
                            } else {
                                CurrentlyTypingState currentlyTypingState6 = currentlyTypingState2;
                                i9 = i3;
                                currentlyTypingState3 = currentlyTypingState6;
                            }
                            bj4VarO.V();
                            bj4VarO.K(-437489840);
                            i10 = 0;
                            z4 = (i9 & 458752) == 131072;
                            objF = bj4VarO.f();
                            if (z4 || objF == jt1.a.a) {
                                objF = new b22(i10, mh4Var);
                                bj4VarO.C(objF);
                            }
                            bj4VarO.U(false);
                            bj4Var = bj4VarO;
                            v5a.a(we1.c(ox6Var3, false, null, (mh4) objF, 15), null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(774321672, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.ConversationItemKt.ConversationItem.2
                                public final void invoke(jt1 jt1Var2, int i13) {
                                    List listH;
                                    bt1.a.b bVar;
                                    bt1.a.d dVar;
                                    bt1.a.C0034a c0034a;
                                    String strA;
                                    jt1 jt1Var3 = jt1Var2;
                                    if ((i13 & 3) == 2 && jt1Var3.r()) {
                                        jt1Var3.u();
                                        return;
                                    }
                                    go7 go7Var3 = go7Var2;
                                    ox6.a aVar = ox6.a.t;
                                    ox6 ox6VarH = eo7.h(aVar, go7Var3);
                                    CurrentlyTypingState currentlyTypingState7 = currentlyTypingState3;
                                    Conversation conversation2 = conversation;
                                    boolean z5 = z3;
                                    c30.j jVar = c30.a;
                                    sp0.b bVar2 = di.a.k;
                                    ny8 ny8VarA = ly8.a(jVar, bVar2, jt1Var3, 48);
                                    int iHashCode = Long.hashCode(jt1Var3.v());
                                    kw7 kw7VarY = jt1Var3.y();
                                    ox6 ox6VarC = it1.c(jt1Var3, ox6VarH);
                                    bt1.c.getClass();
                                    qr5.a aVar2 = bt1.a.b;
                                    if (jt1Var3.s() == null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    jt1Var3.q();
                                    if (jt1Var3.l()) {
                                        jt1Var3.k(aVar2);
                                    } else {
                                        jt1Var3.z();
                                    }
                                    bt1.a.c cVar = bt1.a.f;
                                    rd7.d(jt1Var3, cVar, ny8VarA);
                                    bt1.a.e eVar = bt1.a.e;
                                    rd7.d(jt1Var3, eVar, kw7VarY);
                                    Integer numValueOf = Integer.valueOf(iHashCode);
                                    bt1.a.b bVar3 = bt1.a.g;
                                    rd7.d(jt1Var3, bVar3, numValueOf);
                                    bt1.a.C0034a c0034a2 = bt1.a.h;
                                    rd7.c(jt1Var3, c0034a2);
                                    bt1.a.d dVar2 = bt1.a.d;
                                    rd7.d(jt1Var3, dVar2, ox6VarC);
                                    jt1Var3.K(1766961464);
                                    if (currentlyTypingState7 == null || currentlyTypingState7.getShowAvatar()) {
                                        if (currentlyTypingState7 != null) {
                                            listH = ws0.h(currentlyTypingState7.getAvatarWrapper());
                                        } else if (LastParticipatingAdmin.isNull(conversation2.lastParticipatingAdmin())) {
                                            listH = ConversationItemKt.getActiveAdminsAvatars();
                                        } else {
                                            Avatar avatar = conversation2.lastParticipatingAdmin().getAvatar();
                                            avatar.getClass();
                                            listH = ws0.h(new AvatarWrapper(avatar, conversation2.lastParticipatingAdmin().isBot()));
                                        }
                                        bVar = bVar3;
                                        dVar = dVar2;
                                        c0034a = c0034a2;
                                        AvatarTriangleGroupKt.m20AvatarTriangleGroupjt2gSs(listH, new beb(), null, 32.0f, jt1Var3, 3072, 4);
                                        b47.b(jt1Var3, ir9.n(aVar, 12.0f));
                                    } else {
                                        c0034a = c0034a2;
                                        bVar = bVar3;
                                        dVar = dVar2;
                                    }
                                    jt1Var3.B();
                                    py8 py8Var = py8.a;
                                    if (currentlyTypingState7 != null) {
                                        jt1Var3.K(-1057866277);
                                        TypingIndicatorKt.AnimatedTypingDots(ir9.b(py8Var.a(aVar, 2.0f, true), 0.0f, 38.0f, 1), jt1Var3, 0, 0);
                                        jt1Var3.B();
                                    } else {
                                        jt1Var3.K(-1057575373);
                                        Context context = (Context) jt1Var3.F(AndroidCompositionLocals_androidKt.b);
                                        ox6 ox6VarA = py8Var.a(aVar, 2.0f, true);
                                        aj1 aj1VarA = yi1.a(new c30.h(2.0f, true, new a30()), di.a.m, jt1Var3, 6);
                                        int iHashCode2 = Long.hashCode(jt1Var3.v());
                                        kw7 kw7VarY2 = jt1Var3.y();
                                        ox6 ox6VarC2 = it1.c(jt1Var3, ox6VarA);
                                        if (jt1Var3.s() == null) {
                                            ml5.c();
                                            throw null;
                                        }
                                        jt1Var3.q();
                                        if (jt1Var3.l()) {
                                            jt1Var3.k(aVar2);
                                        } else {
                                            jt1Var3.z();
                                        }
                                        rd7.d(jt1Var3, cVar, aj1VarA);
                                        rd7.d(jt1Var3, eVar, kw7VarY2);
                                        g3.c(iHashCode2, jt1Var3, bVar, jt1Var3, c0034a);
                                        rd7.d(jt1Var3, dVar, ox6VarC2);
                                        ox6 ox6VarC3 = ir9.c(aVar, 1.0f);
                                        ny8 ny8VarA2 = ly8.a(jVar, bVar2, jt1Var3, 48);
                                        int iHashCode3 = Long.hashCode(jt1Var3.v());
                                        kw7 kw7VarY3 = jt1Var3.y();
                                        ox6 ox6VarC4 = it1.c(jt1Var3, ox6VarC3);
                                        if (jt1Var3.s() == null) {
                                            ml5.c();
                                            throw null;
                                        }
                                        jt1Var3.q();
                                        if (jt1Var3.l()) {
                                            jt1Var3.k(aVar2);
                                        } else {
                                            jt1Var3.z();
                                        }
                                        rd7.d(jt1Var3, cVar, ny8VarA2);
                                        rd7.d(jt1Var3, eVar, kw7VarY3);
                                        g3.c(iHashCode3, jt1Var3, bVar, jt1Var3, c0034a);
                                        rd7.d(jt1Var3, dVar, ox6VarC4);
                                        String title = conversation2.getTitle();
                                        ox6 ox6VarA2 = py8Var.a(aVar, 1.0f, true);
                                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                        int i14 = IntercomTheme.$stable;
                                        mia.b(title, ox6VarA2, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var3, i14).getType04(), 0L, 0L, conversation2.isRead() ? ob4.y : ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var2, 0, 24960, 110588);
                                        String str = TimeFormatterExtKt.formattedDateFromLong(conversation2.lastPart().getCreatedAt(), context);
                                        jt1Var2.K(433245310);
                                        if (str.length() > 0) {
                                            mia.b(str, eo7.m(aVar, 8.0f, 0.0f, 0.0f, 0.0f, 14), intercomTheme.getColors(jt1Var2, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i14).getType04(), jt1Var2, 48, 0, 131064);
                                            jt1Var3 = jt1Var2;
                                        } else {
                                            jt1Var3 = jt1Var2;
                                        }
                                        jt1Var3.B();
                                        jt1Var3.I();
                                        String summary = conversation2.lastPart().getSummary();
                                        jt1Var3.K(-1283405160);
                                        summary.getClass();
                                        if (summary.length() > 0) {
                                            jt1Var3.K(-1283403261);
                                            if (conversation2.lastPart().getParticipant().isUserWithId(ConversationItemKt.getUserIntercomId())) {
                                                strA = nr1.f(jt1Var3, R.string.intercom_you) + ": " + summary;
                                            } else {
                                                String firstName = conversation2.lastParticipatingAdmin().getFirstName();
                                                if (firstName.length() == 0) {
                                                    firstName = ConversationItemKt.getWorkspaceName();
                                                }
                                                strA = cj2.a(firstName, ": ", summary);
                                            }
                                            jt1Var3.B();
                                            mia.b(strA, null, intercomTheme.getColors(jt1Var3, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var3, i14).getType04(), 0L, 0L, conversation2.isRead() ? ob4.y : ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var2, 0, 24960, 110586);
                                            jt1Var3 = jt1Var2;
                                        }
                                        jt1Var3.B();
                                        jt1Var3.I();
                                        if (z5) {
                                            ConversationItemKt.UnreadIndicator(null, jt1Var3, 0, 1);
                                        }
                                        jt1Var3.B();
                                    }
                                    jt1Var3.I();
                                }

                                @Override // defpackage.ci4
                                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                    invoke(jt1Var2, num.intValue());
                                    return g2b.a;
                                }
                            }, bj4VarO), bj4Var, 12582912, 126);
                            ox6 ox6Var5 = ox6Var3;
                            currentlyTypingState4 = currentlyTypingState3;
                            ox6Var4 = ox6Var5;
                        } else {
                            bj4VarO.u();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            CurrentlyTypingState currentlyTypingState7 = currentlyTypingState2;
                            i9 = i3;
                            currentlyTypingState3 = currentlyTypingState7;
                            ox6Var3 = ox6Var2;
                        }
                        go7Var2 = ko7Var;
                        z3 = z2;
                        bj4VarO.V();
                        bj4VarO.K(-437489840);
                        i10 = 0;
                        if ((i9 & 458752) == 131072) {
                        }
                        objF = bj4VarO.f();
                        if (z4) {
                            objF = new b22(i10, mh4Var);
                            bj4VarO.C(objF);
                        } else {
                            objF = new b22(i10, mh4Var);
                            bj4VarO.C(objF);
                        }
                        bj4VarO.U(false);
                        bj4Var = bj4VarO;
                        v5a.a(we1.c(ox6Var3, false, null, (mh4) objF, 15), null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(774321672, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.ConversationItemKt.ConversationItem.2
                            public final void invoke(jt1 jt1Var2, int i13) {
                                List listH;
                                bt1.a.b bVar;
                                bt1.a.d dVar;
                                bt1.a.C0034a c0034a;
                                String strA;
                                jt1 jt1Var3 = jt1Var2;
                                if ((i13 & 3) == 2 && jt1Var3.r()) {
                                    jt1Var3.u();
                                    return;
                                }
                                go7 go7Var3 = go7Var2;
                                ox6.a aVar = ox6.a.t;
                                ox6 ox6VarH = eo7.h(aVar, go7Var3);
                                CurrentlyTypingState currentlyTypingState8 = currentlyTypingState3;
                                Conversation conversation2 = conversation;
                                boolean z5 = z3;
                                c30.j jVar = c30.a;
                                sp0.b bVar2 = di.a.k;
                                ny8 ny8VarA = ly8.a(jVar, bVar2, jt1Var3, 48);
                                int iHashCode = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY = jt1Var3.y();
                                ox6 ox6VarC = it1.c(jt1Var3, ox6VarH);
                                bt1.c.getClass();
                                qr5.a aVar2 = bt1.a.b;
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar2);
                                } else {
                                    jt1Var3.z();
                                }
                                bt1.a.c cVar = bt1.a.f;
                                rd7.d(jt1Var3, cVar, ny8VarA);
                                bt1.a.e eVar = bt1.a.e;
                                rd7.d(jt1Var3, eVar, kw7VarY);
                                Integer numValueOf = Integer.valueOf(iHashCode);
                                bt1.a.b bVar3 = bt1.a.g;
                                rd7.d(jt1Var3, bVar3, numValueOf);
                                bt1.a.C0034a c0034a2 = bt1.a.h;
                                rd7.c(jt1Var3, c0034a2);
                                bt1.a.d dVar2 = bt1.a.d;
                                rd7.d(jt1Var3, dVar2, ox6VarC);
                                jt1Var3.K(1766961464);
                                if (currentlyTypingState8 == null || currentlyTypingState8.getShowAvatar()) {
                                    if (currentlyTypingState8 != null) {
                                        listH = ws0.h(currentlyTypingState8.getAvatarWrapper());
                                    } else if (LastParticipatingAdmin.isNull(conversation2.lastParticipatingAdmin())) {
                                        listH = ConversationItemKt.getActiveAdminsAvatars();
                                    } else {
                                        Avatar avatar = conversation2.lastParticipatingAdmin().getAvatar();
                                        avatar.getClass();
                                        listH = ws0.h(new AvatarWrapper(avatar, conversation2.lastParticipatingAdmin().isBot()));
                                    }
                                    bVar = bVar3;
                                    dVar = dVar2;
                                    c0034a = c0034a2;
                                    AvatarTriangleGroupKt.m20AvatarTriangleGroupjt2gSs(listH, new beb(), null, 32.0f, jt1Var3, 3072, 4);
                                    b47.b(jt1Var3, ir9.n(aVar, 12.0f));
                                } else {
                                    c0034a = c0034a2;
                                    bVar = bVar3;
                                    dVar = dVar2;
                                }
                                jt1Var3.B();
                                py8 py8Var = py8.a;
                                if (currentlyTypingState8 != null) {
                                    jt1Var3.K(-1057866277);
                                    TypingIndicatorKt.AnimatedTypingDots(ir9.b(py8Var.a(aVar, 2.0f, true), 0.0f, 38.0f, 1), jt1Var3, 0, 0);
                                    jt1Var3.B();
                                } else {
                                    jt1Var3.K(-1057575373);
                                    Context context = (Context) jt1Var3.F(AndroidCompositionLocals_androidKt.b);
                                    ox6 ox6VarA = py8Var.a(aVar, 2.0f, true);
                                    aj1 aj1VarA = yi1.a(new c30.h(2.0f, true, new a30()), di.a.m, jt1Var3, 6);
                                    int iHashCode2 = Long.hashCode(jt1Var3.v());
                                    kw7 kw7VarY2 = jt1Var3.y();
                                    ox6 ox6VarC2 = it1.c(jt1Var3, ox6VarA);
                                    if (jt1Var3.s() == null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    jt1Var3.q();
                                    if (jt1Var3.l()) {
                                        jt1Var3.k(aVar2);
                                    } else {
                                        jt1Var3.z();
                                    }
                                    rd7.d(jt1Var3, cVar, aj1VarA);
                                    rd7.d(jt1Var3, eVar, kw7VarY2);
                                    g3.c(iHashCode2, jt1Var3, bVar, jt1Var3, c0034a);
                                    rd7.d(jt1Var3, dVar, ox6VarC2);
                                    ox6 ox6VarC3 = ir9.c(aVar, 1.0f);
                                    ny8 ny8VarA2 = ly8.a(jVar, bVar2, jt1Var3, 48);
                                    int iHashCode3 = Long.hashCode(jt1Var3.v());
                                    kw7 kw7VarY3 = jt1Var3.y();
                                    ox6 ox6VarC4 = it1.c(jt1Var3, ox6VarC3);
                                    if (jt1Var3.s() == null) {
                                        ml5.c();
                                        throw null;
                                    }
                                    jt1Var3.q();
                                    if (jt1Var3.l()) {
                                        jt1Var3.k(aVar2);
                                    } else {
                                        jt1Var3.z();
                                    }
                                    rd7.d(jt1Var3, cVar, ny8VarA2);
                                    rd7.d(jt1Var3, eVar, kw7VarY3);
                                    g3.c(iHashCode3, jt1Var3, bVar, jt1Var3, c0034a);
                                    rd7.d(jt1Var3, dVar, ox6VarC4);
                                    String title = conversation2.getTitle();
                                    ox6 ox6VarA2 = py8Var.a(aVar, 1.0f, true);
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    int i14 = IntercomTheme.$stable;
                                    mia.b(title, ox6VarA2, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var3, i14).getType04(), 0L, 0L, conversation2.isRead() ? ob4.y : ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var2, 0, 24960, 110588);
                                    String str = TimeFormatterExtKt.formattedDateFromLong(conversation2.lastPart().getCreatedAt(), context);
                                    jt1Var2.K(433245310);
                                    if (str.length() > 0) {
                                        mia.b(str, eo7.m(aVar, 8.0f, 0.0f, 0.0f, 0.0f, 14), intercomTheme.getColors(jt1Var2, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i14).getType04(), jt1Var2, 48, 0, 131064);
                                        jt1Var3 = jt1Var2;
                                    } else {
                                        jt1Var3 = jt1Var2;
                                    }
                                    jt1Var3.B();
                                    jt1Var3.I();
                                    String summary = conversation2.lastPart().getSummary();
                                    jt1Var3.K(-1283405160);
                                    summary.getClass();
                                    if (summary.length() > 0) {
                                        jt1Var3.K(-1283403261);
                                        if (conversation2.lastPart().getParticipant().isUserWithId(ConversationItemKt.getUserIntercomId())) {
                                            strA = nr1.f(jt1Var3, R.string.intercom_you) + ": " + summary;
                                        } else {
                                            String firstName = conversation2.lastParticipatingAdmin().getFirstName();
                                            if (firstName.length() == 0) {
                                                firstName = ConversationItemKt.getWorkspaceName();
                                            }
                                            strA = cj2.a(firstName, ": ", summary);
                                        }
                                        jt1Var3.B();
                                        mia.b(strA, null, intercomTheme.getColors(jt1Var3, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var3, i14).getType04(), 0L, 0L, conversation2.isRead() ? ob4.y : ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var2, 0, 24960, 110586);
                                        jt1Var3 = jt1Var2;
                                    }
                                    jt1Var3.B();
                                    jt1Var3.I();
                                    if (z5) {
                                        ConversationItemKt.UnreadIndicator(null, jt1Var3, 0, 1);
                                    }
                                    jt1Var3.B();
                                }
                                jt1Var3.I();
                            }

                            @Override // defpackage.ci4
                            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                                invoke(jt1Var2, num.intValue());
                                return g2b.a;
                            }
                        }, bj4VarO), bj4Var, 12582912, 126);
                        ox6 ox6Var6 = ox6Var3;
                        currentlyTypingState4 = currentlyTypingState3;
                        ox6Var4 = ox6Var6;
                    } else {
                        bj4VarO.u();
                        bj4Var = bj4VarO;
                        ox6Var4 = ox6Var2;
                        currentlyTypingState4 = currentlyTypingState2;
                        go7Var2 = ko7Var;
                        z3 = z2;
                    }
                    xj8VarW = bj4Var.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: c22
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return ConversationItemKt.ConversationItem$lambda$2(conversation, ox6Var4, currentlyTypingState4, go7Var2, z3, mh4Var, i, i2, (jt1) obj, iIntValue);
                            }
                        };
                    }
                }
                i3 |= 3072;
                ko7Var = go7Var;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        z2 = z;
                        if (bj4VarO.c(z2)) {
                        }
                        i3 |= i12;
                    } else {
                        z2 = z;
                    }
                    i3 |= i12;
                } else {
                    z2 = z;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (bj4VarO.j(mh4Var)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((74899 & i3) == 74898) {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            currentlyTypingState2 = null;
                        }
                        if (i6 != 0) {
                            ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            CurrentlyTypingState currentlyTypingState8 = currentlyTypingState2;
                            i9 = i3 & (-57345);
                            currentlyTypingState3 = currentlyTypingState8;
                            z3 = !conversation.isRead();
                            go7Var2 = ko7Var;
                        } else {
                            CurrentlyTypingState currentlyTypingState9 = currentlyTypingState2;
                            i9 = i3;
                            currentlyTypingState3 = currentlyTypingState9;
                            go7Var2 = ko7Var;
                            z3 = z2;
                        }
                    } else {
                        if (i11 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            currentlyTypingState2 = null;
                        }
                        if (i6 != 0) {
                            ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            CurrentlyTypingState currentlyTypingState10 = currentlyTypingState2;
                            i9 = i3 & (-57345);
                            currentlyTypingState3 = currentlyTypingState10;
                            z3 = !conversation.isRead();
                            go7Var2 = ko7Var;
                        } else {
                            CurrentlyTypingState currentlyTypingState11 = currentlyTypingState2;
                            i9 = i3;
                            currentlyTypingState3 = currentlyTypingState11;
                            go7Var2 = ko7Var;
                            z3 = z2;
                        }
                    }
                    bj4VarO.V();
                    bj4VarO.K(-437489840);
                    i10 = 0;
                    if ((i9 & 458752) == 131072) {
                    }
                    objF = bj4VarO.f();
                    if (z4) {
                        objF = new b22(i10, mh4Var);
                        bj4VarO.C(objF);
                    } else {
                        objF = new b22(i10, mh4Var);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    bj4Var = bj4VarO;
                    v5a.a(we1.c(ox6Var3, false, null, (mh4) objF, 15), null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(774321672, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.ConversationItemKt.ConversationItem.2
                        public final void invoke(jt1 jt1Var2, int i13) {
                            List listH;
                            bt1.a.b bVar;
                            bt1.a.d dVar;
                            bt1.a.C0034a c0034a;
                            String strA;
                            jt1 jt1Var3 = jt1Var2;
                            if ((i13 & 3) == 2 && jt1Var3.r()) {
                                jt1Var3.u();
                                return;
                            }
                            go7 go7Var3 = go7Var2;
                            ox6.a aVar = ox6.a.t;
                            ox6 ox6VarH = eo7.h(aVar, go7Var3);
                            CurrentlyTypingState currentlyTypingState12 = currentlyTypingState3;
                            Conversation conversation2 = conversation;
                            boolean z5 = z3;
                            c30.j jVar = c30.a;
                            sp0.b bVar2 = di.a.k;
                            ny8 ny8VarA = ly8.a(jVar, bVar2, jt1Var3, 48);
                            int iHashCode = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY = jt1Var3.y();
                            ox6 ox6VarC = it1.c(jt1Var3, ox6VarH);
                            bt1.c.getClass();
                            qr5.a aVar2 = bt1.a.b;
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar2);
                            } else {
                                jt1Var3.z();
                            }
                            bt1.a.c cVar = bt1.a.f;
                            rd7.d(jt1Var3, cVar, ny8VarA);
                            bt1.a.e eVar = bt1.a.e;
                            rd7.d(jt1Var3, eVar, kw7VarY);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            bt1.a.b bVar3 = bt1.a.g;
                            rd7.d(jt1Var3, bVar3, numValueOf);
                            bt1.a.C0034a c0034a2 = bt1.a.h;
                            rd7.c(jt1Var3, c0034a2);
                            bt1.a.d dVar2 = bt1.a.d;
                            rd7.d(jt1Var3, dVar2, ox6VarC);
                            jt1Var3.K(1766961464);
                            if (currentlyTypingState12 == null || currentlyTypingState12.getShowAvatar()) {
                                if (currentlyTypingState12 != null) {
                                    listH = ws0.h(currentlyTypingState12.getAvatarWrapper());
                                } else if (LastParticipatingAdmin.isNull(conversation2.lastParticipatingAdmin())) {
                                    listH = ConversationItemKt.getActiveAdminsAvatars();
                                } else {
                                    Avatar avatar = conversation2.lastParticipatingAdmin().getAvatar();
                                    avatar.getClass();
                                    listH = ws0.h(new AvatarWrapper(avatar, conversation2.lastParticipatingAdmin().isBot()));
                                }
                                bVar = bVar3;
                                dVar = dVar2;
                                c0034a = c0034a2;
                                AvatarTriangleGroupKt.m20AvatarTriangleGroupjt2gSs(listH, new beb(), null, 32.0f, jt1Var3, 3072, 4);
                                b47.b(jt1Var3, ir9.n(aVar, 12.0f));
                            } else {
                                c0034a = c0034a2;
                                bVar = bVar3;
                                dVar = dVar2;
                            }
                            jt1Var3.B();
                            py8 py8Var = py8.a;
                            if (currentlyTypingState12 != null) {
                                jt1Var3.K(-1057866277);
                                TypingIndicatorKt.AnimatedTypingDots(ir9.b(py8Var.a(aVar, 2.0f, true), 0.0f, 38.0f, 1), jt1Var3, 0, 0);
                                jt1Var3.B();
                            } else {
                                jt1Var3.K(-1057575373);
                                Context context = (Context) jt1Var3.F(AndroidCompositionLocals_androidKt.b);
                                ox6 ox6VarA = py8Var.a(aVar, 2.0f, true);
                                aj1 aj1VarA = yi1.a(new c30.h(2.0f, true, new a30()), di.a.m, jt1Var3, 6);
                                int iHashCode2 = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY2 = jt1Var3.y();
                                ox6 ox6VarC2 = it1.c(jt1Var3, ox6VarA);
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar2);
                                } else {
                                    jt1Var3.z();
                                }
                                rd7.d(jt1Var3, cVar, aj1VarA);
                                rd7.d(jt1Var3, eVar, kw7VarY2);
                                g3.c(iHashCode2, jt1Var3, bVar, jt1Var3, c0034a);
                                rd7.d(jt1Var3, dVar, ox6VarC2);
                                ox6 ox6VarC3 = ir9.c(aVar, 1.0f);
                                ny8 ny8VarA2 = ly8.a(jVar, bVar2, jt1Var3, 48);
                                int iHashCode3 = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY3 = jt1Var3.y();
                                ox6 ox6VarC4 = it1.c(jt1Var3, ox6VarC3);
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar2);
                                } else {
                                    jt1Var3.z();
                                }
                                rd7.d(jt1Var3, cVar, ny8VarA2);
                                rd7.d(jt1Var3, eVar, kw7VarY3);
                                g3.c(iHashCode3, jt1Var3, bVar, jt1Var3, c0034a);
                                rd7.d(jt1Var3, dVar, ox6VarC4);
                                String title = conversation2.getTitle();
                                ox6 ox6VarA2 = py8Var.a(aVar, 1.0f, true);
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                int i14 = IntercomTheme.$stable;
                                mia.b(title, ox6VarA2, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var3, i14).getType04(), 0L, 0L, conversation2.isRead() ? ob4.y : ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var2, 0, 24960, 110588);
                                String str = TimeFormatterExtKt.formattedDateFromLong(conversation2.lastPart().getCreatedAt(), context);
                                jt1Var2.K(433245310);
                                if (str.length() > 0) {
                                    mia.b(str, eo7.m(aVar, 8.0f, 0.0f, 0.0f, 0.0f, 14), intercomTheme.getColors(jt1Var2, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i14).getType04(), jt1Var2, 48, 0, 131064);
                                    jt1Var3 = jt1Var2;
                                } else {
                                    jt1Var3 = jt1Var2;
                                }
                                jt1Var3.B();
                                jt1Var3.I();
                                String summary = conversation2.lastPart().getSummary();
                                jt1Var3.K(-1283405160);
                                summary.getClass();
                                if (summary.length() > 0) {
                                    jt1Var3.K(-1283403261);
                                    if (conversation2.lastPart().getParticipant().isUserWithId(ConversationItemKt.getUserIntercomId())) {
                                        strA = nr1.f(jt1Var3, R.string.intercom_you) + ": " + summary;
                                    } else {
                                        String firstName = conversation2.lastParticipatingAdmin().getFirstName();
                                        if (firstName.length() == 0) {
                                            firstName = ConversationItemKt.getWorkspaceName();
                                        }
                                        strA = cj2.a(firstName, ": ", summary);
                                    }
                                    jt1Var3.B();
                                    mia.b(strA, null, intercomTheme.getColors(jt1Var3, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var3, i14).getType04(), 0L, 0L, conversation2.isRead() ? ob4.y : ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var2, 0, 24960, 110586);
                                    jt1Var3 = jt1Var2;
                                }
                                jt1Var3.B();
                                jt1Var3.I();
                                if (z5) {
                                    ConversationItemKt.UnreadIndicator(null, jt1Var3, 0, 1);
                                }
                                jt1Var3.B();
                            }
                            jt1Var3.I();
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), bj4Var, 12582912, 126);
                    ox6 ox6Var7 = ox6Var3;
                    currentlyTypingState4 = currentlyTypingState3;
                    ox6Var4 = ox6Var7;
                } else {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            currentlyTypingState2 = null;
                        }
                        if (i6 != 0) {
                            ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            CurrentlyTypingState currentlyTypingState12 = currentlyTypingState2;
                            i9 = i3 & (-57345);
                            currentlyTypingState3 = currentlyTypingState12;
                            z3 = !conversation.isRead();
                            go7Var2 = ko7Var;
                        } else {
                            CurrentlyTypingState currentlyTypingState13 = currentlyTypingState2;
                            i9 = i3;
                            currentlyTypingState3 = currentlyTypingState13;
                            go7Var2 = ko7Var;
                            z3 = z2;
                        }
                    } else {
                        if (i11 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            currentlyTypingState2 = null;
                        }
                        if (i6 != 0) {
                            ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            CurrentlyTypingState currentlyTypingState14 = currentlyTypingState2;
                            i9 = i3 & (-57345);
                            currentlyTypingState3 = currentlyTypingState14;
                            z3 = !conversation.isRead();
                            go7Var2 = ko7Var;
                        } else {
                            CurrentlyTypingState currentlyTypingState15 = currentlyTypingState2;
                            i9 = i3;
                            currentlyTypingState3 = currentlyTypingState15;
                            go7Var2 = ko7Var;
                            z3 = z2;
                        }
                    }
                    bj4VarO.V();
                    bj4VarO.K(-437489840);
                    i10 = 0;
                    if ((i9 & 458752) == 131072) {
                    }
                    objF = bj4VarO.f();
                    if (z4) {
                        objF = new b22(i10, mh4Var);
                        bj4VarO.C(objF);
                    } else {
                        objF = new b22(i10, mh4Var);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    bj4Var = bj4VarO;
                    v5a.a(we1.c(ox6Var3, false, null, (mh4) objF, 15), null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(774321672, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.ConversationItemKt.ConversationItem.2
                        public final void invoke(jt1 jt1Var2, int i13) {
                            List listH;
                            bt1.a.b bVar;
                            bt1.a.d dVar;
                            bt1.a.C0034a c0034a;
                            String strA;
                            jt1 jt1Var3 = jt1Var2;
                            if ((i13 & 3) == 2 && jt1Var3.r()) {
                                jt1Var3.u();
                                return;
                            }
                            go7 go7Var3 = go7Var2;
                            ox6.a aVar = ox6.a.t;
                            ox6 ox6VarH = eo7.h(aVar, go7Var3);
                            CurrentlyTypingState currentlyTypingState16 = currentlyTypingState3;
                            Conversation conversation2 = conversation;
                            boolean z5 = z3;
                            c30.j jVar = c30.a;
                            sp0.b bVar2 = di.a.k;
                            ny8 ny8VarA = ly8.a(jVar, bVar2, jt1Var3, 48);
                            int iHashCode = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY = jt1Var3.y();
                            ox6 ox6VarC = it1.c(jt1Var3, ox6VarH);
                            bt1.c.getClass();
                            qr5.a aVar2 = bt1.a.b;
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar2);
                            } else {
                                jt1Var3.z();
                            }
                            bt1.a.c cVar = bt1.a.f;
                            rd7.d(jt1Var3, cVar, ny8VarA);
                            bt1.a.e eVar = bt1.a.e;
                            rd7.d(jt1Var3, eVar, kw7VarY);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            bt1.a.b bVar3 = bt1.a.g;
                            rd7.d(jt1Var3, bVar3, numValueOf);
                            bt1.a.C0034a c0034a2 = bt1.a.h;
                            rd7.c(jt1Var3, c0034a2);
                            bt1.a.d dVar2 = bt1.a.d;
                            rd7.d(jt1Var3, dVar2, ox6VarC);
                            jt1Var3.K(1766961464);
                            if (currentlyTypingState16 == null || currentlyTypingState16.getShowAvatar()) {
                                if (currentlyTypingState16 != null) {
                                    listH = ws0.h(currentlyTypingState16.getAvatarWrapper());
                                } else if (LastParticipatingAdmin.isNull(conversation2.lastParticipatingAdmin())) {
                                    listH = ConversationItemKt.getActiveAdminsAvatars();
                                } else {
                                    Avatar avatar = conversation2.lastParticipatingAdmin().getAvatar();
                                    avatar.getClass();
                                    listH = ws0.h(new AvatarWrapper(avatar, conversation2.lastParticipatingAdmin().isBot()));
                                }
                                bVar = bVar3;
                                dVar = dVar2;
                                c0034a = c0034a2;
                                AvatarTriangleGroupKt.m20AvatarTriangleGroupjt2gSs(listH, new beb(), null, 32.0f, jt1Var3, 3072, 4);
                                b47.b(jt1Var3, ir9.n(aVar, 12.0f));
                            } else {
                                c0034a = c0034a2;
                                bVar = bVar3;
                                dVar = dVar2;
                            }
                            jt1Var3.B();
                            py8 py8Var = py8.a;
                            if (currentlyTypingState16 != null) {
                                jt1Var3.K(-1057866277);
                                TypingIndicatorKt.AnimatedTypingDots(ir9.b(py8Var.a(aVar, 2.0f, true), 0.0f, 38.0f, 1), jt1Var3, 0, 0);
                                jt1Var3.B();
                            } else {
                                jt1Var3.K(-1057575373);
                                Context context = (Context) jt1Var3.F(AndroidCompositionLocals_androidKt.b);
                                ox6 ox6VarA = py8Var.a(aVar, 2.0f, true);
                                aj1 aj1VarA = yi1.a(new c30.h(2.0f, true, new a30()), di.a.m, jt1Var3, 6);
                                int iHashCode2 = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY2 = jt1Var3.y();
                                ox6 ox6VarC2 = it1.c(jt1Var3, ox6VarA);
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar2);
                                } else {
                                    jt1Var3.z();
                                }
                                rd7.d(jt1Var3, cVar, aj1VarA);
                                rd7.d(jt1Var3, eVar, kw7VarY2);
                                g3.c(iHashCode2, jt1Var3, bVar, jt1Var3, c0034a);
                                rd7.d(jt1Var3, dVar, ox6VarC2);
                                ox6 ox6VarC3 = ir9.c(aVar, 1.0f);
                                ny8 ny8VarA2 = ly8.a(jVar, bVar2, jt1Var3, 48);
                                int iHashCode3 = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY3 = jt1Var3.y();
                                ox6 ox6VarC4 = it1.c(jt1Var3, ox6VarC3);
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar2);
                                } else {
                                    jt1Var3.z();
                                }
                                rd7.d(jt1Var3, cVar, ny8VarA2);
                                rd7.d(jt1Var3, eVar, kw7VarY3);
                                g3.c(iHashCode3, jt1Var3, bVar, jt1Var3, c0034a);
                                rd7.d(jt1Var3, dVar, ox6VarC4);
                                String title = conversation2.getTitle();
                                ox6 ox6VarA2 = py8Var.a(aVar, 1.0f, true);
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                int i14 = IntercomTheme.$stable;
                                mia.b(title, ox6VarA2, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var3, i14).getType04(), 0L, 0L, conversation2.isRead() ? ob4.y : ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var2, 0, 24960, 110588);
                                String str = TimeFormatterExtKt.formattedDateFromLong(conversation2.lastPart().getCreatedAt(), context);
                                jt1Var2.K(433245310);
                                if (str.length() > 0) {
                                    mia.b(str, eo7.m(aVar, 8.0f, 0.0f, 0.0f, 0.0f, 14), intercomTheme.getColors(jt1Var2, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i14).getType04(), jt1Var2, 48, 0, 131064);
                                    jt1Var3 = jt1Var2;
                                } else {
                                    jt1Var3 = jt1Var2;
                                }
                                jt1Var3.B();
                                jt1Var3.I();
                                String summary = conversation2.lastPart().getSummary();
                                jt1Var3.K(-1283405160);
                                summary.getClass();
                                if (summary.length() > 0) {
                                    jt1Var3.K(-1283403261);
                                    if (conversation2.lastPart().getParticipant().isUserWithId(ConversationItemKt.getUserIntercomId())) {
                                        strA = nr1.f(jt1Var3, R.string.intercom_you) + ": " + summary;
                                    } else {
                                        String firstName = conversation2.lastParticipatingAdmin().getFirstName();
                                        if (firstName.length() == 0) {
                                            firstName = ConversationItemKt.getWorkspaceName();
                                        }
                                        strA = cj2.a(firstName, ": ", summary);
                                    }
                                    jt1Var3.B();
                                    mia.b(strA, null, intercomTheme.getColors(jt1Var3, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var3, i14).getType04(), 0L, 0L, conversation2.isRead() ? ob4.y : ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var2, 0, 24960, 110586);
                                    jt1Var3 = jt1Var2;
                                }
                                jt1Var3.B();
                                jt1Var3.I();
                                if (z5) {
                                    ConversationItemKt.UnreadIndicator(null, jt1Var3, 0, 1);
                                }
                                jt1Var3.B();
                            }
                            jt1Var3.I();
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), bj4Var, 12582912, 126);
                    ox6 ox6Var8 = ox6Var3;
                    currentlyTypingState4 = currentlyTypingState3;
                    ox6Var4 = ox6Var8;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: c22
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ConversationItemKt.ConversationItem$lambda$2(conversation, ox6Var4, currentlyTypingState4, go7Var2, z3, mh4Var, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 384;
            currentlyTypingState2 = currentlyTypingState;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    ko7Var = go7Var;
                    if (bj4VarO.J(ko7Var)) {
                        i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        z2 = z;
                        if (bj4VarO.c(z2)) {
                        }
                        i3 |= i12;
                    } else {
                        z2 = z;
                    }
                    i3 |= i12;
                } else {
                    z2 = z;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (bj4VarO.j(mh4Var)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((74899 & i3) == 74898) {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            currentlyTypingState2 = null;
                        }
                        if (i6 != 0) {
                            ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            CurrentlyTypingState currentlyTypingState16 = currentlyTypingState2;
                            i9 = i3 & (-57345);
                            currentlyTypingState3 = currentlyTypingState16;
                            z3 = !conversation.isRead();
                            go7Var2 = ko7Var;
                        } else {
                            CurrentlyTypingState currentlyTypingState17 = currentlyTypingState2;
                            i9 = i3;
                            currentlyTypingState3 = currentlyTypingState17;
                            go7Var2 = ko7Var;
                            z3 = z2;
                        }
                    } else {
                        if (i11 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            currentlyTypingState2 = null;
                        }
                        if (i6 != 0) {
                            ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            CurrentlyTypingState currentlyTypingState18 = currentlyTypingState2;
                            i9 = i3 & (-57345);
                            currentlyTypingState3 = currentlyTypingState18;
                            z3 = !conversation.isRead();
                            go7Var2 = ko7Var;
                        } else {
                            CurrentlyTypingState currentlyTypingState19 = currentlyTypingState2;
                            i9 = i3;
                            currentlyTypingState3 = currentlyTypingState19;
                            go7Var2 = ko7Var;
                            z3 = z2;
                        }
                    }
                    bj4VarO.V();
                    bj4VarO.K(-437489840);
                    i10 = 0;
                    if ((i9 & 458752) == 131072) {
                    }
                    objF = bj4VarO.f();
                    if (z4) {
                        objF = new b22(i10, mh4Var);
                        bj4VarO.C(objF);
                    } else {
                        objF = new b22(i10, mh4Var);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    bj4Var = bj4VarO;
                    v5a.a(we1.c(ox6Var3, false, null, (mh4) objF, 15), null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(774321672, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.ConversationItemKt.ConversationItem.2
                        public final void invoke(jt1 jt1Var2, int i13) {
                            List listH;
                            bt1.a.b bVar;
                            bt1.a.d dVar;
                            bt1.a.C0034a c0034a;
                            String strA;
                            jt1 jt1Var3 = jt1Var2;
                            if ((i13 & 3) == 2 && jt1Var3.r()) {
                                jt1Var3.u();
                                return;
                            }
                            go7 go7Var3 = go7Var2;
                            ox6.a aVar = ox6.a.t;
                            ox6 ox6VarH = eo7.h(aVar, go7Var3);
                            CurrentlyTypingState currentlyTypingState110 = currentlyTypingState3;
                            Conversation conversation2 = conversation;
                            boolean z5 = z3;
                            c30.j jVar = c30.a;
                            sp0.b bVar2 = di.a.k;
                            ny8 ny8VarA = ly8.a(jVar, bVar2, jt1Var3, 48);
                            int iHashCode = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY = jt1Var3.y();
                            ox6 ox6VarC = it1.c(jt1Var3, ox6VarH);
                            bt1.c.getClass();
                            qr5.a aVar2 = bt1.a.b;
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar2);
                            } else {
                                jt1Var3.z();
                            }
                            bt1.a.c cVar = bt1.a.f;
                            rd7.d(jt1Var3, cVar, ny8VarA);
                            bt1.a.e eVar = bt1.a.e;
                            rd7.d(jt1Var3, eVar, kw7VarY);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            bt1.a.b bVar3 = bt1.a.g;
                            rd7.d(jt1Var3, bVar3, numValueOf);
                            bt1.a.C0034a c0034a2 = bt1.a.h;
                            rd7.c(jt1Var3, c0034a2);
                            bt1.a.d dVar2 = bt1.a.d;
                            rd7.d(jt1Var3, dVar2, ox6VarC);
                            jt1Var3.K(1766961464);
                            if (currentlyTypingState110 == null || currentlyTypingState110.getShowAvatar()) {
                                if (currentlyTypingState110 != null) {
                                    listH = ws0.h(currentlyTypingState110.getAvatarWrapper());
                                } else if (LastParticipatingAdmin.isNull(conversation2.lastParticipatingAdmin())) {
                                    listH = ConversationItemKt.getActiveAdminsAvatars();
                                } else {
                                    Avatar avatar = conversation2.lastParticipatingAdmin().getAvatar();
                                    avatar.getClass();
                                    listH = ws0.h(new AvatarWrapper(avatar, conversation2.lastParticipatingAdmin().isBot()));
                                }
                                bVar = bVar3;
                                dVar = dVar2;
                                c0034a = c0034a2;
                                AvatarTriangleGroupKt.m20AvatarTriangleGroupjt2gSs(listH, new beb(), null, 32.0f, jt1Var3, 3072, 4);
                                b47.b(jt1Var3, ir9.n(aVar, 12.0f));
                            } else {
                                c0034a = c0034a2;
                                bVar = bVar3;
                                dVar = dVar2;
                            }
                            jt1Var3.B();
                            py8 py8Var = py8.a;
                            if (currentlyTypingState110 != null) {
                                jt1Var3.K(-1057866277);
                                TypingIndicatorKt.AnimatedTypingDots(ir9.b(py8Var.a(aVar, 2.0f, true), 0.0f, 38.0f, 1), jt1Var3, 0, 0);
                                jt1Var3.B();
                            } else {
                                jt1Var3.K(-1057575373);
                                Context context = (Context) jt1Var3.F(AndroidCompositionLocals_androidKt.b);
                                ox6 ox6VarA = py8Var.a(aVar, 2.0f, true);
                                aj1 aj1VarA = yi1.a(new c30.h(2.0f, true, new a30()), di.a.m, jt1Var3, 6);
                                int iHashCode2 = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY2 = jt1Var3.y();
                                ox6 ox6VarC2 = it1.c(jt1Var3, ox6VarA);
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar2);
                                } else {
                                    jt1Var3.z();
                                }
                                rd7.d(jt1Var3, cVar, aj1VarA);
                                rd7.d(jt1Var3, eVar, kw7VarY2);
                                g3.c(iHashCode2, jt1Var3, bVar, jt1Var3, c0034a);
                                rd7.d(jt1Var3, dVar, ox6VarC2);
                                ox6 ox6VarC3 = ir9.c(aVar, 1.0f);
                                ny8 ny8VarA2 = ly8.a(jVar, bVar2, jt1Var3, 48);
                                int iHashCode3 = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY3 = jt1Var3.y();
                                ox6 ox6VarC4 = it1.c(jt1Var3, ox6VarC3);
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar2);
                                } else {
                                    jt1Var3.z();
                                }
                                rd7.d(jt1Var3, cVar, ny8VarA2);
                                rd7.d(jt1Var3, eVar, kw7VarY3);
                                g3.c(iHashCode3, jt1Var3, bVar, jt1Var3, c0034a);
                                rd7.d(jt1Var3, dVar, ox6VarC4);
                                String title = conversation2.getTitle();
                                ox6 ox6VarA2 = py8Var.a(aVar, 1.0f, true);
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                int i14 = IntercomTheme.$stable;
                                mia.b(title, ox6VarA2, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var3, i14).getType04(), 0L, 0L, conversation2.isRead() ? ob4.y : ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var2, 0, 24960, 110588);
                                String str = TimeFormatterExtKt.formattedDateFromLong(conversation2.lastPart().getCreatedAt(), context);
                                jt1Var2.K(433245310);
                                if (str.length() > 0) {
                                    mia.b(str, eo7.m(aVar, 8.0f, 0.0f, 0.0f, 0.0f, 14), intercomTheme.getColors(jt1Var2, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i14).getType04(), jt1Var2, 48, 0, 131064);
                                    jt1Var3 = jt1Var2;
                                } else {
                                    jt1Var3 = jt1Var2;
                                }
                                jt1Var3.B();
                                jt1Var3.I();
                                String summary = conversation2.lastPart().getSummary();
                                jt1Var3.K(-1283405160);
                                summary.getClass();
                                if (summary.length() > 0) {
                                    jt1Var3.K(-1283403261);
                                    if (conversation2.lastPart().getParticipant().isUserWithId(ConversationItemKt.getUserIntercomId())) {
                                        strA = nr1.f(jt1Var3, R.string.intercom_you) + ": " + summary;
                                    } else {
                                        String firstName = conversation2.lastParticipatingAdmin().getFirstName();
                                        if (firstName.length() == 0) {
                                            firstName = ConversationItemKt.getWorkspaceName();
                                        }
                                        strA = cj2.a(firstName, ": ", summary);
                                    }
                                    jt1Var3.B();
                                    mia.b(strA, null, intercomTheme.getColors(jt1Var3, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var3, i14).getType04(), 0L, 0L, conversation2.isRead() ? ob4.y : ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var2, 0, 24960, 110586);
                                    jt1Var3 = jt1Var2;
                                }
                                jt1Var3.B();
                                jt1Var3.I();
                                if (z5) {
                                    ConversationItemKt.UnreadIndicator(null, jt1Var3, 0, 1);
                                }
                                jt1Var3.B();
                            }
                            jt1Var3.I();
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), bj4Var, 12582912, 126);
                    ox6 ox6Var9 = ox6Var3;
                    currentlyTypingState4 = currentlyTypingState3;
                    ox6Var4 = ox6Var9;
                } else {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            currentlyTypingState2 = null;
                        }
                        if (i6 != 0) {
                            ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            CurrentlyTypingState currentlyTypingState110 = currentlyTypingState2;
                            i9 = i3 & (-57345);
                            currentlyTypingState3 = currentlyTypingState110;
                            z3 = !conversation.isRead();
                            go7Var2 = ko7Var;
                        } else {
                            CurrentlyTypingState currentlyTypingState111 = currentlyTypingState2;
                            i9 = i3;
                            currentlyTypingState3 = currentlyTypingState111;
                            go7Var2 = ko7Var;
                            z3 = z2;
                        }
                    } else {
                        if (i11 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            currentlyTypingState2 = null;
                        }
                        if (i6 != 0) {
                            ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            CurrentlyTypingState currentlyTypingState112 = currentlyTypingState2;
                            i9 = i3 & (-57345);
                            currentlyTypingState3 = currentlyTypingState112;
                            z3 = !conversation.isRead();
                            go7Var2 = ko7Var;
                        } else {
                            CurrentlyTypingState currentlyTypingState113 = currentlyTypingState2;
                            i9 = i3;
                            currentlyTypingState3 = currentlyTypingState113;
                            go7Var2 = ko7Var;
                            z3 = z2;
                        }
                    }
                    bj4VarO.V();
                    bj4VarO.K(-437489840);
                    i10 = 0;
                    if ((i9 & 458752) == 131072) {
                    }
                    objF = bj4VarO.f();
                    if (z4) {
                        objF = new b22(i10, mh4Var);
                        bj4VarO.C(objF);
                    } else {
                        objF = new b22(i10, mh4Var);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    bj4Var = bj4VarO;
                    v5a.a(we1.c(ox6Var3, false, null, (mh4) objF, 15), null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(774321672, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.ConversationItemKt.ConversationItem.2
                        public final void invoke(jt1 jt1Var2, int i13) {
                            List listH;
                            bt1.a.b bVar;
                            bt1.a.d dVar;
                            bt1.a.C0034a c0034a;
                            String strA;
                            jt1 jt1Var3 = jt1Var2;
                            if ((i13 & 3) == 2 && jt1Var3.r()) {
                                jt1Var3.u();
                                return;
                            }
                            go7 go7Var3 = go7Var2;
                            ox6.a aVar = ox6.a.t;
                            ox6 ox6VarH = eo7.h(aVar, go7Var3);
                            CurrentlyTypingState currentlyTypingState114 = currentlyTypingState3;
                            Conversation conversation2 = conversation;
                            boolean z5 = z3;
                            c30.j jVar = c30.a;
                            sp0.b bVar2 = di.a.k;
                            ny8 ny8VarA = ly8.a(jVar, bVar2, jt1Var3, 48);
                            int iHashCode = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY = jt1Var3.y();
                            ox6 ox6VarC = it1.c(jt1Var3, ox6VarH);
                            bt1.c.getClass();
                            qr5.a aVar2 = bt1.a.b;
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar2);
                            } else {
                                jt1Var3.z();
                            }
                            bt1.a.c cVar = bt1.a.f;
                            rd7.d(jt1Var3, cVar, ny8VarA);
                            bt1.a.e eVar = bt1.a.e;
                            rd7.d(jt1Var3, eVar, kw7VarY);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            bt1.a.b bVar3 = bt1.a.g;
                            rd7.d(jt1Var3, bVar3, numValueOf);
                            bt1.a.C0034a c0034a2 = bt1.a.h;
                            rd7.c(jt1Var3, c0034a2);
                            bt1.a.d dVar2 = bt1.a.d;
                            rd7.d(jt1Var3, dVar2, ox6VarC);
                            jt1Var3.K(1766961464);
                            if (currentlyTypingState114 == null || currentlyTypingState114.getShowAvatar()) {
                                if (currentlyTypingState114 != null) {
                                    listH = ws0.h(currentlyTypingState114.getAvatarWrapper());
                                } else if (LastParticipatingAdmin.isNull(conversation2.lastParticipatingAdmin())) {
                                    listH = ConversationItemKt.getActiveAdminsAvatars();
                                } else {
                                    Avatar avatar = conversation2.lastParticipatingAdmin().getAvatar();
                                    avatar.getClass();
                                    listH = ws0.h(new AvatarWrapper(avatar, conversation2.lastParticipatingAdmin().isBot()));
                                }
                                bVar = bVar3;
                                dVar = dVar2;
                                c0034a = c0034a2;
                                AvatarTriangleGroupKt.m20AvatarTriangleGroupjt2gSs(listH, new beb(), null, 32.0f, jt1Var3, 3072, 4);
                                b47.b(jt1Var3, ir9.n(aVar, 12.0f));
                            } else {
                                c0034a = c0034a2;
                                bVar = bVar3;
                                dVar = dVar2;
                            }
                            jt1Var3.B();
                            py8 py8Var = py8.a;
                            if (currentlyTypingState114 != null) {
                                jt1Var3.K(-1057866277);
                                TypingIndicatorKt.AnimatedTypingDots(ir9.b(py8Var.a(aVar, 2.0f, true), 0.0f, 38.0f, 1), jt1Var3, 0, 0);
                                jt1Var3.B();
                            } else {
                                jt1Var3.K(-1057575373);
                                Context context = (Context) jt1Var3.F(AndroidCompositionLocals_androidKt.b);
                                ox6 ox6VarA = py8Var.a(aVar, 2.0f, true);
                                aj1 aj1VarA = yi1.a(new c30.h(2.0f, true, new a30()), di.a.m, jt1Var3, 6);
                                int iHashCode2 = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY2 = jt1Var3.y();
                                ox6 ox6VarC2 = it1.c(jt1Var3, ox6VarA);
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar2);
                                } else {
                                    jt1Var3.z();
                                }
                                rd7.d(jt1Var3, cVar, aj1VarA);
                                rd7.d(jt1Var3, eVar, kw7VarY2);
                                g3.c(iHashCode2, jt1Var3, bVar, jt1Var3, c0034a);
                                rd7.d(jt1Var3, dVar, ox6VarC2);
                                ox6 ox6VarC3 = ir9.c(aVar, 1.0f);
                                ny8 ny8VarA2 = ly8.a(jVar, bVar2, jt1Var3, 48);
                                int iHashCode3 = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY3 = jt1Var3.y();
                                ox6 ox6VarC4 = it1.c(jt1Var3, ox6VarC3);
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar2);
                                } else {
                                    jt1Var3.z();
                                }
                                rd7.d(jt1Var3, cVar, ny8VarA2);
                                rd7.d(jt1Var3, eVar, kw7VarY3);
                                g3.c(iHashCode3, jt1Var3, bVar, jt1Var3, c0034a);
                                rd7.d(jt1Var3, dVar, ox6VarC4);
                                String title = conversation2.getTitle();
                                ox6 ox6VarA2 = py8Var.a(aVar, 1.0f, true);
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                int i14 = IntercomTheme.$stable;
                                mia.b(title, ox6VarA2, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var3, i14).getType04(), 0L, 0L, conversation2.isRead() ? ob4.y : ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var2, 0, 24960, 110588);
                                String str = TimeFormatterExtKt.formattedDateFromLong(conversation2.lastPart().getCreatedAt(), context);
                                jt1Var2.K(433245310);
                                if (str.length() > 0) {
                                    mia.b(str, eo7.m(aVar, 8.0f, 0.0f, 0.0f, 0.0f, 14), intercomTheme.getColors(jt1Var2, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i14).getType04(), jt1Var2, 48, 0, 131064);
                                    jt1Var3 = jt1Var2;
                                } else {
                                    jt1Var3 = jt1Var2;
                                }
                                jt1Var3.B();
                                jt1Var3.I();
                                String summary = conversation2.lastPart().getSummary();
                                jt1Var3.K(-1283405160);
                                summary.getClass();
                                if (summary.length() > 0) {
                                    jt1Var3.K(-1283403261);
                                    if (conversation2.lastPart().getParticipant().isUserWithId(ConversationItemKt.getUserIntercomId())) {
                                        strA = nr1.f(jt1Var3, R.string.intercom_you) + ": " + summary;
                                    } else {
                                        String firstName = conversation2.lastParticipatingAdmin().getFirstName();
                                        if (firstName.length() == 0) {
                                            firstName = ConversationItemKt.getWorkspaceName();
                                        }
                                        strA = cj2.a(firstName, ": ", summary);
                                    }
                                    jt1Var3.B();
                                    mia.b(strA, null, intercomTheme.getColors(jt1Var3, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var3, i14).getType04(), 0L, 0L, conversation2.isRead() ? ob4.y : ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var2, 0, 24960, 110586);
                                    jt1Var3 = jt1Var2;
                                }
                                jt1Var3.B();
                                jt1Var3.I();
                                if (z5) {
                                    ConversationItemKt.UnreadIndicator(null, jt1Var3, 0, 1);
                                }
                                jt1Var3.B();
                            }
                            jt1Var3.I();
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), bj4Var, 12582912, 126);
                    ox6 ox6Var10 = ox6Var3;
                    currentlyTypingState4 = currentlyTypingState3;
                    ox6Var4 = ox6Var10;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: c22
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ConversationItemKt.ConversationItem$lambda$2(conversation, ox6Var4, currentlyTypingState4, go7Var2, z3, mh4Var, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            ko7Var = go7Var;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    z2 = z;
                    if (bj4VarO.c(z2)) {
                    }
                    i3 |= i12;
                } else {
                    z2 = z;
                }
                i3 |= i12;
            } else {
                z2 = z;
            }
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (bj4VarO.j(mh4Var)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if ((74899 & i3) == 74898) {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        currentlyTypingState2 = null;
                    }
                    if (i6 != 0) {
                        ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        CurrentlyTypingState currentlyTypingState114 = currentlyTypingState2;
                        i9 = i3 & (-57345);
                        currentlyTypingState3 = currentlyTypingState114;
                        z3 = !conversation.isRead();
                        go7Var2 = ko7Var;
                    } else {
                        CurrentlyTypingState currentlyTypingState115 = currentlyTypingState2;
                        i9 = i3;
                        currentlyTypingState3 = currentlyTypingState115;
                        go7Var2 = ko7Var;
                        z3 = z2;
                    }
                } else {
                    if (i11 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        currentlyTypingState2 = null;
                    }
                    if (i6 != 0) {
                        ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        CurrentlyTypingState currentlyTypingState116 = currentlyTypingState2;
                        i9 = i3 & (-57345);
                        currentlyTypingState3 = currentlyTypingState116;
                        z3 = !conversation.isRead();
                        go7Var2 = ko7Var;
                    } else {
                        CurrentlyTypingState currentlyTypingState117 = currentlyTypingState2;
                        i9 = i3;
                        currentlyTypingState3 = currentlyTypingState117;
                        go7Var2 = ko7Var;
                        z3 = z2;
                    }
                }
                bj4VarO.V();
                bj4VarO.K(-437489840);
                i10 = 0;
                if ((i9 & 458752) == 131072) {
                }
                objF = bj4VarO.f();
                if (z4) {
                    objF = new b22(i10, mh4Var);
                    bj4VarO.C(objF);
                } else {
                    objF = new b22(i10, mh4Var);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                bj4Var = bj4VarO;
                v5a.a(we1.c(ox6Var3, false, null, (mh4) objF, 15), null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(774321672, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.ConversationItemKt.ConversationItem.2
                    public final void invoke(jt1 jt1Var2, int i13) {
                        List listH;
                        bt1.a.b bVar;
                        bt1.a.d dVar;
                        bt1.a.C0034a c0034a;
                        String strA;
                        jt1 jt1Var3 = jt1Var2;
                        if ((i13 & 3) == 2 && jt1Var3.r()) {
                            jt1Var3.u();
                            return;
                        }
                        go7 go7Var3 = go7Var2;
                        ox6.a aVar = ox6.a.t;
                        ox6 ox6VarH = eo7.h(aVar, go7Var3);
                        CurrentlyTypingState currentlyTypingState118 = currentlyTypingState3;
                        Conversation conversation2 = conversation;
                        boolean z5 = z3;
                        c30.j jVar = c30.a;
                        sp0.b bVar2 = di.a.k;
                        ny8 ny8VarA = ly8.a(jVar, bVar2, jt1Var3, 48);
                        int iHashCode = Long.hashCode(jt1Var3.v());
                        kw7 kw7VarY = jt1Var3.y();
                        ox6 ox6VarC = it1.c(jt1Var3, ox6VarH);
                        bt1.c.getClass();
                        qr5.a aVar2 = bt1.a.b;
                        if (jt1Var3.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var3.q();
                        if (jt1Var3.l()) {
                            jt1Var3.k(aVar2);
                        } else {
                            jt1Var3.z();
                        }
                        bt1.a.c cVar = bt1.a.f;
                        rd7.d(jt1Var3, cVar, ny8VarA);
                        bt1.a.e eVar = bt1.a.e;
                        rd7.d(jt1Var3, eVar, kw7VarY);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        bt1.a.b bVar3 = bt1.a.g;
                        rd7.d(jt1Var3, bVar3, numValueOf);
                        bt1.a.C0034a c0034a2 = bt1.a.h;
                        rd7.c(jt1Var3, c0034a2);
                        bt1.a.d dVar2 = bt1.a.d;
                        rd7.d(jt1Var3, dVar2, ox6VarC);
                        jt1Var3.K(1766961464);
                        if (currentlyTypingState118 == null || currentlyTypingState118.getShowAvatar()) {
                            if (currentlyTypingState118 != null) {
                                listH = ws0.h(currentlyTypingState118.getAvatarWrapper());
                            } else if (LastParticipatingAdmin.isNull(conversation2.lastParticipatingAdmin())) {
                                listH = ConversationItemKt.getActiveAdminsAvatars();
                            } else {
                                Avatar avatar = conversation2.lastParticipatingAdmin().getAvatar();
                                avatar.getClass();
                                listH = ws0.h(new AvatarWrapper(avatar, conversation2.lastParticipatingAdmin().isBot()));
                            }
                            bVar = bVar3;
                            dVar = dVar2;
                            c0034a = c0034a2;
                            AvatarTriangleGroupKt.m20AvatarTriangleGroupjt2gSs(listH, new beb(), null, 32.0f, jt1Var3, 3072, 4);
                            b47.b(jt1Var3, ir9.n(aVar, 12.0f));
                        } else {
                            c0034a = c0034a2;
                            bVar = bVar3;
                            dVar = dVar2;
                        }
                        jt1Var3.B();
                        py8 py8Var = py8.a;
                        if (currentlyTypingState118 != null) {
                            jt1Var3.K(-1057866277);
                            TypingIndicatorKt.AnimatedTypingDots(ir9.b(py8Var.a(aVar, 2.0f, true), 0.0f, 38.0f, 1), jt1Var3, 0, 0);
                            jt1Var3.B();
                        } else {
                            jt1Var3.K(-1057575373);
                            Context context = (Context) jt1Var3.F(AndroidCompositionLocals_androidKt.b);
                            ox6 ox6VarA = py8Var.a(aVar, 2.0f, true);
                            aj1 aj1VarA = yi1.a(new c30.h(2.0f, true, new a30()), di.a.m, jt1Var3, 6);
                            int iHashCode2 = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY2 = jt1Var3.y();
                            ox6 ox6VarC2 = it1.c(jt1Var3, ox6VarA);
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar2);
                            } else {
                                jt1Var3.z();
                            }
                            rd7.d(jt1Var3, cVar, aj1VarA);
                            rd7.d(jt1Var3, eVar, kw7VarY2);
                            g3.c(iHashCode2, jt1Var3, bVar, jt1Var3, c0034a);
                            rd7.d(jt1Var3, dVar, ox6VarC2);
                            ox6 ox6VarC3 = ir9.c(aVar, 1.0f);
                            ny8 ny8VarA2 = ly8.a(jVar, bVar2, jt1Var3, 48);
                            int iHashCode3 = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY3 = jt1Var3.y();
                            ox6 ox6VarC4 = it1.c(jt1Var3, ox6VarC3);
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar2);
                            } else {
                                jt1Var3.z();
                            }
                            rd7.d(jt1Var3, cVar, ny8VarA2);
                            rd7.d(jt1Var3, eVar, kw7VarY3);
                            g3.c(iHashCode3, jt1Var3, bVar, jt1Var3, c0034a);
                            rd7.d(jt1Var3, dVar, ox6VarC4);
                            String title = conversation2.getTitle();
                            ox6 ox6VarA2 = py8Var.a(aVar, 1.0f, true);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i14 = IntercomTheme.$stable;
                            mia.b(title, ox6VarA2, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var3, i14).getType04(), 0L, 0L, conversation2.isRead() ? ob4.y : ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var2, 0, 24960, 110588);
                            String str = TimeFormatterExtKt.formattedDateFromLong(conversation2.lastPart().getCreatedAt(), context);
                            jt1Var2.K(433245310);
                            if (str.length() > 0) {
                                mia.b(str, eo7.m(aVar, 8.0f, 0.0f, 0.0f, 0.0f, 14), intercomTheme.getColors(jt1Var2, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i14).getType04(), jt1Var2, 48, 0, 131064);
                                jt1Var3 = jt1Var2;
                            } else {
                                jt1Var3 = jt1Var2;
                            }
                            jt1Var3.B();
                            jt1Var3.I();
                            String summary = conversation2.lastPart().getSummary();
                            jt1Var3.K(-1283405160);
                            summary.getClass();
                            if (summary.length() > 0) {
                                jt1Var3.K(-1283403261);
                                if (conversation2.lastPart().getParticipant().isUserWithId(ConversationItemKt.getUserIntercomId())) {
                                    strA = nr1.f(jt1Var3, R.string.intercom_you) + ": " + summary;
                                } else {
                                    String firstName = conversation2.lastParticipatingAdmin().getFirstName();
                                    if (firstName.length() == 0) {
                                        firstName = ConversationItemKt.getWorkspaceName();
                                    }
                                    strA = cj2.a(firstName, ": ", summary);
                                }
                                jt1Var3.B();
                                mia.b(strA, null, intercomTheme.getColors(jt1Var3, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var3, i14).getType04(), 0L, 0L, conversation2.isRead() ? ob4.y : ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var2, 0, 24960, 110586);
                                jt1Var3 = jt1Var2;
                            }
                            jt1Var3.B();
                            jt1Var3.I();
                            if (z5) {
                                ConversationItemKt.UnreadIndicator(null, jt1Var3, 0, 1);
                            }
                            jt1Var3.B();
                        }
                        jt1Var3.I();
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4Var, 12582912, 126);
                ox6 ox6Var11 = ox6Var3;
                currentlyTypingState4 = currentlyTypingState3;
                ox6Var4 = ox6Var11;
            } else {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        currentlyTypingState2 = null;
                    }
                    if (i6 != 0) {
                        ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        CurrentlyTypingState currentlyTypingState118 = currentlyTypingState2;
                        i9 = i3 & (-57345);
                        currentlyTypingState3 = currentlyTypingState118;
                        z3 = !conversation.isRead();
                        go7Var2 = ko7Var;
                    } else {
                        CurrentlyTypingState currentlyTypingState119 = currentlyTypingState2;
                        i9 = i3;
                        currentlyTypingState3 = currentlyTypingState119;
                        go7Var2 = ko7Var;
                        z3 = z2;
                    }
                } else {
                    if (i11 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        currentlyTypingState2 = null;
                    }
                    if (i6 != 0) {
                        ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        CurrentlyTypingState currentlyTypingState1110 = currentlyTypingState2;
                        i9 = i3 & (-57345);
                        currentlyTypingState3 = currentlyTypingState1110;
                        z3 = !conversation.isRead();
                        go7Var2 = ko7Var;
                    } else {
                        CurrentlyTypingState currentlyTypingState1111 = currentlyTypingState2;
                        i9 = i3;
                        currentlyTypingState3 = currentlyTypingState1111;
                        go7Var2 = ko7Var;
                        z3 = z2;
                    }
                }
                bj4VarO.V();
                bj4VarO.K(-437489840);
                i10 = 0;
                if ((i9 & 458752) == 131072) {
                }
                objF = bj4VarO.f();
                if (z4) {
                    objF = new b22(i10, mh4Var);
                    bj4VarO.C(objF);
                } else {
                    objF = new b22(i10, mh4Var);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                bj4Var = bj4VarO;
                v5a.a(we1.c(ox6Var3, false, null, (mh4) objF, 15), null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(774321672, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.ConversationItemKt.ConversationItem.2
                    public final void invoke(jt1 jt1Var2, int i13) {
                        List listH;
                        bt1.a.b bVar;
                        bt1.a.d dVar;
                        bt1.a.C0034a c0034a;
                        String strA;
                        jt1 jt1Var3 = jt1Var2;
                        if ((i13 & 3) == 2 && jt1Var3.r()) {
                            jt1Var3.u();
                            return;
                        }
                        go7 go7Var3 = go7Var2;
                        ox6.a aVar = ox6.a.t;
                        ox6 ox6VarH = eo7.h(aVar, go7Var3);
                        CurrentlyTypingState currentlyTypingState1112 = currentlyTypingState3;
                        Conversation conversation2 = conversation;
                        boolean z5 = z3;
                        c30.j jVar = c30.a;
                        sp0.b bVar2 = di.a.k;
                        ny8 ny8VarA = ly8.a(jVar, bVar2, jt1Var3, 48);
                        int iHashCode = Long.hashCode(jt1Var3.v());
                        kw7 kw7VarY = jt1Var3.y();
                        ox6 ox6VarC = it1.c(jt1Var3, ox6VarH);
                        bt1.c.getClass();
                        qr5.a aVar2 = bt1.a.b;
                        if (jt1Var3.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var3.q();
                        if (jt1Var3.l()) {
                            jt1Var3.k(aVar2);
                        } else {
                            jt1Var3.z();
                        }
                        bt1.a.c cVar = bt1.a.f;
                        rd7.d(jt1Var3, cVar, ny8VarA);
                        bt1.a.e eVar = bt1.a.e;
                        rd7.d(jt1Var3, eVar, kw7VarY);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        bt1.a.b bVar3 = bt1.a.g;
                        rd7.d(jt1Var3, bVar3, numValueOf);
                        bt1.a.C0034a c0034a2 = bt1.a.h;
                        rd7.c(jt1Var3, c0034a2);
                        bt1.a.d dVar2 = bt1.a.d;
                        rd7.d(jt1Var3, dVar2, ox6VarC);
                        jt1Var3.K(1766961464);
                        if (currentlyTypingState1112 == null || currentlyTypingState1112.getShowAvatar()) {
                            if (currentlyTypingState1112 != null) {
                                listH = ws0.h(currentlyTypingState1112.getAvatarWrapper());
                            } else if (LastParticipatingAdmin.isNull(conversation2.lastParticipatingAdmin())) {
                                listH = ConversationItemKt.getActiveAdminsAvatars();
                            } else {
                                Avatar avatar = conversation2.lastParticipatingAdmin().getAvatar();
                                avatar.getClass();
                                listH = ws0.h(new AvatarWrapper(avatar, conversation2.lastParticipatingAdmin().isBot()));
                            }
                            bVar = bVar3;
                            dVar = dVar2;
                            c0034a = c0034a2;
                            AvatarTriangleGroupKt.m20AvatarTriangleGroupjt2gSs(listH, new beb(), null, 32.0f, jt1Var3, 3072, 4);
                            b47.b(jt1Var3, ir9.n(aVar, 12.0f));
                        } else {
                            c0034a = c0034a2;
                            bVar = bVar3;
                            dVar = dVar2;
                        }
                        jt1Var3.B();
                        py8 py8Var = py8.a;
                        if (currentlyTypingState1112 != null) {
                            jt1Var3.K(-1057866277);
                            TypingIndicatorKt.AnimatedTypingDots(ir9.b(py8Var.a(aVar, 2.0f, true), 0.0f, 38.0f, 1), jt1Var3, 0, 0);
                            jt1Var3.B();
                        } else {
                            jt1Var3.K(-1057575373);
                            Context context = (Context) jt1Var3.F(AndroidCompositionLocals_androidKt.b);
                            ox6 ox6VarA = py8Var.a(aVar, 2.0f, true);
                            aj1 aj1VarA = yi1.a(new c30.h(2.0f, true, new a30()), di.a.m, jt1Var3, 6);
                            int iHashCode2 = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY2 = jt1Var3.y();
                            ox6 ox6VarC2 = it1.c(jt1Var3, ox6VarA);
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar2);
                            } else {
                                jt1Var3.z();
                            }
                            rd7.d(jt1Var3, cVar, aj1VarA);
                            rd7.d(jt1Var3, eVar, kw7VarY2);
                            g3.c(iHashCode2, jt1Var3, bVar, jt1Var3, c0034a);
                            rd7.d(jt1Var3, dVar, ox6VarC2);
                            ox6 ox6VarC3 = ir9.c(aVar, 1.0f);
                            ny8 ny8VarA2 = ly8.a(jVar, bVar2, jt1Var3, 48);
                            int iHashCode3 = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY3 = jt1Var3.y();
                            ox6 ox6VarC4 = it1.c(jt1Var3, ox6VarC3);
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar2);
                            } else {
                                jt1Var3.z();
                            }
                            rd7.d(jt1Var3, cVar, ny8VarA2);
                            rd7.d(jt1Var3, eVar, kw7VarY3);
                            g3.c(iHashCode3, jt1Var3, bVar, jt1Var3, c0034a);
                            rd7.d(jt1Var3, dVar, ox6VarC4);
                            String title = conversation2.getTitle();
                            ox6 ox6VarA2 = py8Var.a(aVar, 1.0f, true);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i14 = IntercomTheme.$stable;
                            mia.b(title, ox6VarA2, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var3, i14).getType04(), 0L, 0L, conversation2.isRead() ? ob4.y : ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var2, 0, 24960, 110588);
                            String str = TimeFormatterExtKt.formattedDateFromLong(conversation2.lastPart().getCreatedAt(), context);
                            jt1Var2.K(433245310);
                            if (str.length() > 0) {
                                mia.b(str, eo7.m(aVar, 8.0f, 0.0f, 0.0f, 0.0f, 14), intercomTheme.getColors(jt1Var2, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i14).getType04(), jt1Var2, 48, 0, 131064);
                                jt1Var3 = jt1Var2;
                            } else {
                                jt1Var3 = jt1Var2;
                            }
                            jt1Var3.B();
                            jt1Var3.I();
                            String summary = conversation2.lastPart().getSummary();
                            jt1Var3.K(-1283405160);
                            summary.getClass();
                            if (summary.length() > 0) {
                                jt1Var3.K(-1283403261);
                                if (conversation2.lastPart().getParticipant().isUserWithId(ConversationItemKt.getUserIntercomId())) {
                                    strA = nr1.f(jt1Var3, R.string.intercom_you) + ": " + summary;
                                } else {
                                    String firstName = conversation2.lastParticipatingAdmin().getFirstName();
                                    if (firstName.length() == 0) {
                                        firstName = ConversationItemKt.getWorkspaceName();
                                    }
                                    strA = cj2.a(firstName, ": ", summary);
                                }
                                jt1Var3.B();
                                mia.b(strA, null, intercomTheme.getColors(jt1Var3, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var3, i14).getType04(), 0L, 0L, conversation2.isRead() ? ob4.y : ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var2, 0, 24960, 110586);
                                jt1Var3 = jt1Var2;
                            }
                            jt1Var3.B();
                            jt1Var3.I();
                            if (z5) {
                                ConversationItemKt.UnreadIndicator(null, jt1Var3, 0, 1);
                            }
                            jt1Var3.B();
                        }
                        jt1Var3.I();
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4Var, 12582912, 126);
                ox6 ox6Var12 = ox6Var3;
                currentlyTypingState4 = currentlyTypingState3;
                ox6Var4 = ox6Var12;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: c22
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ConversationItemKt.ConversationItem$lambda$2(conversation, ox6Var4, currentlyTypingState4, go7Var2, z3, mh4Var, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 48;
        ox6Var2 = ox6Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                currentlyTypingState2 = currentlyTypingState;
                if (bj4VarO.j(currentlyTypingState2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    ko7Var = go7Var;
                    if (bj4VarO.J(ko7Var)) {
                        i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        z2 = z;
                        if (bj4VarO.c(z2)) {
                        }
                        i3 |= i12;
                    } else {
                        z2 = z;
                    }
                    i3 |= i12;
                } else {
                    z2 = z;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (bj4VarO.j(mh4Var)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                }
                if ((74899 & i3) == 74898) {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            currentlyTypingState2 = null;
                        }
                        if (i6 != 0) {
                            ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            CurrentlyTypingState currentlyTypingState1112 = currentlyTypingState2;
                            i9 = i3 & (-57345);
                            currentlyTypingState3 = currentlyTypingState1112;
                            z3 = !conversation.isRead();
                            go7Var2 = ko7Var;
                        } else {
                            CurrentlyTypingState currentlyTypingState1113 = currentlyTypingState2;
                            i9 = i3;
                            currentlyTypingState3 = currentlyTypingState1113;
                            go7Var2 = ko7Var;
                            z3 = z2;
                        }
                    } else {
                        if (i11 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            currentlyTypingState2 = null;
                        }
                        if (i6 != 0) {
                            ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            CurrentlyTypingState currentlyTypingState1114 = currentlyTypingState2;
                            i9 = i3 & (-57345);
                            currentlyTypingState3 = currentlyTypingState1114;
                            z3 = !conversation.isRead();
                            go7Var2 = ko7Var;
                        } else {
                            CurrentlyTypingState currentlyTypingState1115 = currentlyTypingState2;
                            i9 = i3;
                            currentlyTypingState3 = currentlyTypingState1115;
                            go7Var2 = ko7Var;
                            z3 = z2;
                        }
                    }
                    bj4VarO.V();
                    bj4VarO.K(-437489840);
                    i10 = 0;
                    if ((i9 & 458752) == 131072) {
                    }
                    objF = bj4VarO.f();
                    if (z4) {
                        objF = new b22(i10, mh4Var);
                        bj4VarO.C(objF);
                    } else {
                        objF = new b22(i10, mh4Var);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    bj4Var = bj4VarO;
                    v5a.a(we1.c(ox6Var3, false, null, (mh4) objF, 15), null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(774321672, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.ConversationItemKt.ConversationItem.2
                        public final void invoke(jt1 jt1Var2, int i13) {
                            List listH;
                            bt1.a.b bVar;
                            bt1.a.d dVar;
                            bt1.a.C0034a c0034a;
                            String strA;
                            jt1 jt1Var3 = jt1Var2;
                            if ((i13 & 3) == 2 && jt1Var3.r()) {
                                jt1Var3.u();
                                return;
                            }
                            go7 go7Var3 = go7Var2;
                            ox6.a aVar = ox6.a.t;
                            ox6 ox6VarH = eo7.h(aVar, go7Var3);
                            CurrentlyTypingState currentlyTypingState1116 = currentlyTypingState3;
                            Conversation conversation2 = conversation;
                            boolean z5 = z3;
                            c30.j jVar = c30.a;
                            sp0.b bVar2 = di.a.k;
                            ny8 ny8VarA = ly8.a(jVar, bVar2, jt1Var3, 48);
                            int iHashCode = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY = jt1Var3.y();
                            ox6 ox6VarC = it1.c(jt1Var3, ox6VarH);
                            bt1.c.getClass();
                            qr5.a aVar2 = bt1.a.b;
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar2);
                            } else {
                                jt1Var3.z();
                            }
                            bt1.a.c cVar = bt1.a.f;
                            rd7.d(jt1Var3, cVar, ny8VarA);
                            bt1.a.e eVar = bt1.a.e;
                            rd7.d(jt1Var3, eVar, kw7VarY);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            bt1.a.b bVar3 = bt1.a.g;
                            rd7.d(jt1Var3, bVar3, numValueOf);
                            bt1.a.C0034a c0034a2 = bt1.a.h;
                            rd7.c(jt1Var3, c0034a2);
                            bt1.a.d dVar2 = bt1.a.d;
                            rd7.d(jt1Var3, dVar2, ox6VarC);
                            jt1Var3.K(1766961464);
                            if (currentlyTypingState1116 == null || currentlyTypingState1116.getShowAvatar()) {
                                if (currentlyTypingState1116 != null) {
                                    listH = ws0.h(currentlyTypingState1116.getAvatarWrapper());
                                } else if (LastParticipatingAdmin.isNull(conversation2.lastParticipatingAdmin())) {
                                    listH = ConversationItemKt.getActiveAdminsAvatars();
                                } else {
                                    Avatar avatar = conversation2.lastParticipatingAdmin().getAvatar();
                                    avatar.getClass();
                                    listH = ws0.h(new AvatarWrapper(avatar, conversation2.lastParticipatingAdmin().isBot()));
                                }
                                bVar = bVar3;
                                dVar = dVar2;
                                c0034a = c0034a2;
                                AvatarTriangleGroupKt.m20AvatarTriangleGroupjt2gSs(listH, new beb(), null, 32.0f, jt1Var3, 3072, 4);
                                b47.b(jt1Var3, ir9.n(aVar, 12.0f));
                            } else {
                                c0034a = c0034a2;
                                bVar = bVar3;
                                dVar = dVar2;
                            }
                            jt1Var3.B();
                            py8 py8Var = py8.a;
                            if (currentlyTypingState1116 != null) {
                                jt1Var3.K(-1057866277);
                                TypingIndicatorKt.AnimatedTypingDots(ir9.b(py8Var.a(aVar, 2.0f, true), 0.0f, 38.0f, 1), jt1Var3, 0, 0);
                                jt1Var3.B();
                            } else {
                                jt1Var3.K(-1057575373);
                                Context context = (Context) jt1Var3.F(AndroidCompositionLocals_androidKt.b);
                                ox6 ox6VarA = py8Var.a(aVar, 2.0f, true);
                                aj1 aj1VarA = yi1.a(new c30.h(2.0f, true, new a30()), di.a.m, jt1Var3, 6);
                                int iHashCode2 = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY2 = jt1Var3.y();
                                ox6 ox6VarC2 = it1.c(jt1Var3, ox6VarA);
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar2);
                                } else {
                                    jt1Var3.z();
                                }
                                rd7.d(jt1Var3, cVar, aj1VarA);
                                rd7.d(jt1Var3, eVar, kw7VarY2);
                                g3.c(iHashCode2, jt1Var3, bVar, jt1Var3, c0034a);
                                rd7.d(jt1Var3, dVar, ox6VarC2);
                                ox6 ox6VarC3 = ir9.c(aVar, 1.0f);
                                ny8 ny8VarA2 = ly8.a(jVar, bVar2, jt1Var3, 48);
                                int iHashCode3 = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY3 = jt1Var3.y();
                                ox6 ox6VarC4 = it1.c(jt1Var3, ox6VarC3);
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar2);
                                } else {
                                    jt1Var3.z();
                                }
                                rd7.d(jt1Var3, cVar, ny8VarA2);
                                rd7.d(jt1Var3, eVar, kw7VarY3);
                                g3.c(iHashCode3, jt1Var3, bVar, jt1Var3, c0034a);
                                rd7.d(jt1Var3, dVar, ox6VarC4);
                                String title = conversation2.getTitle();
                                ox6 ox6VarA2 = py8Var.a(aVar, 1.0f, true);
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                int i14 = IntercomTheme.$stable;
                                mia.b(title, ox6VarA2, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var3, i14).getType04(), 0L, 0L, conversation2.isRead() ? ob4.y : ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var2, 0, 24960, 110588);
                                String str = TimeFormatterExtKt.formattedDateFromLong(conversation2.lastPart().getCreatedAt(), context);
                                jt1Var2.K(433245310);
                                if (str.length() > 0) {
                                    mia.b(str, eo7.m(aVar, 8.0f, 0.0f, 0.0f, 0.0f, 14), intercomTheme.getColors(jt1Var2, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i14).getType04(), jt1Var2, 48, 0, 131064);
                                    jt1Var3 = jt1Var2;
                                } else {
                                    jt1Var3 = jt1Var2;
                                }
                                jt1Var3.B();
                                jt1Var3.I();
                                String summary = conversation2.lastPart().getSummary();
                                jt1Var3.K(-1283405160);
                                summary.getClass();
                                if (summary.length() > 0) {
                                    jt1Var3.K(-1283403261);
                                    if (conversation2.lastPart().getParticipant().isUserWithId(ConversationItemKt.getUserIntercomId())) {
                                        strA = nr1.f(jt1Var3, R.string.intercom_you) + ": " + summary;
                                    } else {
                                        String firstName = conversation2.lastParticipatingAdmin().getFirstName();
                                        if (firstName.length() == 0) {
                                            firstName = ConversationItemKt.getWorkspaceName();
                                        }
                                        strA = cj2.a(firstName, ": ", summary);
                                    }
                                    jt1Var3.B();
                                    mia.b(strA, null, intercomTheme.getColors(jt1Var3, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var3, i14).getType04(), 0L, 0L, conversation2.isRead() ? ob4.y : ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var2, 0, 24960, 110586);
                                    jt1Var3 = jt1Var2;
                                }
                                jt1Var3.B();
                                jt1Var3.I();
                                if (z5) {
                                    ConversationItemKt.UnreadIndicator(null, jt1Var3, 0, 1);
                                }
                                jt1Var3.B();
                            }
                            jt1Var3.I();
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), bj4Var, 12582912, 126);
                    ox6 ox6Var13 = ox6Var3;
                    currentlyTypingState4 = currentlyTypingState3;
                    ox6Var4 = ox6Var13;
                } else {
                    bj4VarO.v0();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            currentlyTypingState2 = null;
                        }
                        if (i6 != 0) {
                            ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            CurrentlyTypingState currentlyTypingState1116 = currentlyTypingState2;
                            i9 = i3 & (-57345);
                            currentlyTypingState3 = currentlyTypingState1116;
                            z3 = !conversation.isRead();
                            go7Var2 = ko7Var;
                        } else {
                            CurrentlyTypingState currentlyTypingState1117 = currentlyTypingState2;
                            i9 = i3;
                            currentlyTypingState3 = currentlyTypingState1117;
                            go7Var2 = ko7Var;
                            z3 = z2;
                        }
                    } else {
                        if (i11 != 0) {
                            ox6Var3 = ox6.a.t;
                        } else {
                            ox6Var3 = ox6Var2;
                        }
                        if (i4 != 0) {
                            currentlyTypingState2 = null;
                        }
                        if (i6 != 0) {
                            ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        if ((i2 & 16) != 0) {
                            CurrentlyTypingState currentlyTypingState1118 = currentlyTypingState2;
                            i9 = i3 & (-57345);
                            currentlyTypingState3 = currentlyTypingState1118;
                            z3 = !conversation.isRead();
                            go7Var2 = ko7Var;
                        } else {
                            CurrentlyTypingState currentlyTypingState1119 = currentlyTypingState2;
                            i9 = i3;
                            currentlyTypingState3 = currentlyTypingState1119;
                            go7Var2 = ko7Var;
                            z3 = z2;
                        }
                    }
                    bj4VarO.V();
                    bj4VarO.K(-437489840);
                    i10 = 0;
                    if ((i9 & 458752) == 131072) {
                    }
                    objF = bj4VarO.f();
                    if (z4) {
                        objF = new b22(i10, mh4Var);
                        bj4VarO.C(objF);
                    } else {
                        objF = new b22(i10, mh4Var);
                        bj4VarO.C(objF);
                    }
                    bj4VarO.U(false);
                    bj4Var = bj4VarO;
                    v5a.a(we1.c(ox6Var3, false, null, (mh4) objF, 15), null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(774321672, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.ConversationItemKt.ConversationItem.2
                        public final void invoke(jt1 jt1Var2, int i13) {
                            List listH;
                            bt1.a.b bVar;
                            bt1.a.d dVar;
                            bt1.a.C0034a c0034a;
                            String strA;
                            jt1 jt1Var3 = jt1Var2;
                            if ((i13 & 3) == 2 && jt1Var3.r()) {
                                jt1Var3.u();
                                return;
                            }
                            go7 go7Var3 = go7Var2;
                            ox6.a aVar = ox6.a.t;
                            ox6 ox6VarH = eo7.h(aVar, go7Var3);
                            CurrentlyTypingState currentlyTypingState11110 = currentlyTypingState3;
                            Conversation conversation2 = conversation;
                            boolean z5 = z3;
                            c30.j jVar = c30.a;
                            sp0.b bVar2 = di.a.k;
                            ny8 ny8VarA = ly8.a(jVar, bVar2, jt1Var3, 48);
                            int iHashCode = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY = jt1Var3.y();
                            ox6 ox6VarC = it1.c(jt1Var3, ox6VarH);
                            bt1.c.getClass();
                            qr5.a aVar2 = bt1.a.b;
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar2);
                            } else {
                                jt1Var3.z();
                            }
                            bt1.a.c cVar = bt1.a.f;
                            rd7.d(jt1Var3, cVar, ny8VarA);
                            bt1.a.e eVar = bt1.a.e;
                            rd7.d(jt1Var3, eVar, kw7VarY);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            bt1.a.b bVar3 = bt1.a.g;
                            rd7.d(jt1Var3, bVar3, numValueOf);
                            bt1.a.C0034a c0034a2 = bt1.a.h;
                            rd7.c(jt1Var3, c0034a2);
                            bt1.a.d dVar2 = bt1.a.d;
                            rd7.d(jt1Var3, dVar2, ox6VarC);
                            jt1Var3.K(1766961464);
                            if (currentlyTypingState11110 == null || currentlyTypingState11110.getShowAvatar()) {
                                if (currentlyTypingState11110 != null) {
                                    listH = ws0.h(currentlyTypingState11110.getAvatarWrapper());
                                } else if (LastParticipatingAdmin.isNull(conversation2.lastParticipatingAdmin())) {
                                    listH = ConversationItemKt.getActiveAdminsAvatars();
                                } else {
                                    Avatar avatar = conversation2.lastParticipatingAdmin().getAvatar();
                                    avatar.getClass();
                                    listH = ws0.h(new AvatarWrapper(avatar, conversation2.lastParticipatingAdmin().isBot()));
                                }
                                bVar = bVar3;
                                dVar = dVar2;
                                c0034a = c0034a2;
                                AvatarTriangleGroupKt.m20AvatarTriangleGroupjt2gSs(listH, new beb(), null, 32.0f, jt1Var3, 3072, 4);
                                b47.b(jt1Var3, ir9.n(aVar, 12.0f));
                            } else {
                                c0034a = c0034a2;
                                bVar = bVar3;
                                dVar = dVar2;
                            }
                            jt1Var3.B();
                            py8 py8Var = py8.a;
                            if (currentlyTypingState11110 != null) {
                                jt1Var3.K(-1057866277);
                                TypingIndicatorKt.AnimatedTypingDots(ir9.b(py8Var.a(aVar, 2.0f, true), 0.0f, 38.0f, 1), jt1Var3, 0, 0);
                                jt1Var3.B();
                            } else {
                                jt1Var3.K(-1057575373);
                                Context context = (Context) jt1Var3.F(AndroidCompositionLocals_androidKt.b);
                                ox6 ox6VarA = py8Var.a(aVar, 2.0f, true);
                                aj1 aj1VarA = yi1.a(new c30.h(2.0f, true, new a30()), di.a.m, jt1Var3, 6);
                                int iHashCode2 = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY2 = jt1Var3.y();
                                ox6 ox6VarC2 = it1.c(jt1Var3, ox6VarA);
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar2);
                                } else {
                                    jt1Var3.z();
                                }
                                rd7.d(jt1Var3, cVar, aj1VarA);
                                rd7.d(jt1Var3, eVar, kw7VarY2);
                                g3.c(iHashCode2, jt1Var3, bVar, jt1Var3, c0034a);
                                rd7.d(jt1Var3, dVar, ox6VarC2);
                                ox6 ox6VarC3 = ir9.c(aVar, 1.0f);
                                ny8 ny8VarA2 = ly8.a(jVar, bVar2, jt1Var3, 48);
                                int iHashCode3 = Long.hashCode(jt1Var3.v());
                                kw7 kw7VarY3 = jt1Var3.y();
                                ox6 ox6VarC4 = it1.c(jt1Var3, ox6VarC3);
                                if (jt1Var3.s() == null) {
                                    ml5.c();
                                    throw null;
                                }
                                jt1Var3.q();
                                if (jt1Var3.l()) {
                                    jt1Var3.k(aVar2);
                                } else {
                                    jt1Var3.z();
                                }
                                rd7.d(jt1Var3, cVar, ny8VarA2);
                                rd7.d(jt1Var3, eVar, kw7VarY3);
                                g3.c(iHashCode3, jt1Var3, bVar, jt1Var3, c0034a);
                                rd7.d(jt1Var3, dVar, ox6VarC4);
                                String title = conversation2.getTitle();
                                ox6 ox6VarA2 = py8Var.a(aVar, 1.0f, true);
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                int i14 = IntercomTheme.$stable;
                                mia.b(title, ox6VarA2, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var3, i14).getType04(), 0L, 0L, conversation2.isRead() ? ob4.y : ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var2, 0, 24960, 110588);
                                String str = TimeFormatterExtKt.formattedDateFromLong(conversation2.lastPart().getCreatedAt(), context);
                                jt1Var2.K(433245310);
                                if (str.length() > 0) {
                                    mia.b(str, eo7.m(aVar, 8.0f, 0.0f, 0.0f, 0.0f, 14), intercomTheme.getColors(jt1Var2, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i14).getType04(), jt1Var2, 48, 0, 131064);
                                    jt1Var3 = jt1Var2;
                                } else {
                                    jt1Var3 = jt1Var2;
                                }
                                jt1Var3.B();
                                jt1Var3.I();
                                String summary = conversation2.lastPart().getSummary();
                                jt1Var3.K(-1283405160);
                                summary.getClass();
                                if (summary.length() > 0) {
                                    jt1Var3.K(-1283403261);
                                    if (conversation2.lastPart().getParticipant().isUserWithId(ConversationItemKt.getUserIntercomId())) {
                                        strA = nr1.f(jt1Var3, R.string.intercom_you) + ": " + summary;
                                    } else {
                                        String firstName = conversation2.lastParticipatingAdmin().getFirstName();
                                        if (firstName.length() == 0) {
                                            firstName = ConversationItemKt.getWorkspaceName();
                                        }
                                        strA = cj2.a(firstName, ": ", summary);
                                    }
                                    jt1Var3.B();
                                    mia.b(strA, null, intercomTheme.getColors(jt1Var3, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var3, i14).getType04(), 0L, 0L, conversation2.isRead() ? ob4.y : ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var2, 0, 24960, 110586);
                                    jt1Var3 = jt1Var2;
                                }
                                jt1Var3.B();
                                jt1Var3.I();
                                if (z5) {
                                    ConversationItemKt.UnreadIndicator(null, jt1Var3, 0, 1);
                                }
                                jt1Var3.B();
                            }
                            jt1Var3.I();
                        }

                        @Override // defpackage.ci4
                        public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                            invoke(jt1Var2, num.intValue());
                            return g2b.a;
                        }
                    }, bj4VarO), bj4Var, 12582912, 126);
                    ox6 ox6Var14 = ox6Var3;
                    currentlyTypingState4 = currentlyTypingState3;
                    ox6Var4 = ox6Var14;
                }
                xj8VarW = bj4Var.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: c22
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ConversationItemKt.ConversationItem$lambda$2(conversation, ox6Var4, currentlyTypingState4, go7Var2, z3, mh4Var, i, i2, (jt1) obj, iIntValue);
                        }
                    };
                }
            }
            i3 |= 3072;
            ko7Var = go7Var;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    z2 = z;
                    if (bj4VarO.c(z2)) {
                    }
                    i3 |= i12;
                } else {
                    z2 = z;
                }
                i3 |= i12;
            } else {
                z2 = z;
            }
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (bj4VarO.j(mh4Var)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if ((74899 & i3) == 74898) {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        currentlyTypingState2 = null;
                    }
                    if (i6 != 0) {
                        ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        CurrentlyTypingState currentlyTypingState11110 = currentlyTypingState2;
                        i9 = i3 & (-57345);
                        currentlyTypingState3 = currentlyTypingState11110;
                        z3 = !conversation.isRead();
                        go7Var2 = ko7Var;
                    } else {
                        CurrentlyTypingState currentlyTypingState11111 = currentlyTypingState2;
                        i9 = i3;
                        currentlyTypingState3 = currentlyTypingState11111;
                        go7Var2 = ko7Var;
                        z3 = z2;
                    }
                } else {
                    if (i11 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        currentlyTypingState2 = null;
                    }
                    if (i6 != 0) {
                        ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        CurrentlyTypingState currentlyTypingState11112 = currentlyTypingState2;
                        i9 = i3 & (-57345);
                        currentlyTypingState3 = currentlyTypingState11112;
                        z3 = !conversation.isRead();
                        go7Var2 = ko7Var;
                    } else {
                        CurrentlyTypingState currentlyTypingState11113 = currentlyTypingState2;
                        i9 = i3;
                        currentlyTypingState3 = currentlyTypingState11113;
                        go7Var2 = ko7Var;
                        z3 = z2;
                    }
                }
                bj4VarO.V();
                bj4VarO.K(-437489840);
                i10 = 0;
                if ((i9 & 458752) == 131072) {
                }
                objF = bj4VarO.f();
                if (z4) {
                    objF = new b22(i10, mh4Var);
                    bj4VarO.C(objF);
                } else {
                    objF = new b22(i10, mh4Var);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                bj4Var = bj4VarO;
                v5a.a(we1.c(ox6Var3, false, null, (mh4) objF, 15), null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(774321672, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.ConversationItemKt.ConversationItem.2
                    public final void invoke(jt1 jt1Var2, int i13) {
                        List listH;
                        bt1.a.b bVar;
                        bt1.a.d dVar;
                        bt1.a.C0034a c0034a;
                        String strA;
                        jt1 jt1Var3 = jt1Var2;
                        if ((i13 & 3) == 2 && jt1Var3.r()) {
                            jt1Var3.u();
                            return;
                        }
                        go7 go7Var3 = go7Var2;
                        ox6.a aVar = ox6.a.t;
                        ox6 ox6VarH = eo7.h(aVar, go7Var3);
                        CurrentlyTypingState currentlyTypingState11114 = currentlyTypingState3;
                        Conversation conversation2 = conversation;
                        boolean z5 = z3;
                        c30.j jVar = c30.a;
                        sp0.b bVar2 = di.a.k;
                        ny8 ny8VarA = ly8.a(jVar, bVar2, jt1Var3, 48);
                        int iHashCode = Long.hashCode(jt1Var3.v());
                        kw7 kw7VarY = jt1Var3.y();
                        ox6 ox6VarC = it1.c(jt1Var3, ox6VarH);
                        bt1.c.getClass();
                        qr5.a aVar2 = bt1.a.b;
                        if (jt1Var3.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var3.q();
                        if (jt1Var3.l()) {
                            jt1Var3.k(aVar2);
                        } else {
                            jt1Var3.z();
                        }
                        bt1.a.c cVar = bt1.a.f;
                        rd7.d(jt1Var3, cVar, ny8VarA);
                        bt1.a.e eVar = bt1.a.e;
                        rd7.d(jt1Var3, eVar, kw7VarY);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        bt1.a.b bVar3 = bt1.a.g;
                        rd7.d(jt1Var3, bVar3, numValueOf);
                        bt1.a.C0034a c0034a2 = bt1.a.h;
                        rd7.c(jt1Var3, c0034a2);
                        bt1.a.d dVar2 = bt1.a.d;
                        rd7.d(jt1Var3, dVar2, ox6VarC);
                        jt1Var3.K(1766961464);
                        if (currentlyTypingState11114 == null || currentlyTypingState11114.getShowAvatar()) {
                            if (currentlyTypingState11114 != null) {
                                listH = ws0.h(currentlyTypingState11114.getAvatarWrapper());
                            } else if (LastParticipatingAdmin.isNull(conversation2.lastParticipatingAdmin())) {
                                listH = ConversationItemKt.getActiveAdminsAvatars();
                            } else {
                                Avatar avatar = conversation2.lastParticipatingAdmin().getAvatar();
                                avatar.getClass();
                                listH = ws0.h(new AvatarWrapper(avatar, conversation2.lastParticipatingAdmin().isBot()));
                            }
                            bVar = bVar3;
                            dVar = dVar2;
                            c0034a = c0034a2;
                            AvatarTriangleGroupKt.m20AvatarTriangleGroupjt2gSs(listH, new beb(), null, 32.0f, jt1Var3, 3072, 4);
                            b47.b(jt1Var3, ir9.n(aVar, 12.0f));
                        } else {
                            c0034a = c0034a2;
                            bVar = bVar3;
                            dVar = dVar2;
                        }
                        jt1Var3.B();
                        py8 py8Var = py8.a;
                        if (currentlyTypingState11114 != null) {
                            jt1Var3.K(-1057866277);
                            TypingIndicatorKt.AnimatedTypingDots(ir9.b(py8Var.a(aVar, 2.0f, true), 0.0f, 38.0f, 1), jt1Var3, 0, 0);
                            jt1Var3.B();
                        } else {
                            jt1Var3.K(-1057575373);
                            Context context = (Context) jt1Var3.F(AndroidCompositionLocals_androidKt.b);
                            ox6 ox6VarA = py8Var.a(aVar, 2.0f, true);
                            aj1 aj1VarA = yi1.a(new c30.h(2.0f, true, new a30()), di.a.m, jt1Var3, 6);
                            int iHashCode2 = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY2 = jt1Var3.y();
                            ox6 ox6VarC2 = it1.c(jt1Var3, ox6VarA);
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar2);
                            } else {
                                jt1Var3.z();
                            }
                            rd7.d(jt1Var3, cVar, aj1VarA);
                            rd7.d(jt1Var3, eVar, kw7VarY2);
                            g3.c(iHashCode2, jt1Var3, bVar, jt1Var3, c0034a);
                            rd7.d(jt1Var3, dVar, ox6VarC2);
                            ox6 ox6VarC3 = ir9.c(aVar, 1.0f);
                            ny8 ny8VarA2 = ly8.a(jVar, bVar2, jt1Var3, 48);
                            int iHashCode3 = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY3 = jt1Var3.y();
                            ox6 ox6VarC4 = it1.c(jt1Var3, ox6VarC3);
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar2);
                            } else {
                                jt1Var3.z();
                            }
                            rd7.d(jt1Var3, cVar, ny8VarA2);
                            rd7.d(jt1Var3, eVar, kw7VarY3);
                            g3.c(iHashCode3, jt1Var3, bVar, jt1Var3, c0034a);
                            rd7.d(jt1Var3, dVar, ox6VarC4);
                            String title = conversation2.getTitle();
                            ox6 ox6VarA2 = py8Var.a(aVar, 1.0f, true);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i14 = IntercomTheme.$stable;
                            mia.b(title, ox6VarA2, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var3, i14).getType04(), 0L, 0L, conversation2.isRead() ? ob4.y : ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var2, 0, 24960, 110588);
                            String str = TimeFormatterExtKt.formattedDateFromLong(conversation2.lastPart().getCreatedAt(), context);
                            jt1Var2.K(433245310);
                            if (str.length() > 0) {
                                mia.b(str, eo7.m(aVar, 8.0f, 0.0f, 0.0f, 0.0f, 14), intercomTheme.getColors(jt1Var2, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i14).getType04(), jt1Var2, 48, 0, 131064);
                                jt1Var3 = jt1Var2;
                            } else {
                                jt1Var3 = jt1Var2;
                            }
                            jt1Var3.B();
                            jt1Var3.I();
                            String summary = conversation2.lastPart().getSummary();
                            jt1Var3.K(-1283405160);
                            summary.getClass();
                            if (summary.length() > 0) {
                                jt1Var3.K(-1283403261);
                                if (conversation2.lastPart().getParticipant().isUserWithId(ConversationItemKt.getUserIntercomId())) {
                                    strA = nr1.f(jt1Var3, R.string.intercom_you) + ": " + summary;
                                } else {
                                    String firstName = conversation2.lastParticipatingAdmin().getFirstName();
                                    if (firstName.length() == 0) {
                                        firstName = ConversationItemKt.getWorkspaceName();
                                    }
                                    strA = cj2.a(firstName, ": ", summary);
                                }
                                jt1Var3.B();
                                mia.b(strA, null, intercomTheme.getColors(jt1Var3, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var3, i14).getType04(), 0L, 0L, conversation2.isRead() ? ob4.y : ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var2, 0, 24960, 110586);
                                jt1Var3 = jt1Var2;
                            }
                            jt1Var3.B();
                            jt1Var3.I();
                            if (z5) {
                                ConversationItemKt.UnreadIndicator(null, jt1Var3, 0, 1);
                            }
                            jt1Var3.B();
                        }
                        jt1Var3.I();
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4Var, 12582912, 126);
                ox6 ox6Var15 = ox6Var3;
                currentlyTypingState4 = currentlyTypingState3;
                ox6Var4 = ox6Var15;
            } else {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        currentlyTypingState2 = null;
                    }
                    if (i6 != 0) {
                        ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        CurrentlyTypingState currentlyTypingState11114 = currentlyTypingState2;
                        i9 = i3 & (-57345);
                        currentlyTypingState3 = currentlyTypingState11114;
                        z3 = !conversation.isRead();
                        go7Var2 = ko7Var;
                    } else {
                        CurrentlyTypingState currentlyTypingState11115 = currentlyTypingState2;
                        i9 = i3;
                        currentlyTypingState3 = currentlyTypingState11115;
                        go7Var2 = ko7Var;
                        z3 = z2;
                    }
                } else {
                    if (i11 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        currentlyTypingState2 = null;
                    }
                    if (i6 != 0) {
                        ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        CurrentlyTypingState currentlyTypingState11116 = currentlyTypingState2;
                        i9 = i3 & (-57345);
                        currentlyTypingState3 = currentlyTypingState11116;
                        z3 = !conversation.isRead();
                        go7Var2 = ko7Var;
                    } else {
                        CurrentlyTypingState currentlyTypingState11117 = currentlyTypingState2;
                        i9 = i3;
                        currentlyTypingState3 = currentlyTypingState11117;
                        go7Var2 = ko7Var;
                        z3 = z2;
                    }
                }
                bj4VarO.V();
                bj4VarO.K(-437489840);
                i10 = 0;
                if ((i9 & 458752) == 131072) {
                }
                objF = bj4VarO.f();
                if (z4) {
                    objF = new b22(i10, mh4Var);
                    bj4VarO.C(objF);
                } else {
                    objF = new b22(i10, mh4Var);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                bj4Var = bj4VarO;
                v5a.a(we1.c(ox6Var3, false, null, (mh4) objF, 15), null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(774321672, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.ConversationItemKt.ConversationItem.2
                    public final void invoke(jt1 jt1Var2, int i13) {
                        List listH;
                        bt1.a.b bVar;
                        bt1.a.d dVar;
                        bt1.a.C0034a c0034a;
                        String strA;
                        jt1 jt1Var3 = jt1Var2;
                        if ((i13 & 3) == 2 && jt1Var3.r()) {
                            jt1Var3.u();
                            return;
                        }
                        go7 go7Var3 = go7Var2;
                        ox6.a aVar = ox6.a.t;
                        ox6 ox6VarH = eo7.h(aVar, go7Var3);
                        CurrentlyTypingState currentlyTypingState11118 = currentlyTypingState3;
                        Conversation conversation2 = conversation;
                        boolean z5 = z3;
                        c30.j jVar = c30.a;
                        sp0.b bVar2 = di.a.k;
                        ny8 ny8VarA = ly8.a(jVar, bVar2, jt1Var3, 48);
                        int iHashCode = Long.hashCode(jt1Var3.v());
                        kw7 kw7VarY = jt1Var3.y();
                        ox6 ox6VarC = it1.c(jt1Var3, ox6VarH);
                        bt1.c.getClass();
                        qr5.a aVar2 = bt1.a.b;
                        if (jt1Var3.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var3.q();
                        if (jt1Var3.l()) {
                            jt1Var3.k(aVar2);
                        } else {
                            jt1Var3.z();
                        }
                        bt1.a.c cVar = bt1.a.f;
                        rd7.d(jt1Var3, cVar, ny8VarA);
                        bt1.a.e eVar = bt1.a.e;
                        rd7.d(jt1Var3, eVar, kw7VarY);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        bt1.a.b bVar3 = bt1.a.g;
                        rd7.d(jt1Var3, bVar3, numValueOf);
                        bt1.a.C0034a c0034a2 = bt1.a.h;
                        rd7.c(jt1Var3, c0034a2);
                        bt1.a.d dVar2 = bt1.a.d;
                        rd7.d(jt1Var3, dVar2, ox6VarC);
                        jt1Var3.K(1766961464);
                        if (currentlyTypingState11118 == null || currentlyTypingState11118.getShowAvatar()) {
                            if (currentlyTypingState11118 != null) {
                                listH = ws0.h(currentlyTypingState11118.getAvatarWrapper());
                            } else if (LastParticipatingAdmin.isNull(conversation2.lastParticipatingAdmin())) {
                                listH = ConversationItemKt.getActiveAdminsAvatars();
                            } else {
                                Avatar avatar = conversation2.lastParticipatingAdmin().getAvatar();
                                avatar.getClass();
                                listH = ws0.h(new AvatarWrapper(avatar, conversation2.lastParticipatingAdmin().isBot()));
                            }
                            bVar = bVar3;
                            dVar = dVar2;
                            c0034a = c0034a2;
                            AvatarTriangleGroupKt.m20AvatarTriangleGroupjt2gSs(listH, new beb(), null, 32.0f, jt1Var3, 3072, 4);
                            b47.b(jt1Var3, ir9.n(aVar, 12.0f));
                        } else {
                            c0034a = c0034a2;
                            bVar = bVar3;
                            dVar = dVar2;
                        }
                        jt1Var3.B();
                        py8 py8Var = py8.a;
                        if (currentlyTypingState11118 != null) {
                            jt1Var3.K(-1057866277);
                            TypingIndicatorKt.AnimatedTypingDots(ir9.b(py8Var.a(aVar, 2.0f, true), 0.0f, 38.0f, 1), jt1Var3, 0, 0);
                            jt1Var3.B();
                        } else {
                            jt1Var3.K(-1057575373);
                            Context context = (Context) jt1Var3.F(AndroidCompositionLocals_androidKt.b);
                            ox6 ox6VarA = py8Var.a(aVar, 2.0f, true);
                            aj1 aj1VarA = yi1.a(new c30.h(2.0f, true, new a30()), di.a.m, jt1Var3, 6);
                            int iHashCode2 = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY2 = jt1Var3.y();
                            ox6 ox6VarC2 = it1.c(jt1Var3, ox6VarA);
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar2);
                            } else {
                                jt1Var3.z();
                            }
                            rd7.d(jt1Var3, cVar, aj1VarA);
                            rd7.d(jt1Var3, eVar, kw7VarY2);
                            g3.c(iHashCode2, jt1Var3, bVar, jt1Var3, c0034a);
                            rd7.d(jt1Var3, dVar, ox6VarC2);
                            ox6 ox6VarC3 = ir9.c(aVar, 1.0f);
                            ny8 ny8VarA2 = ly8.a(jVar, bVar2, jt1Var3, 48);
                            int iHashCode3 = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY3 = jt1Var3.y();
                            ox6 ox6VarC4 = it1.c(jt1Var3, ox6VarC3);
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar2);
                            } else {
                                jt1Var3.z();
                            }
                            rd7.d(jt1Var3, cVar, ny8VarA2);
                            rd7.d(jt1Var3, eVar, kw7VarY3);
                            g3.c(iHashCode3, jt1Var3, bVar, jt1Var3, c0034a);
                            rd7.d(jt1Var3, dVar, ox6VarC4);
                            String title = conversation2.getTitle();
                            ox6 ox6VarA2 = py8Var.a(aVar, 1.0f, true);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i14 = IntercomTheme.$stable;
                            mia.b(title, ox6VarA2, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var3, i14).getType04(), 0L, 0L, conversation2.isRead() ? ob4.y : ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var2, 0, 24960, 110588);
                            String str = TimeFormatterExtKt.formattedDateFromLong(conversation2.lastPart().getCreatedAt(), context);
                            jt1Var2.K(433245310);
                            if (str.length() > 0) {
                                mia.b(str, eo7.m(aVar, 8.0f, 0.0f, 0.0f, 0.0f, 14), intercomTheme.getColors(jt1Var2, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i14).getType04(), jt1Var2, 48, 0, 131064);
                                jt1Var3 = jt1Var2;
                            } else {
                                jt1Var3 = jt1Var2;
                            }
                            jt1Var3.B();
                            jt1Var3.I();
                            String summary = conversation2.lastPart().getSummary();
                            jt1Var3.K(-1283405160);
                            summary.getClass();
                            if (summary.length() > 0) {
                                jt1Var3.K(-1283403261);
                                if (conversation2.lastPart().getParticipant().isUserWithId(ConversationItemKt.getUserIntercomId())) {
                                    strA = nr1.f(jt1Var3, R.string.intercom_you) + ": " + summary;
                                } else {
                                    String firstName = conversation2.lastParticipatingAdmin().getFirstName();
                                    if (firstName.length() == 0) {
                                        firstName = ConversationItemKt.getWorkspaceName();
                                    }
                                    strA = cj2.a(firstName, ": ", summary);
                                }
                                jt1Var3.B();
                                mia.b(strA, null, intercomTheme.getColors(jt1Var3, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var3, i14).getType04(), 0L, 0L, conversation2.isRead() ? ob4.y : ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var2, 0, 24960, 110586);
                                jt1Var3 = jt1Var2;
                            }
                            jt1Var3.B();
                            jt1Var3.I();
                            if (z5) {
                                ConversationItemKt.UnreadIndicator(null, jt1Var3, 0, 1);
                            }
                            jt1Var3.B();
                        }
                        jt1Var3.I();
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4Var, 12582912, 126);
                ox6 ox6Var16 = ox6Var3;
                currentlyTypingState4 = currentlyTypingState3;
                ox6Var4 = ox6Var16;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: c22
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ConversationItemKt.ConversationItem$lambda$2(conversation, ox6Var4, currentlyTypingState4, go7Var2, z3, mh4Var, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 384;
        currentlyTypingState2 = currentlyTypingState;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                ko7Var = go7Var;
                if (bj4VarO.J(ko7Var)) {
                    i7 = AudioConstants.AUDIO_FILE_BUFFER_SIZE;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    z2 = z;
                    if (bj4VarO.c(z2)) {
                    }
                    i3 |= i12;
                } else {
                    z2 = z;
                }
                i3 |= i12;
            } else {
                z2 = z;
            }
            if ((i2 & 32) != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (bj4VarO.j(mh4Var)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if ((74899 & i3) == 74898) {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        currentlyTypingState2 = null;
                    }
                    if (i6 != 0) {
                        ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        CurrentlyTypingState currentlyTypingState11118 = currentlyTypingState2;
                        i9 = i3 & (-57345);
                        currentlyTypingState3 = currentlyTypingState11118;
                        z3 = !conversation.isRead();
                        go7Var2 = ko7Var;
                    } else {
                        CurrentlyTypingState currentlyTypingState11119 = currentlyTypingState2;
                        i9 = i3;
                        currentlyTypingState3 = currentlyTypingState11119;
                        go7Var2 = ko7Var;
                        z3 = z2;
                    }
                } else {
                    if (i11 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        currentlyTypingState2 = null;
                    }
                    if (i6 != 0) {
                        ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        CurrentlyTypingState currentlyTypingState111110 = currentlyTypingState2;
                        i9 = i3 & (-57345);
                        currentlyTypingState3 = currentlyTypingState111110;
                        z3 = !conversation.isRead();
                        go7Var2 = ko7Var;
                    } else {
                        CurrentlyTypingState currentlyTypingState111111 = currentlyTypingState2;
                        i9 = i3;
                        currentlyTypingState3 = currentlyTypingState111111;
                        go7Var2 = ko7Var;
                        z3 = z2;
                    }
                }
                bj4VarO.V();
                bj4VarO.K(-437489840);
                i10 = 0;
                if ((i9 & 458752) == 131072) {
                }
                objF = bj4VarO.f();
                if (z4) {
                    objF = new b22(i10, mh4Var);
                    bj4VarO.C(objF);
                } else {
                    objF = new b22(i10, mh4Var);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                bj4Var = bj4VarO;
                v5a.a(we1.c(ox6Var3, false, null, (mh4) objF, 15), null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(774321672, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.ConversationItemKt.ConversationItem.2
                    public final void invoke(jt1 jt1Var2, int i13) {
                        List listH;
                        bt1.a.b bVar;
                        bt1.a.d dVar;
                        bt1.a.C0034a c0034a;
                        String strA;
                        jt1 jt1Var3 = jt1Var2;
                        if ((i13 & 3) == 2 && jt1Var3.r()) {
                            jt1Var3.u();
                            return;
                        }
                        go7 go7Var3 = go7Var2;
                        ox6.a aVar = ox6.a.t;
                        ox6 ox6VarH = eo7.h(aVar, go7Var3);
                        CurrentlyTypingState currentlyTypingState111112 = currentlyTypingState3;
                        Conversation conversation2 = conversation;
                        boolean z5 = z3;
                        c30.j jVar = c30.a;
                        sp0.b bVar2 = di.a.k;
                        ny8 ny8VarA = ly8.a(jVar, bVar2, jt1Var3, 48);
                        int iHashCode = Long.hashCode(jt1Var3.v());
                        kw7 kw7VarY = jt1Var3.y();
                        ox6 ox6VarC = it1.c(jt1Var3, ox6VarH);
                        bt1.c.getClass();
                        qr5.a aVar2 = bt1.a.b;
                        if (jt1Var3.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var3.q();
                        if (jt1Var3.l()) {
                            jt1Var3.k(aVar2);
                        } else {
                            jt1Var3.z();
                        }
                        bt1.a.c cVar = bt1.a.f;
                        rd7.d(jt1Var3, cVar, ny8VarA);
                        bt1.a.e eVar = bt1.a.e;
                        rd7.d(jt1Var3, eVar, kw7VarY);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        bt1.a.b bVar3 = bt1.a.g;
                        rd7.d(jt1Var3, bVar3, numValueOf);
                        bt1.a.C0034a c0034a2 = bt1.a.h;
                        rd7.c(jt1Var3, c0034a2);
                        bt1.a.d dVar2 = bt1.a.d;
                        rd7.d(jt1Var3, dVar2, ox6VarC);
                        jt1Var3.K(1766961464);
                        if (currentlyTypingState111112 == null || currentlyTypingState111112.getShowAvatar()) {
                            if (currentlyTypingState111112 != null) {
                                listH = ws0.h(currentlyTypingState111112.getAvatarWrapper());
                            } else if (LastParticipatingAdmin.isNull(conversation2.lastParticipatingAdmin())) {
                                listH = ConversationItemKt.getActiveAdminsAvatars();
                            } else {
                                Avatar avatar = conversation2.lastParticipatingAdmin().getAvatar();
                                avatar.getClass();
                                listH = ws0.h(new AvatarWrapper(avatar, conversation2.lastParticipatingAdmin().isBot()));
                            }
                            bVar = bVar3;
                            dVar = dVar2;
                            c0034a = c0034a2;
                            AvatarTriangleGroupKt.m20AvatarTriangleGroupjt2gSs(listH, new beb(), null, 32.0f, jt1Var3, 3072, 4);
                            b47.b(jt1Var3, ir9.n(aVar, 12.0f));
                        } else {
                            c0034a = c0034a2;
                            bVar = bVar3;
                            dVar = dVar2;
                        }
                        jt1Var3.B();
                        py8 py8Var = py8.a;
                        if (currentlyTypingState111112 != null) {
                            jt1Var3.K(-1057866277);
                            TypingIndicatorKt.AnimatedTypingDots(ir9.b(py8Var.a(aVar, 2.0f, true), 0.0f, 38.0f, 1), jt1Var3, 0, 0);
                            jt1Var3.B();
                        } else {
                            jt1Var3.K(-1057575373);
                            Context context = (Context) jt1Var3.F(AndroidCompositionLocals_androidKt.b);
                            ox6 ox6VarA = py8Var.a(aVar, 2.0f, true);
                            aj1 aj1VarA = yi1.a(new c30.h(2.0f, true, new a30()), di.a.m, jt1Var3, 6);
                            int iHashCode2 = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY2 = jt1Var3.y();
                            ox6 ox6VarC2 = it1.c(jt1Var3, ox6VarA);
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar2);
                            } else {
                                jt1Var3.z();
                            }
                            rd7.d(jt1Var3, cVar, aj1VarA);
                            rd7.d(jt1Var3, eVar, kw7VarY2);
                            g3.c(iHashCode2, jt1Var3, bVar, jt1Var3, c0034a);
                            rd7.d(jt1Var3, dVar, ox6VarC2);
                            ox6 ox6VarC3 = ir9.c(aVar, 1.0f);
                            ny8 ny8VarA2 = ly8.a(jVar, bVar2, jt1Var3, 48);
                            int iHashCode3 = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY3 = jt1Var3.y();
                            ox6 ox6VarC4 = it1.c(jt1Var3, ox6VarC3);
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar2);
                            } else {
                                jt1Var3.z();
                            }
                            rd7.d(jt1Var3, cVar, ny8VarA2);
                            rd7.d(jt1Var3, eVar, kw7VarY3);
                            g3.c(iHashCode3, jt1Var3, bVar, jt1Var3, c0034a);
                            rd7.d(jt1Var3, dVar, ox6VarC4);
                            String title = conversation2.getTitle();
                            ox6 ox6VarA2 = py8Var.a(aVar, 1.0f, true);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i14 = IntercomTheme.$stable;
                            mia.b(title, ox6VarA2, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var3, i14).getType04(), 0L, 0L, conversation2.isRead() ? ob4.y : ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var2, 0, 24960, 110588);
                            String str = TimeFormatterExtKt.formattedDateFromLong(conversation2.lastPart().getCreatedAt(), context);
                            jt1Var2.K(433245310);
                            if (str.length() > 0) {
                                mia.b(str, eo7.m(aVar, 8.0f, 0.0f, 0.0f, 0.0f, 14), intercomTheme.getColors(jt1Var2, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i14).getType04(), jt1Var2, 48, 0, 131064);
                                jt1Var3 = jt1Var2;
                            } else {
                                jt1Var3 = jt1Var2;
                            }
                            jt1Var3.B();
                            jt1Var3.I();
                            String summary = conversation2.lastPart().getSummary();
                            jt1Var3.K(-1283405160);
                            summary.getClass();
                            if (summary.length() > 0) {
                                jt1Var3.K(-1283403261);
                                if (conversation2.lastPart().getParticipant().isUserWithId(ConversationItemKt.getUserIntercomId())) {
                                    strA = nr1.f(jt1Var3, R.string.intercom_you) + ": " + summary;
                                } else {
                                    String firstName = conversation2.lastParticipatingAdmin().getFirstName();
                                    if (firstName.length() == 0) {
                                        firstName = ConversationItemKt.getWorkspaceName();
                                    }
                                    strA = cj2.a(firstName, ": ", summary);
                                }
                                jt1Var3.B();
                                mia.b(strA, null, intercomTheme.getColors(jt1Var3, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var3, i14).getType04(), 0L, 0L, conversation2.isRead() ? ob4.y : ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var2, 0, 24960, 110586);
                                jt1Var3 = jt1Var2;
                            }
                            jt1Var3.B();
                            jt1Var3.I();
                            if (z5) {
                                ConversationItemKt.UnreadIndicator(null, jt1Var3, 0, 1);
                            }
                            jt1Var3.B();
                        }
                        jt1Var3.I();
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4Var, 12582912, 126);
                ox6 ox6Var17 = ox6Var3;
                currentlyTypingState4 = currentlyTypingState3;
                ox6Var4 = ox6Var17;
            } else {
                bj4VarO.v0();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        currentlyTypingState2 = null;
                    }
                    if (i6 != 0) {
                        ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        CurrentlyTypingState currentlyTypingState111112 = currentlyTypingState2;
                        i9 = i3 & (-57345);
                        currentlyTypingState3 = currentlyTypingState111112;
                        z3 = !conversation.isRead();
                        go7Var2 = ko7Var;
                    } else {
                        CurrentlyTypingState currentlyTypingState111113 = currentlyTypingState2;
                        i9 = i3;
                        currentlyTypingState3 = currentlyTypingState111113;
                        go7Var2 = ko7Var;
                        z3 = z2;
                    }
                } else {
                    if (i11 != 0) {
                        ox6Var3 = ox6.a.t;
                    } else {
                        ox6Var3 = ox6Var2;
                    }
                    if (i4 != 0) {
                        currentlyTypingState2 = null;
                    }
                    if (i6 != 0) {
                        ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if ((i2 & 16) != 0) {
                        CurrentlyTypingState currentlyTypingState111114 = currentlyTypingState2;
                        i9 = i3 & (-57345);
                        currentlyTypingState3 = currentlyTypingState111114;
                        z3 = !conversation.isRead();
                        go7Var2 = ko7Var;
                    } else {
                        CurrentlyTypingState currentlyTypingState111115 = currentlyTypingState2;
                        i9 = i3;
                        currentlyTypingState3 = currentlyTypingState111115;
                        go7Var2 = ko7Var;
                        z3 = z2;
                    }
                }
                bj4VarO.V();
                bj4VarO.K(-437489840);
                i10 = 0;
                if ((i9 & 458752) == 131072) {
                }
                objF = bj4VarO.f();
                if (z4) {
                    objF = new b22(i10, mh4Var);
                    bj4VarO.C(objF);
                } else {
                    objF = new b22(i10, mh4Var);
                    bj4VarO.C(objF);
                }
                bj4VarO.U(false);
                bj4Var = bj4VarO;
                v5a.a(we1.c(ox6Var3, false, null, (mh4) objF, 15), null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(774321672, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.ConversationItemKt.ConversationItem.2
                    public final void invoke(jt1 jt1Var2, int i13) {
                        List listH;
                        bt1.a.b bVar;
                        bt1.a.d dVar;
                        bt1.a.C0034a c0034a;
                        String strA;
                        jt1 jt1Var3 = jt1Var2;
                        if ((i13 & 3) == 2 && jt1Var3.r()) {
                            jt1Var3.u();
                            return;
                        }
                        go7 go7Var3 = go7Var2;
                        ox6.a aVar = ox6.a.t;
                        ox6 ox6VarH = eo7.h(aVar, go7Var3);
                        CurrentlyTypingState currentlyTypingState111116 = currentlyTypingState3;
                        Conversation conversation2 = conversation;
                        boolean z5 = z3;
                        c30.j jVar = c30.a;
                        sp0.b bVar2 = di.a.k;
                        ny8 ny8VarA = ly8.a(jVar, bVar2, jt1Var3, 48);
                        int iHashCode = Long.hashCode(jt1Var3.v());
                        kw7 kw7VarY = jt1Var3.y();
                        ox6 ox6VarC = it1.c(jt1Var3, ox6VarH);
                        bt1.c.getClass();
                        qr5.a aVar2 = bt1.a.b;
                        if (jt1Var3.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var3.q();
                        if (jt1Var3.l()) {
                            jt1Var3.k(aVar2);
                        } else {
                            jt1Var3.z();
                        }
                        bt1.a.c cVar = bt1.a.f;
                        rd7.d(jt1Var3, cVar, ny8VarA);
                        bt1.a.e eVar = bt1.a.e;
                        rd7.d(jt1Var3, eVar, kw7VarY);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        bt1.a.b bVar3 = bt1.a.g;
                        rd7.d(jt1Var3, bVar3, numValueOf);
                        bt1.a.C0034a c0034a2 = bt1.a.h;
                        rd7.c(jt1Var3, c0034a2);
                        bt1.a.d dVar2 = bt1.a.d;
                        rd7.d(jt1Var3, dVar2, ox6VarC);
                        jt1Var3.K(1766961464);
                        if (currentlyTypingState111116 == null || currentlyTypingState111116.getShowAvatar()) {
                            if (currentlyTypingState111116 != null) {
                                listH = ws0.h(currentlyTypingState111116.getAvatarWrapper());
                            } else if (LastParticipatingAdmin.isNull(conversation2.lastParticipatingAdmin())) {
                                listH = ConversationItemKt.getActiveAdminsAvatars();
                            } else {
                                Avatar avatar = conversation2.lastParticipatingAdmin().getAvatar();
                                avatar.getClass();
                                listH = ws0.h(new AvatarWrapper(avatar, conversation2.lastParticipatingAdmin().isBot()));
                            }
                            bVar = bVar3;
                            dVar = dVar2;
                            c0034a = c0034a2;
                            AvatarTriangleGroupKt.m20AvatarTriangleGroupjt2gSs(listH, new beb(), null, 32.0f, jt1Var3, 3072, 4);
                            b47.b(jt1Var3, ir9.n(aVar, 12.0f));
                        } else {
                            c0034a = c0034a2;
                            bVar = bVar3;
                            dVar = dVar2;
                        }
                        jt1Var3.B();
                        py8 py8Var = py8.a;
                        if (currentlyTypingState111116 != null) {
                            jt1Var3.K(-1057866277);
                            TypingIndicatorKt.AnimatedTypingDots(ir9.b(py8Var.a(aVar, 2.0f, true), 0.0f, 38.0f, 1), jt1Var3, 0, 0);
                            jt1Var3.B();
                        } else {
                            jt1Var3.K(-1057575373);
                            Context context = (Context) jt1Var3.F(AndroidCompositionLocals_androidKt.b);
                            ox6 ox6VarA = py8Var.a(aVar, 2.0f, true);
                            aj1 aj1VarA = yi1.a(new c30.h(2.0f, true, new a30()), di.a.m, jt1Var3, 6);
                            int iHashCode2 = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY2 = jt1Var3.y();
                            ox6 ox6VarC2 = it1.c(jt1Var3, ox6VarA);
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar2);
                            } else {
                                jt1Var3.z();
                            }
                            rd7.d(jt1Var3, cVar, aj1VarA);
                            rd7.d(jt1Var3, eVar, kw7VarY2);
                            g3.c(iHashCode2, jt1Var3, bVar, jt1Var3, c0034a);
                            rd7.d(jt1Var3, dVar, ox6VarC2);
                            ox6 ox6VarC3 = ir9.c(aVar, 1.0f);
                            ny8 ny8VarA2 = ly8.a(jVar, bVar2, jt1Var3, 48);
                            int iHashCode3 = Long.hashCode(jt1Var3.v());
                            kw7 kw7VarY3 = jt1Var3.y();
                            ox6 ox6VarC4 = it1.c(jt1Var3, ox6VarC3);
                            if (jt1Var3.s() == null) {
                                ml5.c();
                                throw null;
                            }
                            jt1Var3.q();
                            if (jt1Var3.l()) {
                                jt1Var3.k(aVar2);
                            } else {
                                jt1Var3.z();
                            }
                            rd7.d(jt1Var3, cVar, ny8VarA2);
                            rd7.d(jt1Var3, eVar, kw7VarY3);
                            g3.c(iHashCode3, jt1Var3, bVar, jt1Var3, c0034a);
                            rd7.d(jt1Var3, dVar, ox6VarC4);
                            String title = conversation2.getTitle();
                            ox6 ox6VarA2 = py8Var.a(aVar, 1.0f, true);
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            int i14 = IntercomTheme.$stable;
                            mia.b(title, ox6VarA2, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var3, i14).getType04(), 0L, 0L, conversation2.isRead() ? ob4.y : ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var2, 0, 24960, 110588);
                            String str = TimeFormatterExtKt.formattedDateFromLong(conversation2.lastPart().getCreatedAt(), context);
                            jt1Var2.K(433245310);
                            if (str.length() > 0) {
                                mia.b(str, eo7.m(aVar, 8.0f, 0.0f, 0.0f, 0.0f, 14), intercomTheme.getColors(jt1Var2, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i14).getType04(), jt1Var2, 48, 0, 131064);
                                jt1Var3 = jt1Var2;
                            } else {
                                jt1Var3 = jt1Var2;
                            }
                            jt1Var3.B();
                            jt1Var3.I();
                            String summary = conversation2.lastPart().getSummary();
                            jt1Var3.K(-1283405160);
                            summary.getClass();
                            if (summary.length() > 0) {
                                jt1Var3.K(-1283403261);
                                if (conversation2.lastPart().getParticipant().isUserWithId(ConversationItemKt.getUserIntercomId())) {
                                    strA = nr1.f(jt1Var3, R.string.intercom_you) + ": " + summary;
                                } else {
                                    String firstName = conversation2.lastParticipatingAdmin().getFirstName();
                                    if (firstName.length() == 0) {
                                        firstName = ConversationItemKt.getWorkspaceName();
                                    }
                                    strA = cj2.a(firstName, ": ", summary);
                                }
                                jt1Var3.B();
                                mia.b(strA, null, intercomTheme.getColors(jt1Var3, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var3, i14).getType04(), 0L, 0L, conversation2.isRead() ? ob4.y : ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var2, 0, 24960, 110586);
                                jt1Var3 = jt1Var2;
                            }
                            jt1Var3.B();
                            jt1Var3.I();
                            if (z5) {
                                ConversationItemKt.UnreadIndicator(null, jt1Var3, 0, 1);
                            }
                            jt1Var3.B();
                        }
                        jt1Var3.I();
                    }

                    @Override // defpackage.ci4
                    public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                        invoke(jt1Var2, num.intValue());
                        return g2b.a;
                    }
                }, bj4VarO), bj4Var, 12582912, 126);
                ox6 ox6Var18 = ox6Var3;
                currentlyTypingState4 = currentlyTypingState3;
                ox6Var4 = ox6Var18;
            }
            xj8VarW = bj4Var.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: c22
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ConversationItemKt.ConversationItem$lambda$2(conversation, ox6Var4, currentlyTypingState4, go7Var2, z3, mh4Var, i, i2, (jt1) obj, iIntValue);
                    }
                };
            }
        }
        i3 |= 3072;
        ko7Var = go7Var;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                z2 = z;
                if (bj4VarO.c(z2)) {
                }
                i3 |= i12;
            } else {
                z2 = z;
            }
            i3 |= i12;
        } else {
            z2 = z;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            if (bj4VarO.j(mh4Var)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        }
        if ((74899 & i3) == 74898) {
            bj4VarO.v0();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    currentlyTypingState2 = null;
                }
                if (i6 != 0) {
                    ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i2 & 16) != 0) {
                    CurrentlyTypingState currentlyTypingState111116 = currentlyTypingState2;
                    i9 = i3 & (-57345);
                    currentlyTypingState3 = currentlyTypingState111116;
                    z3 = !conversation.isRead();
                    go7Var2 = ko7Var;
                } else {
                    CurrentlyTypingState currentlyTypingState111117 = currentlyTypingState2;
                    i9 = i3;
                    currentlyTypingState3 = currentlyTypingState111117;
                    go7Var2 = ko7Var;
                    z3 = z2;
                }
            } else {
                if (i11 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    currentlyTypingState2 = null;
                }
                if (i6 != 0) {
                    ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i2 & 16) != 0) {
                    CurrentlyTypingState currentlyTypingState111118 = currentlyTypingState2;
                    i9 = i3 & (-57345);
                    currentlyTypingState3 = currentlyTypingState111118;
                    z3 = !conversation.isRead();
                    go7Var2 = ko7Var;
                } else {
                    CurrentlyTypingState currentlyTypingState111119 = currentlyTypingState2;
                    i9 = i3;
                    currentlyTypingState3 = currentlyTypingState111119;
                    go7Var2 = ko7Var;
                    z3 = z2;
                }
            }
            bj4VarO.V();
            bj4VarO.K(-437489840);
            i10 = 0;
            if ((i9 & 458752) == 131072) {
            }
            objF = bj4VarO.f();
            if (z4) {
                objF = new b22(i10, mh4Var);
                bj4VarO.C(objF);
            } else {
                objF = new b22(i10, mh4Var);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            bj4Var = bj4VarO;
            v5a.a(we1.c(ox6Var3, false, null, (mh4) objF, 15), null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(774321672, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.ConversationItemKt.ConversationItem.2
                public final void invoke(jt1 jt1Var2, int i13) {
                    List listH;
                    bt1.a.b bVar;
                    bt1.a.d dVar;
                    bt1.a.C0034a c0034a;
                    String strA;
                    jt1 jt1Var3 = jt1Var2;
                    if ((i13 & 3) == 2 && jt1Var3.r()) {
                        jt1Var3.u();
                        return;
                    }
                    go7 go7Var3 = go7Var2;
                    ox6.a aVar = ox6.a.t;
                    ox6 ox6VarH = eo7.h(aVar, go7Var3);
                    CurrentlyTypingState currentlyTypingState1111110 = currentlyTypingState3;
                    Conversation conversation2 = conversation;
                    boolean z5 = z3;
                    c30.j jVar = c30.a;
                    sp0.b bVar2 = di.a.k;
                    ny8 ny8VarA = ly8.a(jVar, bVar2, jt1Var3, 48);
                    int iHashCode = Long.hashCode(jt1Var3.v());
                    kw7 kw7VarY = jt1Var3.y();
                    ox6 ox6VarC = it1.c(jt1Var3, ox6VarH);
                    bt1.c.getClass();
                    qr5.a aVar2 = bt1.a.b;
                    if (jt1Var3.s() == null) {
                        ml5.c();
                        throw null;
                    }
                    jt1Var3.q();
                    if (jt1Var3.l()) {
                        jt1Var3.k(aVar2);
                    } else {
                        jt1Var3.z();
                    }
                    bt1.a.c cVar = bt1.a.f;
                    rd7.d(jt1Var3, cVar, ny8VarA);
                    bt1.a.e eVar = bt1.a.e;
                    rd7.d(jt1Var3, eVar, kw7VarY);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    bt1.a.b bVar3 = bt1.a.g;
                    rd7.d(jt1Var3, bVar3, numValueOf);
                    bt1.a.C0034a c0034a2 = bt1.a.h;
                    rd7.c(jt1Var3, c0034a2);
                    bt1.a.d dVar2 = bt1.a.d;
                    rd7.d(jt1Var3, dVar2, ox6VarC);
                    jt1Var3.K(1766961464);
                    if (currentlyTypingState1111110 == null || currentlyTypingState1111110.getShowAvatar()) {
                        if (currentlyTypingState1111110 != null) {
                            listH = ws0.h(currentlyTypingState1111110.getAvatarWrapper());
                        } else if (LastParticipatingAdmin.isNull(conversation2.lastParticipatingAdmin())) {
                            listH = ConversationItemKt.getActiveAdminsAvatars();
                        } else {
                            Avatar avatar = conversation2.lastParticipatingAdmin().getAvatar();
                            avatar.getClass();
                            listH = ws0.h(new AvatarWrapper(avatar, conversation2.lastParticipatingAdmin().isBot()));
                        }
                        bVar = bVar3;
                        dVar = dVar2;
                        c0034a = c0034a2;
                        AvatarTriangleGroupKt.m20AvatarTriangleGroupjt2gSs(listH, new beb(), null, 32.0f, jt1Var3, 3072, 4);
                        b47.b(jt1Var3, ir9.n(aVar, 12.0f));
                    } else {
                        c0034a = c0034a2;
                        bVar = bVar3;
                        dVar = dVar2;
                    }
                    jt1Var3.B();
                    py8 py8Var = py8.a;
                    if (currentlyTypingState1111110 != null) {
                        jt1Var3.K(-1057866277);
                        TypingIndicatorKt.AnimatedTypingDots(ir9.b(py8Var.a(aVar, 2.0f, true), 0.0f, 38.0f, 1), jt1Var3, 0, 0);
                        jt1Var3.B();
                    } else {
                        jt1Var3.K(-1057575373);
                        Context context = (Context) jt1Var3.F(AndroidCompositionLocals_androidKt.b);
                        ox6 ox6VarA = py8Var.a(aVar, 2.0f, true);
                        aj1 aj1VarA = yi1.a(new c30.h(2.0f, true, new a30()), di.a.m, jt1Var3, 6);
                        int iHashCode2 = Long.hashCode(jt1Var3.v());
                        kw7 kw7VarY2 = jt1Var3.y();
                        ox6 ox6VarC2 = it1.c(jt1Var3, ox6VarA);
                        if (jt1Var3.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var3.q();
                        if (jt1Var3.l()) {
                            jt1Var3.k(aVar2);
                        } else {
                            jt1Var3.z();
                        }
                        rd7.d(jt1Var3, cVar, aj1VarA);
                        rd7.d(jt1Var3, eVar, kw7VarY2);
                        g3.c(iHashCode2, jt1Var3, bVar, jt1Var3, c0034a);
                        rd7.d(jt1Var3, dVar, ox6VarC2);
                        ox6 ox6VarC3 = ir9.c(aVar, 1.0f);
                        ny8 ny8VarA2 = ly8.a(jVar, bVar2, jt1Var3, 48);
                        int iHashCode3 = Long.hashCode(jt1Var3.v());
                        kw7 kw7VarY3 = jt1Var3.y();
                        ox6 ox6VarC4 = it1.c(jt1Var3, ox6VarC3);
                        if (jt1Var3.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var3.q();
                        if (jt1Var3.l()) {
                            jt1Var3.k(aVar2);
                        } else {
                            jt1Var3.z();
                        }
                        rd7.d(jt1Var3, cVar, ny8VarA2);
                        rd7.d(jt1Var3, eVar, kw7VarY3);
                        g3.c(iHashCode3, jt1Var3, bVar, jt1Var3, c0034a);
                        rd7.d(jt1Var3, dVar, ox6VarC4);
                        String title = conversation2.getTitle();
                        ox6 ox6VarA2 = py8Var.a(aVar, 1.0f, true);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i14 = IntercomTheme.$stable;
                        mia.b(title, ox6VarA2, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var3, i14).getType04(), 0L, 0L, conversation2.isRead() ? ob4.y : ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var2, 0, 24960, 110588);
                        String str = TimeFormatterExtKt.formattedDateFromLong(conversation2.lastPart().getCreatedAt(), context);
                        jt1Var2.K(433245310);
                        if (str.length() > 0) {
                            mia.b(str, eo7.m(aVar, 8.0f, 0.0f, 0.0f, 0.0f, 14), intercomTheme.getColors(jt1Var2, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i14).getType04(), jt1Var2, 48, 0, 131064);
                            jt1Var3 = jt1Var2;
                        } else {
                            jt1Var3 = jt1Var2;
                        }
                        jt1Var3.B();
                        jt1Var3.I();
                        String summary = conversation2.lastPart().getSummary();
                        jt1Var3.K(-1283405160);
                        summary.getClass();
                        if (summary.length() > 0) {
                            jt1Var3.K(-1283403261);
                            if (conversation2.lastPart().getParticipant().isUserWithId(ConversationItemKt.getUserIntercomId())) {
                                strA = nr1.f(jt1Var3, R.string.intercom_you) + ": " + summary;
                            } else {
                                String firstName = conversation2.lastParticipatingAdmin().getFirstName();
                                if (firstName.length() == 0) {
                                    firstName = ConversationItemKt.getWorkspaceName();
                                }
                                strA = cj2.a(firstName, ": ", summary);
                            }
                            jt1Var3.B();
                            mia.b(strA, null, intercomTheme.getColors(jt1Var3, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var3, i14).getType04(), 0L, 0L, conversation2.isRead() ? ob4.y : ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var2, 0, 24960, 110586);
                            jt1Var3 = jt1Var2;
                        }
                        jt1Var3.B();
                        jt1Var3.I();
                        if (z5) {
                            ConversationItemKt.UnreadIndicator(null, jt1Var3, 0, 1);
                        }
                        jt1Var3.B();
                    }
                    jt1Var3.I();
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4Var, 12582912, 126);
            ox6 ox6Var19 = ox6Var3;
            currentlyTypingState4 = currentlyTypingState3;
            ox6Var4 = ox6Var19;
        } else {
            bj4VarO.v0();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    currentlyTypingState2 = null;
                }
                if (i6 != 0) {
                    ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i2 & 16) != 0) {
                    CurrentlyTypingState currentlyTypingState1111110 = currentlyTypingState2;
                    i9 = i3 & (-57345);
                    currentlyTypingState3 = currentlyTypingState1111110;
                    z3 = !conversation.isRead();
                    go7Var2 = ko7Var;
                } else {
                    CurrentlyTypingState currentlyTypingState1111111 = currentlyTypingState2;
                    i9 = i3;
                    currentlyTypingState3 = currentlyTypingState1111111;
                    go7Var2 = ko7Var;
                    z3 = z2;
                }
            } else {
                if (i11 != 0) {
                    ox6Var3 = ox6.a.t;
                } else {
                    ox6Var3 = ox6Var2;
                }
                if (i4 != 0) {
                    currentlyTypingState2 = null;
                }
                if (i6 != 0) {
                    ko7Var = new ko7(0.0f, 0.0f, 0.0f, 0.0f);
                }
                if ((i2 & 16) != 0) {
                    CurrentlyTypingState currentlyTypingState1111112 = currentlyTypingState2;
                    i9 = i3 & (-57345);
                    currentlyTypingState3 = currentlyTypingState1111112;
                    z3 = !conversation.isRead();
                    go7Var2 = ko7Var;
                } else {
                    CurrentlyTypingState currentlyTypingState1111113 = currentlyTypingState2;
                    i9 = i3;
                    currentlyTypingState3 = currentlyTypingState1111113;
                    go7Var2 = ko7Var;
                    z3 = z2;
                }
            }
            bj4VarO.V();
            bj4VarO.K(-437489840);
            i10 = 0;
            if ((i9 & 458752) == 131072) {
            }
            objF = bj4VarO.f();
            if (z4) {
                objF = new b22(i10, mh4Var);
                bj4VarO.C(objF);
            } else {
                objF = new b22(i10, mh4Var);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            bj4Var = bj4VarO;
            v5a.a(we1.c(ox6Var3, false, null, (mh4) objF, 15), null, 0L, 0L, 0.0f, 0.0f, null, gr1.b(774321672, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.components.ConversationItemKt.ConversationItem.2
                public final void invoke(jt1 jt1Var2, int i13) {
                    List listH;
                    bt1.a.b bVar;
                    bt1.a.d dVar;
                    bt1.a.C0034a c0034a;
                    String strA;
                    jt1 jt1Var3 = jt1Var2;
                    if ((i13 & 3) == 2 && jt1Var3.r()) {
                        jt1Var3.u();
                        return;
                    }
                    go7 go7Var3 = go7Var2;
                    ox6.a aVar = ox6.a.t;
                    ox6 ox6VarH = eo7.h(aVar, go7Var3);
                    CurrentlyTypingState currentlyTypingState1111114 = currentlyTypingState3;
                    Conversation conversation2 = conversation;
                    boolean z5 = z3;
                    c30.j jVar = c30.a;
                    sp0.b bVar2 = di.a.k;
                    ny8 ny8VarA = ly8.a(jVar, bVar2, jt1Var3, 48);
                    int iHashCode = Long.hashCode(jt1Var3.v());
                    kw7 kw7VarY = jt1Var3.y();
                    ox6 ox6VarC = it1.c(jt1Var3, ox6VarH);
                    bt1.c.getClass();
                    qr5.a aVar2 = bt1.a.b;
                    if (jt1Var3.s() == null) {
                        ml5.c();
                        throw null;
                    }
                    jt1Var3.q();
                    if (jt1Var3.l()) {
                        jt1Var3.k(aVar2);
                    } else {
                        jt1Var3.z();
                    }
                    bt1.a.c cVar = bt1.a.f;
                    rd7.d(jt1Var3, cVar, ny8VarA);
                    bt1.a.e eVar = bt1.a.e;
                    rd7.d(jt1Var3, eVar, kw7VarY);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    bt1.a.b bVar3 = bt1.a.g;
                    rd7.d(jt1Var3, bVar3, numValueOf);
                    bt1.a.C0034a c0034a2 = bt1.a.h;
                    rd7.c(jt1Var3, c0034a2);
                    bt1.a.d dVar2 = bt1.a.d;
                    rd7.d(jt1Var3, dVar2, ox6VarC);
                    jt1Var3.K(1766961464);
                    if (currentlyTypingState1111114 == null || currentlyTypingState1111114.getShowAvatar()) {
                        if (currentlyTypingState1111114 != null) {
                            listH = ws0.h(currentlyTypingState1111114.getAvatarWrapper());
                        } else if (LastParticipatingAdmin.isNull(conversation2.lastParticipatingAdmin())) {
                            listH = ConversationItemKt.getActiveAdminsAvatars();
                        } else {
                            Avatar avatar = conversation2.lastParticipatingAdmin().getAvatar();
                            avatar.getClass();
                            listH = ws0.h(new AvatarWrapper(avatar, conversation2.lastParticipatingAdmin().isBot()));
                        }
                        bVar = bVar3;
                        dVar = dVar2;
                        c0034a = c0034a2;
                        AvatarTriangleGroupKt.m20AvatarTriangleGroupjt2gSs(listH, new beb(), null, 32.0f, jt1Var3, 3072, 4);
                        b47.b(jt1Var3, ir9.n(aVar, 12.0f));
                    } else {
                        c0034a = c0034a2;
                        bVar = bVar3;
                        dVar = dVar2;
                    }
                    jt1Var3.B();
                    py8 py8Var = py8.a;
                    if (currentlyTypingState1111114 != null) {
                        jt1Var3.K(-1057866277);
                        TypingIndicatorKt.AnimatedTypingDots(ir9.b(py8Var.a(aVar, 2.0f, true), 0.0f, 38.0f, 1), jt1Var3, 0, 0);
                        jt1Var3.B();
                    } else {
                        jt1Var3.K(-1057575373);
                        Context context = (Context) jt1Var3.F(AndroidCompositionLocals_androidKt.b);
                        ox6 ox6VarA = py8Var.a(aVar, 2.0f, true);
                        aj1 aj1VarA = yi1.a(new c30.h(2.0f, true, new a30()), di.a.m, jt1Var3, 6);
                        int iHashCode2 = Long.hashCode(jt1Var3.v());
                        kw7 kw7VarY2 = jt1Var3.y();
                        ox6 ox6VarC2 = it1.c(jt1Var3, ox6VarA);
                        if (jt1Var3.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var3.q();
                        if (jt1Var3.l()) {
                            jt1Var3.k(aVar2);
                        } else {
                            jt1Var3.z();
                        }
                        rd7.d(jt1Var3, cVar, aj1VarA);
                        rd7.d(jt1Var3, eVar, kw7VarY2);
                        g3.c(iHashCode2, jt1Var3, bVar, jt1Var3, c0034a);
                        rd7.d(jt1Var3, dVar, ox6VarC2);
                        ox6 ox6VarC3 = ir9.c(aVar, 1.0f);
                        ny8 ny8VarA2 = ly8.a(jVar, bVar2, jt1Var3, 48);
                        int iHashCode3 = Long.hashCode(jt1Var3.v());
                        kw7 kw7VarY3 = jt1Var3.y();
                        ox6 ox6VarC4 = it1.c(jt1Var3, ox6VarC3);
                        if (jt1Var3.s() == null) {
                            ml5.c();
                            throw null;
                        }
                        jt1Var3.q();
                        if (jt1Var3.l()) {
                            jt1Var3.k(aVar2);
                        } else {
                            jt1Var3.z();
                        }
                        rd7.d(jt1Var3, cVar, ny8VarA2);
                        rd7.d(jt1Var3, eVar, kw7VarY3);
                        g3.c(iHashCode3, jt1Var3, bVar, jt1Var3, c0034a);
                        rd7.d(jt1Var3, dVar, ox6VarC4);
                        String title = conversation2.getTitle();
                        ox6 ox6VarA2 = py8Var.a(aVar, 1.0f, true);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i14 = IntercomTheme.$stable;
                        mia.b(title, ox6VarA2, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var3, i14).getType04(), 0L, 0L, conversation2.isRead() ? ob4.y : ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var2, 0, 24960, 110588);
                        String str = TimeFormatterExtKt.formattedDateFromLong(conversation2.lastPart().getCreatedAt(), context);
                        jt1Var2.K(433245310);
                        if (str.length() > 0) {
                            mia.b(str, eo7.m(aVar, 8.0f, 0.0f, 0.0f, 0.0f, 14), intercomTheme.getColors(jt1Var2, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(jt1Var2, i14).getType04(), jt1Var2, 48, 0, 131064);
                            jt1Var3 = jt1Var2;
                        } else {
                            jt1Var3 = jt1Var2;
                        }
                        jt1Var3.B();
                        jt1Var3.I();
                        String summary = conversation2.lastPart().getSummary();
                        jt1Var3.K(-1283405160);
                        summary.getClass();
                        if (summary.length() > 0) {
                            jt1Var3.K(-1283403261);
                            if (conversation2.lastPart().getParticipant().isUserWithId(ConversationItemKt.getUserIntercomId())) {
                                strA = nr1.f(jt1Var3, R.string.intercom_you) + ": " + summary;
                            } else {
                                String firstName = conversation2.lastParticipatingAdmin().getFirstName();
                                if (firstName.length() == 0) {
                                    firstName = ConversationItemKt.getWorkspaceName();
                                }
                                strA = cj2.a(firstName, ": ", summary);
                            }
                            jt1Var3.B();
                            mia.b(strA, null, intercomTheme.getColors(jt1Var3, i14).getText().m827getMuted0d7_KjU(), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, wja.a(intercomTheme.getTypography(jt1Var3, i14).getType04(), 0L, 0L, conversation2.isRead() ? ob4.y : ob4.A, null, 0L, 0L, null, null, 16777211), jt1Var2, 0, 24960, 110586);
                            jt1Var3 = jt1Var2;
                        }
                        jt1Var3.B();
                        jt1Var3.I();
                        if (z5) {
                            ConversationItemKt.UnreadIndicator(null, jt1Var3, 0, 1);
                        }
                        jt1Var3.B();
                    }
                    jt1Var3.I();
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var2, Integer num) {
                    invoke(jt1Var2, num.intValue());
                    return g2b.a;
                }
            }, bj4VarO), bj4Var, 12582912, 126);
            ox6 ox6Var110 = ox6Var3;
            currentlyTypingState4 = currentlyTypingState3;
            ox6Var4 = ox6Var110;
        }
        xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: c22
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ConversationItemKt.ConversationItem$lambda$2(conversation, ox6Var4, currentlyTypingState4, go7Var2, z3, mh4Var, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ConversationItem$lambda$1$lambda$0(mh4 mh4Var) {
        mh4Var.invoke();
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ConversationItem$lambda$2(Conversation conversation, ox6 ox6Var, CurrentlyTypingState currentlyTypingState, go7 go7Var, boolean z, mh4 mh4Var, int i, int i2, jt1 jt1Var, int i3) {
        ConversationItem(conversation, ox6Var, currentlyTypingState, go7Var, z, mh4Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    @IntercomPreviews
    public static final void ReadConversationCardPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(167408241);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationItemKt.INSTANCE.m36getLambda3$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new z12(i, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b ReadConversationCardPreview$lambda$10(int i, jt1 jt1Var, int i2) {
        ReadConversationCardPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void TypingConversationCardPreview(jt1 jt1Var, int i) {
        bj4 bj4VarO = jt1Var.o(1953914578);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationItemKt.INSTANCE.m38getLambda5$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new lg1(i, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b TypingConversationCardPreview$lambda$12(int i, jt1 jt1Var, int i2) {
        TypingConversationCardPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void UnreadConversationCardPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-1292079862);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationItemKt.INSTANCE.m34getLambda1$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: y12
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ConversationItemKt.UnreadConversationCardPreview$lambda$8(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b UnreadConversationCardPreview$lambda$8(int i, jt1 jt1Var, int i2) {
        UnreadConversationCardPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    @IntercomPreviews
    public static final void UnreadConversationCardWithBotPreview(jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(-516742229);
        if (i == 0 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationItemKt.INSTANCE.m35getLambda2$intercom_sdk_base_release(), bj4VarO, 3072, 7);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: a22
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ConversationItemKt.UnreadConversationCardWithBotPreview$lambda$9(i, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b UnreadConversationCardWithBotPreview$lambda$9(int i, jt1 jt1Var, int i2) {
        UnreadConversationCardWithBotPreview(jt1Var, gz3.s(i | 1));
        return g2b.a;
    }

    public static final void UnreadIndicator(final ox6 ox6Var, jt1 jt1Var, final int i, final int i2) {
        int i3;
        bj4 bj4VarO = jt1Var.o(481161991);
        int i4 = i2 & 1;
        int i5 = 2;
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
            ox6 ox6VarJ = ir9.j(ox6Var, 16.0f);
            fl6 fl6VarD = dv0.d(di.a.f, false);
            int iHashCode = Long.hashCode(bj4VarO.T);
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6VarJ);
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
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            ox6 ox6VarJ2 = ir9.j(aVar, 8.0f);
            bj4VarO.K(-1160147731);
            Object objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                objF = new b50(i5);
                bj4VarO.C(objF);
            }
            bj4VarO.U(false);
            us3.b(ox6VarJ2, (oh4) objF, bj4VarO, 54);
            bj4VarO.U(true);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: d22
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ConversationItemKt.UnreadIndicator$lambda$7(ox6Var, i, i2, (jt1) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b UnreadIndicator$lambda$6$lambda$5$lambda$4(d73 d73Var) {
        d73Var.getClass();
        long jD = u7d.d(4292544041L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (d73Var.c() >> 32)) / 2.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (d73Var.c() & 4294967295L)) / 2.0f;
        d73.N(d73Var, jD, 0.0f, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), 0, 122);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g2b UnreadIndicator$lambda$7(ox6 ox6Var, int i, int i2, jt1 jt1Var, int i3) {
        UnreadIndicator(ox6Var, jt1Var, gz3.s(i | 1), i2);
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AvatarWrapper> getActiveAdminsAvatars() {
        List<Participant> listO = th1.O(3, Injector.get().getDataLayer().getTeamPresence().getValue().getBuiltActiveAdmins());
        ArrayList arrayList = new ArrayList(ph1.n(listO, 10));
        for (Participant participant : listO) {
            Avatar avatar = participant.getAvatar();
            avatar.getClass();
            Boolean boolIsBot = participant.isBot();
            boolIsBot.getClass();
            arrayList.add(new AvatarWrapper(avatar, boolIsBot.booleanValue()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getUserIntercomId() {
        if (Injector.isNotInitialised()) {
            return BuildConfig.FLAVOR;
        }
        String intercomId = Injector.get().getUserIdentity().getIntercomId();
        intercomId.getClass();
        return intercomId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getWorkspaceName() {
        return ((AppConfig) defpackage.z.a()).getName();
    }

    private static final Conversation sampleConversation(boolean z) {
        LastParticipatingAdmin.Builder builderWithAvatar = new LastParticipatingAdmin.Builder().withFirstName("Santhosh Kumar").withAvatar(new Avatar.Builder().withInitials("SK"));
        builderWithAvatar.getClass();
        return new Conversation("123", "Dual credit guidance", z, null, ws0.h(new Part.Builder().withSummary("last message").withCreatedAt(System.currentTimeMillis())), null, builderWithAvatar, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 2097064, null);
    }

    public static /* synthetic */ Conversation sampleConversation$default(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return sampleConversation(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Conversation sampleConversationWithBot() {
        LastParticipatingAdmin.Builder builderWithIsBot = new LastParticipatingAdmin.Builder().withFirstName("Operator").withAvatar(new Avatar.Builder().withInitials("O")).withIsBot(Boolean.TRUE);
        builderWithIsBot.getClass();
        return new Conversation("123", "Account setup assistance", false, null, ws0.h(new Part.Builder().withSummary("This is the last message received/sent to/from this user").withCreatedAt(System.currentTimeMillis())), null, builderWithIsBot, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 2097068, null);
    }
}
