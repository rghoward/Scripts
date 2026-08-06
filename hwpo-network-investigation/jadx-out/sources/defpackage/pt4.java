package defpackage;

import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import com.intercom.twig.BuildConfig;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pt4 {
    public static int a(HandwritingGesture handwritingGesture, nk8 nk8Var) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        nk8Var.invoke(new lo1(fallbackText, 1));
        return 5;
    }

    public static void b(long j, iw iwVar, boolean z, nk8 nk8Var) {
        if (z) {
            int i = lja.c;
            int iCharCount = (int) (j >> 32);
            int iCharCount2 = (int) (j & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(iwVar, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < iwVar.u.length() ? Character.codePointAt(iwVar, iCharCount2) : 10;
            if (rt4.i(iCodePointBefore) && (rt4.h(iCodePointAt) || rt4.g(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(iwVar, iCharCount);
                    }
                } while (rt4.i(iCodePointBefore));
                j = ay.c(iCharCount, iCharCount2);
            } else if (rt4.i(iCodePointAt) && (rt4.h(iCodePointBefore) || rt4.g(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == iwVar.u.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(iwVar, iCharCount2);
                    }
                } while (rt4.i(iCodePointAt));
                j = ay.c(iCharCount, iCharCount2);
            }
        }
        int i2 = (int) (4294967295L & j);
        nk8Var.invoke(new qt4(new ra3[]{new ek9(i2, i2), new lx2(lja.d(j), 0)}));
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0264  */
    public static int c(u56 u56Var, HandwritingGesture handwritingGesture, qga qgaVar, lgb lgbVar, nk8 nk8Var) {
        long jH;
        String string;
        int i;
        sia siaVarD;
        sia siaVarD2;
        qia qiaVar;
        iw iwVar = u56Var.j;
        if (iwVar == null) {
            return 3;
        }
        sia siaVarD3 = u56Var.d();
        if (!iwVar.equals((siaVarD3 == null || (qiaVar = siaVarD3.a.a) == null) ? null : qiaVar.a)) {
            return 3;
        }
        if (handwritingGesture instanceof SelectGesture) {
            SelectGesture selectGesture = (SelectGesture) handwritingGesture;
            long jF = rt4.f(u56Var, h40.e(selectGesture.getSelectionArea()), selectGesture.getGranularity() == 1 ? 1 : 0);
            if (lja.c(jF)) {
                return a(selectGesture, nk8Var);
            }
            nk8Var.invoke(new ek9((int) (jF >> 32), (int) (jF & 4294967295L)));
            if (qgaVar != null) {
                qgaVar.h(true);
                return 1;
            }
        } else {
            if (handwritingGesture instanceof DeleteGesture) {
                DeleteGesture deleteGesture = (DeleteGesture) handwritingGesture;
                int i2 = deleteGesture.getGranularity() != 1 ? 0 : 1;
                long jF2 = rt4.f(u56Var, h40.e(deleteGesture.getDeletionArea()), i2);
                if (lja.c(jF2)) {
                    return a(deleteGesture, nk8Var);
                }
                b(jF2, iwVar, i2 == 1, nk8Var);
                return 1;
            }
            if (!(handwritingGesture instanceof SelectRangeGesture)) {
                if (handwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) handwritingGesture;
                    int i3 = deleteRangeGesture.getGranularity() != 1 ? 0 : 1;
                    long jB = rt4.b(u56Var, h40.e(deleteRangeGesture.getDeletionStartArea()), h40.e(deleteRangeGesture.getDeletionEndArea()), i3);
                    if (lja.c(jB)) {
                        return a(deleteRangeGesture, nk8Var);
                    }
                    b(jB, iwVar, i3 == 1, nk8Var);
                    return 1;
                }
                if (handwritingGesture instanceof JoinOrSplitGesture) {
                    JoinOrSplitGesture joinOrSplitGesture = (JoinOrSplitGesture) handwritingGesture;
                    if (lgbVar == null) {
                        return a(joinOrSplitGesture, nk8Var);
                    }
                    int iA = rt4.a(u56Var, rt4.d(joinOrSplitGesture.getJoinOrSplitPoint()), lgbVar);
                    if (iA == -1 || ((siaVarD2 = u56Var.d()) != null && rt4.c(siaVarD2.a, iA))) {
                        return a(joinOrSplitGesture, nk8Var);
                    }
                    int iCharCount = iA;
                    while (iCharCount > 0) {
                        int iCodePointBefore = Character.codePointBefore(iwVar, iCharCount);
                        if (!rt4.h(iCodePointBefore)) {
                            break;
                        }
                        iCharCount -= Character.charCount(iCodePointBefore);
                    }
                    while (iA < iwVar.u.length()) {
                        int iCodePointAt = Character.codePointAt(iwVar, iA);
                        if (!rt4.h(iCodePointAt)) {
                            break;
                        }
                        iA += Character.charCount(iCodePointAt);
                    }
                    long jC = ay.c(iCharCount, iA);
                    if (!lja.c(jC)) {
                        b(jC, iwVar, false, nk8Var);
                        return 1;
                    }
                    int i4 = (int) (jC >> 32);
                    nk8Var.invoke(new qt4(new ra3[]{new ek9(i4, i4), new lo1(" ", 1)}));
                    return 1;
                }
                if (handwritingGesture instanceof InsertGesture) {
                    InsertGesture insertGesture = (InsertGesture) handwritingGesture;
                    if (lgbVar == null) {
                        return a(insertGesture, nk8Var);
                    }
                    int iA2 = rt4.a(u56Var, rt4.d(insertGesture.getInsertionPoint()), lgbVar);
                    if (iA2 == -1 || ((siaVarD = u56Var.d()) != null && rt4.c(siaVarD.a, iA2))) {
                        return a(insertGesture, nk8Var);
                    }
                    nk8Var.invoke(new qt4(new ra3[]{new ek9(iA2, iA2), new lo1(insertGesture.getTextToInsert(), 1)}));
                    return 1;
                }
                if (!(handwritingGesture instanceof RemoveSpaceGesture)) {
                    return 2;
                }
                RemoveSpaceGesture removeSpaceGesture = (RemoveSpaceGesture) handwritingGesture;
                sia siaVarD4 = u56Var.d();
                ria riaVar = siaVarD4 != null ? siaVarD4.a : null;
                long jD = rt4.d(removeSpaceGesture.getStartPoint());
                long jD2 = rt4.d(removeSpaceGesture.getEndPoint());
                qq5 qq5VarC = u56Var.c();
                if (riaVar != null) {
                    l07 l07Var = riaVar.b;
                    if (qq5VarC == null) {
                        jH = lja.b;
                    } else {
                        long j = qq5VarC.j(jD);
                        long j2 = qq5VarC.j(jD2);
                        int iE = rt4.e(l07Var, j, lgbVar);
                        int iE2 = rt4.e(l07Var, j2, lgbVar);
                        if (iE != -1) {
                            if (iE2 != -1) {
                                iE = Math.min(iE, iE2);
                            }
                            iE2 = iE;
                        } else if (iE2 == -1) {
                            jH = lja.b;
                        }
                        float fB = (l07Var.b(iE2) + l07Var.f(iE2)) / 2.0f;
                        int i5 = (int) (j >> 32);
                        int i6 = (int) (j2 >> 32);
                        jH = l07Var.h(new sk8(Math.min(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6)), fB - 0.1f, Math.max(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6)), fB + 0.1f), 0, pha.a.a);
                    }
                } else {
                    jH = lja.b;
                }
                if (lja.c(jH)) {
                    return a(removeSpaceGesture, nk8Var);
                }
                el8 el8Var = new el8();
                el8Var.t = -1;
                el8 el8Var2 = new el8();
                el8Var2.t = -1;
                String str = iwVar.subSequence(lja.f(jH), lja.e(jH)).u;
                Pattern patternCompile = Pattern.compile("\\s+");
                patternCompile.getClass();
                str.getClass();
                Matcher matcher = patternCompile.matcher(str);
                matcher.getClass();
                aj6 aj6VarB = t2.b(matcher, 0, str);
                if (aj6VarB == null) {
                    string = str.toString();
                } else {
                    int length = str.length();
                    StringBuilder sb = new StringBuilder(length);
                    int i7 = 0;
                    do {
                        sb.append((CharSequence) str, i7, aj6VarB.a().t);
                        if (el8Var.t == -1) {
                            el8Var.t = aj6VarB.a().t;
                        }
                        el8Var2.t = aj6VarB.a().u + 1;
                        sb.append((CharSequence) BuildConfig.FLAVOR);
                        i7 = aj6VarB.a().u + 1;
                        aj6VarB = aj6VarB.b();
                        if (i7 >= length) {
                            break;
                        }
                    } while (aj6VarB != null);
                    if (i7 < length) {
                        sb.append((CharSequence) str, i7, length);
                    }
                    string = sb.toString();
                }
                int i8 = el8Var.t;
                if (i8 == -1 || (i = el8Var2.t) == -1) {
                    return a(removeSpaceGesture, nk8Var);
                }
                int i9 = (int) (jH >> 32);
                nk8Var.invoke(new qt4(new ra3[]{new ek9(i9 + i8, i9 + i), new lo1(string.substring(i8, string.length() - (lja.d(jH) - el8Var2.t)), 1)}));
                return 1;
            }
            SelectRangeGesture selectRangeGesture = (SelectRangeGesture) handwritingGesture;
            long jB2 = rt4.b(u56Var, h40.e(selectRangeGesture.getSelectionStartArea()), h40.e(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() == 1 ? 1 : 0);
            if (lja.c(jB2)) {
                return a(selectRangeGesture, nk8Var);
            }
            nk8Var.invoke(new ek9((int) (jB2 >> 32), (int) (jB2 & 4294967295L)));
            if (qgaVar != null) {
                qgaVar.h(true);
            }
        }
        return 1;
    }

    public static boolean d(u56 u56Var, PreviewableHandwritingGesture previewableHandwritingGesture, final qga qgaVar, CancellationSignal cancellationSignal) {
        qia qiaVar;
        iw iwVar = u56Var.j;
        if (iwVar != null) {
            sia siaVarD = u56Var.d();
            if (iwVar.equals((siaVarD == null || (qiaVar = siaVarD.a.a) == null) ? null : qiaVar.a)) {
                boolean z = previewableHandwritingGesture instanceof SelectGesture;
                bt4 bt4Var = bt4.t;
                if (z) {
                    SelectGesture selectGesture = (SelectGesture) previewableHandwritingGesture;
                    if (qgaVar != null) {
                        long jF = rt4.f(u56Var, h40.e(selectGesture.getSelectionArea()), selectGesture.getGranularity() != 1 ? 0 : 1);
                        u56 u56Var2 = qgaVar.d;
                        if (u56Var2 != null) {
                            u56Var2.f(jF);
                        }
                        u56 u56Var3 = qgaVar.d;
                        if (u56Var3 != null) {
                            u56Var3.e(lja.b);
                        }
                        if (!lja.c(jF)) {
                            qgaVar.t(false);
                            qgaVar.q(bt4Var);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteGesture) {
                    DeleteGesture deleteGesture = (DeleteGesture) previewableHandwritingGesture;
                    if (qgaVar != null) {
                        long jF2 = rt4.f(u56Var, h40.e(deleteGesture.getDeletionArea()), deleteGesture.getGranularity() != 1 ? 0 : 1);
                        u56 u56Var4 = qgaVar.d;
                        if (u56Var4 != null) {
                            u56Var4.e(jF2);
                        }
                        u56 u56Var5 = qgaVar.d;
                        if (u56Var5 != null) {
                            u56Var5.f(lja.b);
                        }
                        if (!lja.c(jF2)) {
                            qgaVar.t(false);
                            qgaVar.q(bt4Var);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof SelectRangeGesture) {
                    SelectRangeGesture selectRangeGesture = (SelectRangeGesture) previewableHandwritingGesture;
                    if (qgaVar != null) {
                        long jB = rt4.b(u56Var, h40.e(selectRangeGesture.getSelectionStartArea()), h40.e(selectRangeGesture.getSelectionEndArea()), selectRangeGesture.getGranularity() != 1 ? 0 : 1);
                        u56 u56Var6 = qgaVar.d;
                        if (u56Var6 != null) {
                            u56Var6.f(jB);
                        }
                        u56 u56Var7 = qgaVar.d;
                        if (u56Var7 != null) {
                            u56Var7.e(lja.b);
                        }
                        if (!lja.c(jB)) {
                            qgaVar.t(false);
                            qgaVar.q(bt4Var);
                        }
                    }
                } else if (previewableHandwritingGesture instanceof DeleteRangeGesture) {
                    DeleteRangeGesture deleteRangeGesture = (DeleteRangeGesture) previewableHandwritingGesture;
                    if (qgaVar != null) {
                        long jB2 = rt4.b(u56Var, h40.e(deleteRangeGesture.getDeletionStartArea()), h40.e(deleteRangeGesture.getDeletionEndArea()), deleteRangeGesture.getGranularity() != 1 ? 0 : 1);
                        u56 u56Var8 = qgaVar.d;
                        if (u56Var8 != null) {
                            u56Var8.e(jB2);
                        }
                        u56 u56Var9 = qgaVar.d;
                        if (u56Var9 != null) {
                            u56Var9.f(lja.b);
                        }
                        if (!lja.c(jB2)) {
                            qgaVar.t(false);
                            qgaVar.q(bt4Var);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: ot4
                        @Override // android.os.CancellationSignal.OnCancelListener
                        public final void onCancel() {
                            qga qgaVar2 = qgaVar;
                            if (qgaVar2 != null) {
                                u56 u56Var10 = qgaVar2.d;
                                if (u56Var10 != null) {
                                    u56Var10.e(lja.b);
                                }
                                u56 u56Var11 = qgaVar2.d;
                                if (u56Var11 != null) {
                                    u56Var11.f(lja.b);
                                }
                            }
                        }
                    });
                }
                return true;
            }
        }
        return false;
    }
}
