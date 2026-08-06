package io.intercom.android.sdk.utilities;

import android.app.Fragment;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import defpackage.aa;
import defpackage.vr0;
import defpackage.z;
import defpackage.z90;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Phrase {
    private static final int EOF = 0;
    private char curChar;
    private int curCharIndex;
    private CharSequence formatted;
    private Token head;
    private final Set<String> keys = new HashSet();
    private final Map<String, CharSequence> keysToValues = new HashMap();
    private final CharSequence pattern;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class KeyToken extends Token {
        private final String key;
        private CharSequence value;

        public KeyToken(Token token, String str) {
            super(token);
            this.key = str;
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        public void expand(SpannableStringBuilder spannableStringBuilder, Map<String, CharSequence> map) {
            this.value = map.get(this.key);
            int formattedStart = getFormattedStart();
            spannableStringBuilder.replace(formattedStart, this.key.length() + formattedStart + 2, this.value);
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        public int getFormattedLength() {
            return this.value.length();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class LeftCurlyBracketToken extends Token {
        public LeftCurlyBracketToken(Token token) {
            super(token);
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        public void expand(SpannableStringBuilder spannableStringBuilder, Map<String, CharSequence> map) {
            int formattedStart = getFormattedStart();
            spannableStringBuilder.replace(formattedStart, formattedStart + 2, "{");
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        public int getFormattedLength() {
            return 1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class Token {
        Token next;
        private final Token prev;

        public Token(Token token) {
            this.prev = token;
            if (token != null) {
                token.next = this;
            }
        }

        public abstract void expand(SpannableStringBuilder spannableStringBuilder, Map<String, CharSequence> map);

        public abstract int getFormattedLength();

        public final int getFormattedStart() {
            Token token = this.prev;
            if (token == null) {
                return 0;
            }
            return token.getFormattedStart() + this.prev.getFormattedLength();
        }
    }

    private Phrase(CharSequence charSequence) {
        this.curChar = charSequence.length() > 0 ? charSequence.charAt(0) : (char) 0;
        this.pattern = charSequence;
        Token token = null;
        while (true) {
            token = token(token);
            if (token == null) {
                return;
            }
            if (this.head == null) {
                this.head = token;
            }
        }
    }

    private void consume() {
        int i = this.curCharIndex + 1;
        this.curCharIndex = i;
        this.curChar = i == this.pattern.length() ? (char) 0 : this.pattern.charAt(this.curCharIndex);
    }

    public static Phrase from(Fragment fragment, int i) {
        return from(fragment.getResources(), i);
    }

    private KeyToken key(Token token) {
        char c;
        StringBuilder sb = new StringBuilder();
        consume();
        while (true) {
            c = this.curChar;
            if ((c < 'a' || c > 'z') && ((c < 'A' || c > 'Z') && c != '_' && (c < '0' || c > '9'))) {
                break;
            }
            sb.append(c);
            consume();
        }
        if (c != '}') {
            z.b(this.pattern, "'", "Missing closing brace: } in '");
            return null;
        }
        consume();
        if (sb.length() == 0) {
            z.b(this.pattern, "'", "Empty key: {} in '");
            return null;
        }
        String string = sb.toString();
        this.keys.add(string);
        return new KeyToken(token, string);
    }

    private LeftCurlyBracketToken leftCurlyBracket(Token token) {
        consume();
        consume();
        return new LeftCurlyBracketToken(token);
    }

    private char lookahead() {
        if (this.curCharIndex < this.pattern.length() - 1) {
            return this.pattern.charAt(this.curCharIndex + 1);
        }
        return (char) 0;
    }

    private TextToken text(Token token) {
        int i = this.curCharIndex;
        while (true) {
            char c = this.curChar;
            if (c == '{' || c == 0) {
                break;
            }
            consume();
        }
        return new TextToken(token, this.curCharIndex - i);
    }

    private Token token(Token token) {
        char c = this.curChar;
        if (c == 0) {
            return null;
        }
        if (c != '{') {
            return text(token);
        }
        char cLookahead = lookahead();
        if (cLookahead == '{') {
            return leftCurlyBracket(token);
        }
        if (cLookahead >= 'a' && cLookahead <= 'z') {
            return key(token);
        }
        throw new IllegalArgumentException("Unexpected character '" + cLookahead + "'; expected key in '" + ((Object) this.pattern) + "'");
    }

    public CharSequence format() {
        if (this.formatted == null) {
            if (!this.keysToValues.keySet().containsAll(this.keys)) {
                HashSet hashSet = new HashSet(this.keys);
                hashSet.removeAll(this.keysToValues.keySet());
                StringBuilder sb = new StringBuilder("Missing keys: ");
                sb.append(hashSet);
                CharSequence charSequence = this.pattern;
                sb.append(" in '");
                sb.append((Object) charSequence);
                sb.append("'");
                throw new IllegalArgumentException(sb.toString());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.pattern);
            for (Token token = this.head; token != null; token = token.next) {
                token.expand(spannableStringBuilder, this.keysToValues);
            }
            this.formatted = spannableStringBuilder;
        }
        return this.formatted;
    }

    public void into(TextView textView) {
        if (textView != null) {
            textView.setText(format());
        } else {
            z90.a("TextView must not be null.");
        }
    }

    public Phrase put(String str, CharSequence charSequence) {
        if (!this.keys.contains(str)) {
            vr0.d(aa.a("Key '", str, "' not found in '"), this.pattern, "'");
            return null;
        }
        if (charSequence == null) {
            vr0.d(aa.a("Null value for '", str, "' in '"), this.pattern, "'");
            return null;
        }
        this.keysToValues.put(str, charSequence);
        this.formatted = null;
        return this;
    }

    public Phrase putOptional(String str, CharSequence charSequence) {
        return this.keys.contains(str) ? put(str, charSequence) : this;
    }

    public String toString() {
        return this.pattern.toString();
    }

    public static Phrase from(View view, int i) {
        return from(view.getResources(), i);
    }

    public static Phrase from(Context context, int i) {
        return from(context.getResources(), i);
    }

    public static Phrase from(Resources resources, int i) {
        return from(resources.getText(i));
    }

    public static Phrase from(CharSequence charSequence) {
        return new Phrase(charSequence);
    }

    public Phrase putOptional(String str, int i) {
        return this.keys.contains(str) ? put(str, i) : this;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class TextToken extends Token {
        private final int textLength;

        public TextToken(Token token, int i) {
            super(token);
            this.textLength = i;
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        public int getFormattedLength() {
            return this.textLength;
        }

        @Override // io.intercom.android.sdk.utilities.Phrase.Token
        public void expand(SpannableStringBuilder spannableStringBuilder, Map<String, CharSequence> map) {
        }
    }

    public Phrase put(String str, int i) {
        return put(str, Integer.toString(i));
    }
}
