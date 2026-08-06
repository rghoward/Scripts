package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class aj6 {
    public final Matcher a;
    public final CharSequence b;
    public final a c;
    public yi6 d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends s0<xi6> {
        public a() {
        }

        @Override // defpackage.s0, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof xi6) {
                return super.contains((xi6) obj);
            }
            return false;
        }

        @Override // defpackage.s0
        public final int d() {
            return aj6.this.a.groupCount() + 1;
        }

        public final xi6 e(int i) {
            Matcher matcher = aj6.this.a;
            fg5 fg5VarJ = uh8.j(matcher.start(i), matcher.end(i));
            if (fg5VarJ.t < 0) {
                return null;
            }
            String strGroup = matcher.group(i);
            strGroup.getClass();
            return new xi6(strGroup, fg5VarJ);
        }

        @Override // defpackage.s0, java.util.Collection
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<xi6> iterator() {
            return new pva.a(new pva(new sh1(new fg5(0, size() - 1, 1)), new oh4() { // from class: zi6
                @Override // defpackage.oh4
                public final Object invoke(Object obj) {
                    return this.t.e(((Integer) obj).intValue());
                }
            }));
        }
    }

    public aj6(Matcher matcher, CharSequence charSequence) {
        charSequence.getClass();
        this.a = matcher;
        this.b = charSequence;
        this.c = new a();
    }

    public final fg5 a() {
        Matcher matcher = this.a;
        return uh8.j(matcher.start(), matcher.end());
    }

    public final aj6 b() {
        Matcher matcher = this.a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        return t2.b(matcher2, iEnd, charSequence);
    }
}
