package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import defpackage.uza;
import defpackage.ve3;
import defpackage.vza;
import defpackage.yu6;
import defpackage.z2b;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final androidx.emoji2.text.d.j a;
    public final h b;
    public final androidx.emoji2.text.d.e c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a implements b<z2b> {
        public z2b a;
        public final androidx.emoji2.text.d.j b;

        public a(z2b z2bVar, androidx.emoji2.text.d.j jVar) {
            this.a = z2bVar;
            this.b = jVar;
        }

        @Override // androidx.emoji2.text.f.b
        public final boolean a(CharSequence charSequence, int i, int i2, uza uzaVar) {
            if ((uzaVar.c & 4) > 0) {
                return true;
            }
            if (this.a == null) {
                this.a = new z2b(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            ((androidx.emoji2.text.d.C0015d) this.b).getClass();
            this.a.setSpan(new vza(uzaVar), i, i2, 33);
            return true;
        }

        @Override // androidx.emoji2.text.f.b
        public final z2b getResult() {
            return this.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface b<T> {
        boolean a(CharSequence charSequence, int i, int i2, uza uzaVar);

        T getResult();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e {
        public int a = 1;
        public final h.a b;
        public h.a c;
        public h.a d;
        public int e;
        public int f;

        public e(h.a aVar) {
            this.b = aVar;
            this.c = aVar;
        }

        public final void a() {
            this.a = 1;
            this.c = this.b;
            this.f = 0;
        }

        public final boolean b() {
            yu6 yu6VarB = this.c.b.b();
            int iA = yu6VarB.a(6);
            return !(iA == 0 || yu6VarB.b.get(iA + yu6VarB.a) == 0) || this.e == 65039;
        }
    }

    public f(h hVar, androidx.emoji2.text.d.C0015d c0015d, androidx.emoji2.text.b bVar, Set set) {
        this.a = c0015d;
        this.b = hVar;
        this.c = bVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            c(str, 0, str.length(), 1, true, new d(str));
        }
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z) {
        ve3[] ve3VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (ve3VarArr = (ve3[]) editable.getSpans(selectionStart, selectionEnd, ve3.class)) != null && ve3VarArr.length > 0) {
                for (ve3 ve3Var : ve3VarArr) {
                    int spanStart = editable.getSpanStart(ve3Var);
                    int spanEnd = editable.getSpanEnd(ve3Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean b(CharSequence charSequence, int i, int i2, uza uzaVar) {
        if ((uzaVar.c & 3) == 0) {
            androidx.emoji2.text.d.e eVar = this.c;
            yu6 yu6VarB = uzaVar.b();
            int iA = yu6VarB.a(8);
            if (iA != 0) {
                yu6VarB.b.getShort(iA + yu6VarB.a);
            }
            androidx.emoji2.text.b bVar = (androidx.emoji2.text.b) eVar;
            bVar.getClass();
            ThreadLocal<StringBuilder> threadLocal = androidx.emoji2.text.b.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean zHasGlyph = bVar.a.hasGlyph(sb.toString());
            int i3 = uzaVar.c & 4;
            uzaVar.c = zHasGlyph ? i3 | 2 : i3 | 1;
        }
        return (uzaVar.c & 3) == 2;
    }

    public final <T> T c(CharSequence charSequence, int i, int i2, int i3, boolean z, b<T> bVar) {
        int i4;
        char c2;
        e eVar = new e(this.b.c);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zA = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (true) {
                if (iCharCount < i2 && i5 < i3 && zA) {
                    SparseArray<h.a> sparseArray = eVar.c.a;
                    h.a aVar = sparseArray == null ? null : sparseArray.get(iCodePointAt);
                    if (eVar.a == 2) {
                        if (aVar != null) {
                            eVar.c = aVar;
                            eVar.f++;
                        } else {
                            if (iCodePointAt == 65038) {
                                eVar.a();
                            } else if (iCodePointAt != 65039) {
                                h.a aVar2 = eVar.c;
                                if (aVar2.b != null) {
                                    if (eVar.f != 1) {
                                        eVar.d = aVar2;
                                        eVar.a();
                                    } else if (eVar.b()) {
                                        eVar.d = eVar.c;
                                        eVar.a();
                                    } else {
                                        eVar.a();
                                    }
                                    c2 = 3;
                                } else {
                                    eVar.a();
                                }
                            }
                            c2 = 1;
                        }
                        c2 = 2;
                    } else if (aVar == null) {
                        eVar.a();
                        c2 = 1;
                    } else {
                        eVar.a = 2;
                        eVar.c = aVar;
                        eVar.f = 1;
                        c2 = 2;
                    }
                    eVar.e = iCodePointAt;
                    if (c2 == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                        if (iCharCount >= i2) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c2 == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i2) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c2 == 3) {
                        if (!z && b(charSequence, i4, iCharCount, eVar.d.b)) {
                            break;
                        }
                        zA = bVar.a(charSequence, i4, iCharCount, eVar.d.b);
                        i5++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (eVar.a == 2 && eVar.c.b != null && ((eVar.f > 1 || eVar.b()) && i5 < i3 && zA && (z || !b(charSequence, i4, iCharCount, eVar.c.b)))) {
            bVar.a(charSequence, i4, iCharCount, eVar.c.b);
        }
        return bVar.getResult();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c implements b<c> {
        public final int a;
        public int b = -1;
        public int c = -1;

        public c(int i) {
            this.a = i;
        }

        @Override // androidx.emoji2.text.f.b
        public final boolean a(CharSequence charSequence, int i, int i2, uza uzaVar) {
            int i3 = this.a;
            if (i > i3 || i3 >= i2) {
                return i2 <= i3;
            }
            this.b = i;
            this.c = i2;
            return false;
        }

        @Override // androidx.emoji2.text.f.b
        public final c getResult() {
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class d implements b<d> {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        @Override // androidx.emoji2.text.f.b
        public final boolean a(CharSequence charSequence, int i, int i2, uza uzaVar) {
            if (!TextUtils.equals(charSequence.subSequence(i, i2), this.a)) {
                return true;
            }
            uzaVar.c = (uzaVar.c & 3) | 4;
            return false;
        }

        @Override // androidx.emoji2.text.f.b
        public final d getResult() {
            return this;
        }
    }
}
