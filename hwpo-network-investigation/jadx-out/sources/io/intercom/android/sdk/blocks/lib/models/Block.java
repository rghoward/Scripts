package io.intercom.android.sdk.blocks.lib.models;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.intercom.twig.BuildConfig;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.BlockType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class Block implements Parcelable {
    public static final Parcelable.Creator<Block> CREATOR = new Parcelable.Creator<Block>() { // from class: io.intercom.android.sdk.blocks.lib.models.Block.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Block createFromParcel(Parcel parcel) {
            return new Block(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Block[] newArray(int i) {
            return new Block[i];
        }
    };
    private final BlockAlignment align;
    private final String articleId;
    private final List<BlockAttachment> attachments;
    private final String attribution;
    private final Author author;
    private final Map<String, String> data;
    private final String description;
    private final long duration;
    private final String fallbackUrl;
    private final Link footerLink;
    private final int height;
    private final String id;
    private final Image image;
    private final int imageHeight;
    private final String imageUrl;
    private final int imageWidth;
    private final List<String> items;
    private final String language;
    private final String linkType;
    private final String linkUrl;
    private final List<Link> links;
    private final Uri local_uri;
    private final List<ConversationRatingOption> options;
    private final String previewUrl;
    private final String provider;
    private final int ratingIndex;
    private final String remark;
    private final String siteName;
    private final String text;
    private final String thumbnailUrl;
    private long ticketTypeId;
    private final TicketType ticket_type;
    private final String ticket_type_title;
    private final String title;
    private final String trackingUrl;
    private final BlockType type;
    private final String url;
    private final String username;
    private final int width;

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.models.Block$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$blocks$lib$BlockType;

        static {
            int[] iArr = new int[BlockType.values().length];
            $SwitchMap$io$intercom$android$sdk$blocks$lib$BlockType = iArr;
            try {
                iArr[BlockType.PARAGRAPH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$lib$BlockType[BlockType.LOCALIMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$lib$BlockType[BlockType.IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$lib$BlockType[BlockType.LOCAL_ATTACHMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Builder {
        String align;
        String articleId;
        List<BlockAttachment> attachments;
        String attribution;
        Author author;
        Map<String, String> data;
        String description;
        Long duration;
        String fallbackUrl;
        Builder footerLink;
        Integer height;
        String id;
        Image image;
        Integer imageHeight;
        String imageUrl;
        Integer imageWidth;
        List<String> items;
        String language;
        String linkType;
        String linkUrl;
        List<Builder> links;
        Uri local_uri;
        List<ConversationRatingOption> options;
        String previewUrl;
        String provider;
        Integer ratingIndex;
        Integer rating_index;
        String remark;
        String siteName;
        String text;
        String thumbnailUrl;
        TicketType ticket_type;
        long ticket_type_id;
        String ticket_type_title;
        String title;
        String trackingUrl;
        String type;
        String url;
        String username;
        Integer width;

        public Block build() {
            return new Block(this);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Builder.class == obj.getClass()) {
                Builder builder = (Builder) obj;
                String str = this.type;
                String str2 = builder.type;
                if (str == null ? str2 != null : !str.equals(str2)) {
                    return false;
                }
                String str3 = this.text;
                String str4 = builder.text;
                if (str3 == null ? str4 != null : !str3.equals(str4)) {
                    return false;
                }
                String str5 = this.title;
                String str6 = builder.title;
                if (str5 == null ? str6 != null : !str5.equals(str6)) {
                    return false;
                }
                String str7 = this.description;
                String str8 = builder.description;
                if (str7 == null ? str8 != null : !str7.equals(str8)) {
                    return false;
                }
                String str9 = this.linkType;
                String str10 = builder.linkType;
                if (str9 == null ? str10 != null : !str9.equals(str10)) {
                    return false;
                }
                String str11 = this.siteName;
                String str12 = builder.siteName;
                if (str11 == null ? str12 != null : !str11.equals(str12)) {
                    return false;
                }
                String str13 = this.articleId;
                String str14 = builder.articleId;
                if (str13 == null ? str14 != null : !str13.equals(str14)) {
                    return false;
                }
                Author author = this.author;
                Author author2 = builder.author;
                if (author == null ? author2 != null : !author.equals(author2)) {
                    return false;
                }
                Image image = this.image;
                Image image2 = builder.image;
                if (image == null ? image2 != null : !image.equals(image2)) {
                    return false;
                }
                Map<String, String> map = this.data;
                Map<String, String> map2 = builder.data;
                if (map == null ? map2 != null : !map.equals(map2)) {
                    return false;
                }
                String str15 = this.language;
                String str16 = builder.language;
                if (str15 == null ? str16 != null : !str15.equals(str16)) {
                    return false;
                }
                String str17 = this.url;
                String str18 = builder.url;
                if (str17 == null ? str18 != null : !str17.equals(str18)) {
                    return false;
                }
                String str19 = this.thumbnailUrl;
                String str20 = builder.thumbnailUrl;
                if (str19 == null ? str20 != null : !str19.equals(str20)) {
                    return false;
                }
                String str21 = this.linkUrl;
                String str22 = builder.linkUrl;
                if (str21 == null ? str22 != null : !str21.equals(str22)) {
                    return false;
                }
                String str23 = this.trackingUrl;
                String str24 = builder.trackingUrl;
                if (str23 == null ? str24 != null : !str23.equals(str24)) {
                    return false;
                }
                String str25 = this.fallbackUrl;
                String str26 = builder.fallbackUrl;
                if (str25 == null ? str26 != null : !str25.equals(str26)) {
                    return false;
                }
                String str27 = this.username;
                String str28 = builder.username;
                if (str27 == null ? str28 != null : !str27.equals(str28)) {
                    return false;
                }
                String str29 = this.provider;
                String str30 = builder.provider;
                if (str29 == null ? str30 != null : !str29.equals(str30)) {
                    return false;
                }
                String str31 = this.id;
                String str32 = builder.id;
                if (str31 == null ? str32 != null : !str31.equals(str32)) {
                    return false;
                }
                String str33 = this.align;
                String str34 = builder.align;
                if (str33 == null ? str34 != null : !str33.equals(str34)) {
                    return false;
                }
                Integer num = this.width;
                Integer num2 = builder.width;
                if (num == null ? num2 != null : !num.equals(num2)) {
                    return false;
                }
                Integer num3 = this.height;
                Integer num4 = builder.height;
                if (num3 == null ? num4 != null : !num3.equals(num4)) {
                    return false;
                }
                Long l = this.duration;
                Long l2 = builder.duration;
                if (l == null ? l2 != null : !l.equals(l2)) {
                    return false;
                }
                String str35 = this.previewUrl;
                String str36 = builder.previewUrl;
                if (str35 == null ? str36 != null : !str35.equals(str36)) {
                    return false;
                }
                String str37 = this.attribution;
                String str38 = builder.attribution;
                if (str37 == null ? str38 != null : !str37.equals(str38)) {
                    return false;
                }
                List<BlockAttachment> list = this.attachments;
                List<BlockAttachment> list2 = builder.attachments;
                if (list == null ? list2 != null : !list.equals(list2)) {
                    return false;
                }
                List<String> list3 = this.items;
                List<String> list4 = builder.items;
                if (list3 == null ? list4 != null : !list3.equals(list4)) {
                    return false;
                }
                Integer num5 = this.rating_index;
                Integer num6 = builder.rating_index;
                if (num5 == null ? num6 != null : !num5.equals(num6)) {
                    return false;
                }
                Integer num7 = this.ratingIndex;
                Integer num8 = builder.ratingIndex;
                if (num7 == null ? num8 != null : !num7.equals(num8)) {
                    return false;
                }
                String str39 = this.remark;
                String str40 = builder.remark;
                if (str39 == null ? str40 != null : !str39.equals(str40)) {
                    return false;
                }
                List<ConversationRatingOption> list5 = this.options;
                List<ConversationRatingOption> list6 = builder.options;
                if (list5 == null ? list6 != null : !list5.equals(list6)) {
                    return false;
                }
                List<Builder> list7 = this.links;
                List<Builder> list8 = builder.links;
                if (list7 == null ? list8 != null : !list7.equals(list8)) {
                    return false;
                }
                String str41 = this.imageUrl;
                String str42 = builder.imageUrl;
                if (str41 == null ? str42 != null : !str41.equals(str42)) {
                    return false;
                }
                Integer num9 = this.imageWidth;
                Integer num10 = builder.imageWidth;
                if (num9 == null ? num10 != null : !num9.equals(num10)) {
                    return false;
                }
                Integer num11 = this.imageHeight;
                Integer num12 = builder.imageHeight;
                if (num11 == null ? num12 != null : !num11.equals(num12)) {
                    return false;
                }
                String str43 = this.ticket_type_title;
                String str44 = builder.ticket_type_title;
                if (str43 == null ? str44 != null : !str43.equals(str44)) {
                    return false;
                }
                TicketType ticketType = this.ticket_type;
                TicketType ticketType2 = builder.ticket_type;
                if (ticketType == null ? ticketType2 != null : !ticketType.equals(ticketType2)) {
                    return false;
                }
                if (!Long.valueOf(this.ticket_type_id).equals(Long.valueOf(builder.ticket_type_id))) {
                    return false;
                }
                Builder builder2 = this.footerLink;
                Builder builder3 = builder.footerLink;
                if (builder2 != null) {
                    return builder2.equals(builder3);
                }
                if (builder3 == null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            String str = this.type;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.text;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.title;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.description;
            int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.linkType;
            int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.siteName;
            int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
            String str7 = this.articleId;
            int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
            Author author = this.author;
            int iHashCode8 = (iHashCode7 + (author != null ? author.hashCode() : 0)) * 31;
            Image image = this.image;
            int iHashCode9 = (iHashCode8 + (image != null ? image.hashCode() : 0)) * 31;
            Map<String, String> map = this.data;
            int iHashCode10 = (iHashCode9 + (map != null ? map.hashCode() : 0)) * 31;
            String str8 = this.language;
            int iHashCode11 = (iHashCode10 + (str8 != null ? str8.hashCode() : 0)) * 31;
            String str9 = this.url;
            int iHashCode12 = (iHashCode11 + (str9 != null ? str9.hashCode() : 0)) * 31;
            String str10 = this.thumbnailUrl;
            int iHashCode13 = (iHashCode12 + (str10 != null ? str10.hashCode() : 0)) * 31;
            String str11 = this.linkUrl;
            int iHashCode14 = (iHashCode13 + (str11 != null ? str11.hashCode() : 0)) * 31;
            String str12 = this.trackingUrl;
            int iHashCode15 = (iHashCode14 + (str12 != null ? str12.hashCode() : 0)) * 31;
            String str13 = this.fallbackUrl;
            int iHashCode16 = (iHashCode15 + (str13 != null ? str13.hashCode() : 0)) * 31;
            String str14 = this.username;
            int iHashCode17 = (iHashCode16 + (str14 != null ? str14.hashCode() : 0)) * 31;
            String str15 = this.provider;
            int iHashCode18 = (iHashCode17 + (str15 != null ? str15.hashCode() : 0)) * 31;
            String str16 = this.id;
            int iHashCode19 = (iHashCode18 + (str16 != null ? str16.hashCode() : 0)) * 31;
            String str17 = this.align;
            int iHashCode20 = (iHashCode19 + (str17 != null ? str17.hashCode() : 0)) * 31;
            Integer num = this.width;
            int iHashCode21 = (iHashCode20 + (num != null ? num.hashCode() : 0)) * 31;
            Integer num2 = this.height;
            int iHashCode22 = (iHashCode21 + (num2 != null ? num2.hashCode() : 0)) * 31;
            Long l = this.duration;
            int iHashCode23 = (iHashCode22 + (l != null ? l.hashCode() : 0)) * 31;
            String str18 = this.previewUrl;
            int iHashCode24 = (iHashCode23 + (str18 != null ? str18.hashCode() : 0)) * 31;
            String str19 = this.attribution;
            int iHashCode25 = (iHashCode24 + (str19 != null ? str19.hashCode() : 0)) * 31;
            List<BlockAttachment> list = this.attachments;
            int iHashCode26 = (iHashCode25 + (list != null ? list.hashCode() : 0)) * 31;
            List<String> list2 = this.items;
            int iHashCode27 = (iHashCode26 + (list2 != null ? list2.hashCode() : 0)) * 31;
            Integer num3 = this.rating_index;
            int iHashCode28 = (iHashCode27 + (num3 != null ? num3.hashCode() : 0)) * 31;
            Integer num4 = this.ratingIndex;
            int iHashCode29 = (iHashCode28 + (num4 != null ? num4.hashCode() : 0)) * 31;
            String str20 = this.remark;
            int iHashCode30 = (iHashCode29 + (str20 != null ? str20.hashCode() : 0)) * 31;
            List<ConversationRatingOption> list3 = this.options;
            int iHashCode31 = (iHashCode30 + (list3 != null ? list3.hashCode() : 0)) * 31;
            List<Builder> list4 = this.links;
            int iHashCode32 = (iHashCode31 + (list4 != null ? list4.hashCode() : 0)) * 31;
            Builder builder = this.footerLink;
            int iHashCode33 = (iHashCode32 + (builder != null ? builder.hashCode() : 0)) * 31;
            String str21 = this.imageUrl;
            int iHashCode34 = (iHashCode33 + (str21 != null ? str21.hashCode() : 0)) * 31;
            Integer num5 = this.imageWidth;
            int iHashCode35 = (iHashCode34 + (num5 != null ? num5.hashCode() : 0)) * 31;
            Integer num6 = this.imageHeight;
            int iHashCode36 = (iHashCode35 + (num6 != null ? num6.hashCode() : 0)) * 31;
            String str22 = this.ticket_type_title;
            int iHashCode37 = (iHashCode36 + (str22 != null ? str22.hashCode() : 0)) * 31;
            TicketType ticketType = this.ticket_type;
            int iHashCode38 = (iHashCode37 + (ticketType != null ? ticketType.hashCode() : 0)) * 31;
            long j = this.ticket_type_id;
            return iHashCode38 + ((int) (j ^ (j >>> 32)));
        }

        public Builder withAlign(String str) {
            this.align = str;
            return this;
        }

        public Builder withArticleId(String str) {
            this.articleId = str;
            return this;
        }

        public Builder withAttachments(List<BlockAttachment> list) {
            this.attachments = list;
            return this;
        }

        public Builder withAttribution(String str) {
            this.attribution = str;
            return this;
        }

        public Builder withAuthor(Author author) {
            this.author = author;
            return this;
        }

        public Builder withData(Map<String, String> map) {
            this.data = map;
            return this;
        }

        public Builder withDescription(String str) {
            this.description = str;
            return this;
        }

        public Builder withDuration(long j) {
            this.duration = Long.valueOf(j);
            return this;
        }

        public Builder withHeight(int i) {
            this.height = Integer.valueOf(i);
            return this;
        }

        public Builder withImage(Image image) {
            this.image = image;
            return this;
        }

        public Builder withImageHeight(int i) {
            this.imageHeight = Integer.valueOf(i);
            return this;
        }

        public Builder withImageUrl(String str) {
            this.imageUrl = str;
            return this;
        }

        public Builder withImageWidth(int i) {
            this.imageWidth = Integer.valueOf(i);
            return this;
        }

        public Builder withItems(List<String> list) {
            this.items = list;
            return this;
        }

        public Builder withLinkType(String str) {
            this.linkType = str;
            return this;
        }

        public Builder withLocalUri(Uri uri) {
            this.local_uri = uri;
            return this;
        }

        public Builder withOptions(List<ConversationRatingOption> list) {
            this.options = list;
            return this;
        }

        public Builder withPreviewUrl(String str) {
            this.previewUrl = str;
            return this;
        }

        public Builder withRatingIndex(Integer num) {
            this.ratingIndex = num;
            return this;
        }

        public Builder withRemark(String str) {
            this.remark = str;
            return this;
        }

        public Builder withSiteName(String str) {
            this.siteName = str;
            return this;
        }

        public Builder withText(String str) {
            this.text = str;
            return this;
        }

        public Builder withThumbnailUrl(String str) {
            this.thumbnailUrl = str;
            return this;
        }

        public Builder withTicketType(TicketType ticketType) {
            this.ticket_type = ticketType;
            return this;
        }

        public Builder withTicketTypeTitle(String str) {
            this.ticket_type_title = str;
            return this;
        }

        public Builder withTitle(String str) {
            this.title = str;
            return this;
        }

        public Builder withType(String str) {
            this.type = str;
            return this;
        }

        public Builder withUrl(String str) {
            this.url = str;
            return this;
        }

        public Builder withWidth(int i) {
            this.width = Integer.valueOf(i);
            return this;
        }
    }

    private Block(Builder builder) {
        this.type = BlockType.typeValueOf(builder.type);
        String str = builder.text;
        String str2 = BuildConfig.FLAVOR;
        this.text = str == null ? BuildConfig.FLAVOR : str;
        String str3 = builder.title;
        this.title = str3 == null ? BuildConfig.FLAVOR : str3;
        String str4 = builder.description;
        this.description = str4 == null ? BuildConfig.FLAVOR : str4;
        String str5 = builder.linkType;
        this.linkType = str5 == null ? BuildConfig.FLAVOR : str5;
        String str6 = builder.siteName;
        this.siteName = str6 == null ? BuildConfig.FLAVOR : str6;
        String str7 = builder.articleId;
        this.articleId = str7 == null ? BuildConfig.FLAVOR : str7;
        Author author = builder.author;
        this.author = author == null ? new Author() : author;
        Image image = builder.image;
        this.image = image == null ? new Image() : image;
        Map<String, String> map = builder.data;
        this.data = map == null ? Collections.EMPTY_MAP : map;
        String str8 = builder.language;
        this.language = str8 == null ? BuildConfig.FLAVOR : str8;
        String str9 = builder.url;
        this.url = str9 == null ? BuildConfig.FLAVOR : str9;
        String str10 = builder.thumbnailUrl;
        this.thumbnailUrl = str10 == null ? BuildConfig.FLAVOR : str10;
        String str11 = builder.linkUrl;
        this.linkUrl = str11 == null ? BuildConfig.FLAVOR : str11;
        String str12 = builder.trackingUrl;
        this.trackingUrl = str12 == null ? BuildConfig.FLAVOR : str12;
        String str13 = builder.fallbackUrl;
        this.fallbackUrl = str13 == null ? BuildConfig.FLAVOR : str13;
        String str14 = builder.username;
        this.username = str14 == null ? BuildConfig.FLAVOR : str14;
        String str15 = builder.provider;
        this.provider = str15 == null ? BuildConfig.FLAVOR : str15;
        String str16 = builder.id;
        this.id = str16 == null ? BuildConfig.FLAVOR : str16;
        this.align = BlockAlignment.alignValueOf(builder.align);
        Integer num = builder.width;
        this.width = num == null ? 0 : num.intValue();
        Integer num2 = builder.height;
        this.height = num2 == null ? 0 : num2.intValue();
        Long l = builder.duration;
        this.duration = l == null ? 0L : l.longValue();
        String str17 = builder.previewUrl;
        this.previewUrl = str17 == null ? BuildConfig.FLAVOR : str17;
        String str18 = builder.attribution;
        this.attribution = str18 == null ? BuildConfig.FLAVOR : str18;
        Uri uri = builder.local_uri;
        this.local_uri = uri == null ? Uri.EMPTY : uri;
        String str19 = builder.imageUrl;
        this.imageUrl = str19 == null ? BuildConfig.FLAVOR : str19;
        Integer num3 = builder.imageWidth;
        this.imageWidth = num3 == null ? 0 : num3.intValue();
        Integer num4 = builder.imageHeight;
        this.imageHeight = num4 != null ? num4.intValue() : 0;
        this.attachments = new ArrayList();
        List<BlockAttachment> list = builder.attachments;
        if (list != null) {
            for (BlockAttachment blockAttachment : list) {
                if (blockAttachment != null) {
                    this.attachments.add(blockAttachment);
                }
            }
        }
        this.items = new ArrayList();
        List<String> list2 = builder.items;
        if (list2 != null) {
            for (String str20 : list2) {
                if (str20 != null) {
                    this.items.add(str20);
                }
            }
        }
        Integer num5 = builder.ratingIndex;
        if (num5 != null) {
            this.ratingIndex = num5.intValue();
        } else {
            Integer num6 = builder.rating_index;
            if (num6 != null) {
                this.ratingIndex = num6.intValue();
            } else {
                this.ratingIndex = -1;
            }
        }
        String str21 = builder.remark;
        this.remark = str21 == null ? BuildConfig.FLAVOR : str21;
        this.options = new ArrayList();
        List<ConversationRatingOption> list3 = builder.options;
        if (list3 != null) {
            for (ConversationRatingOption conversationRatingOption : list3) {
                if (conversationRatingOption != null) {
                    this.options.add(conversationRatingOption);
                }
            }
        }
        this.links = new ArrayList();
        List<Builder> list4 = builder.links;
        if (list4 != null) {
            for (Builder builder2 : list4) {
                if (builder2 != null) {
                    this.links.add(Link.fromBlock(builder2.build()));
                }
            }
        }
        Builder builder3 = builder.footerLink;
        this.footerLink = builder3 == null ? new Link() : Link.fromBlock(builder3.build());
        String str22 = builder.ticket_type_title;
        this.ticket_type_title = str22 != null ? str22 : str2;
        TicketType ticketType = builder.ticket_type;
        this.ticket_type = ticketType == null ? TicketType.Companion.getNULL() : ticketType;
        this.ticketTypeId = builder.ticket_type_id;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Block block = (Block) obj;
            if (this.width != block.width || this.height != block.height || this.ratingIndex != block.ratingIndex) {
                return false;
            }
            List<BlockAttachment> list = this.attachments;
            List<BlockAttachment> list2 = block.attachments;
            if (list == null ? list2 != null : !list.equals(list2)) {
                return false;
            }
            List<String> list3 = this.items;
            List<String> list4 = block.items;
            if (list3 == null ? list4 != null : !list3.equals(list4)) {
                return false;
            }
            Map<String, String> map = this.data;
            Map<String, String> map2 = block.data;
            if (map == null ? map2 != null : !map.equals(map2)) {
                return false;
            }
            if (this.type != block.type || this.align != block.align) {
                return false;
            }
            Author author = this.author;
            Author author2 = block.author;
            if (author == null ? author2 != null : !author.equals(author2)) {
                return false;
            }
            Image image = this.image;
            Image image2 = block.image;
            if (image == null ? image2 != null : !image.equals(image2)) {
                return false;
            }
            String str = this.text;
            String str2 = block.text;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            String str3 = this.title;
            String str4 = block.title;
            if (str3 == null ? str4 != null : !str3.equals(str4)) {
                return false;
            }
            String str5 = this.description;
            String str6 = block.description;
            if (str5 == null ? str6 != null : !str5.equals(str6)) {
                return false;
            }
            String str7 = this.linkType;
            String str8 = block.linkType;
            if (str7 == null ? str8 != null : !str7.equals(str8)) {
                return false;
            }
            String str9 = this.siteName;
            String str10 = block.siteName;
            if (str9 == null ? str10 != null : !str9.equals(str10)) {
                return false;
            }
            String str11 = this.articleId;
            String str12 = block.articleId;
            if (str11 == null ? str12 != null : !str11.equals(str12)) {
                return false;
            }
            String str13 = this.language;
            String str14 = block.language;
            if (str13 == null ? str14 != null : !str13.equals(str14)) {
                return false;
            }
            String str15 = this.url;
            String str16 = block.url;
            if (str15 == null ? str16 != null : !str15.equals(str16)) {
                return false;
            }
            String str17 = this.thumbnailUrl;
            String str18 = block.thumbnailUrl;
            if (str17 == null ? str18 != null : !str17.equals(str18)) {
                return false;
            }
            String str19 = this.previewUrl;
            String str20 = block.previewUrl;
            if (str19 == null ? str20 != null : !str19.equals(str20)) {
                return false;
            }
            String str21 = this.attribution;
            String str22 = block.attribution;
            if (str21 == null ? str22 != null : !str21.equals(str22)) {
                return false;
            }
            String str23 = this.linkUrl;
            String str24 = block.linkUrl;
            if (str23 == null ? str24 != null : !str23.equals(str24)) {
                return false;
            }
            String str25 = this.trackingUrl;
            String str26 = block.trackingUrl;
            if (str25 == null ? str26 != null : !str25.equals(str26)) {
                return false;
            }
            String str27 = this.fallbackUrl;
            String str28 = block.fallbackUrl;
            if (str27 == null ? str28 != null : !str27.equals(str28)) {
                return false;
            }
            String str29 = this.username;
            String str30 = block.username;
            if (str29 == null ? str30 != null : !str29.equals(str30)) {
                return false;
            }
            String str31 = this.provider;
            String str32 = block.provider;
            if (str31 == null ? str32 != null : !str31.equals(str32)) {
                return false;
            }
            String str33 = this.id;
            String str34 = block.id;
            if (str33 == null ? str34 != null : !str33.equals(str34)) {
                return false;
            }
            String str35 = this.remark;
            String str36 = block.remark;
            if (str35 == null ? str36 != null : !str35.equals(str36)) {
                return false;
            }
            List<ConversationRatingOption> list5 = this.options;
            List<ConversationRatingOption> list6 = block.options;
            if (list5 == null ? list6 != null : !list5.equals(list6)) {
                return false;
            }
            List<Link> list7 = this.links;
            List<Link> list8 = block.links;
            if (list7 == null ? list8 != null : !list7.equals(list8)) {
                return false;
            }
            Uri uri = this.local_uri;
            Uri uri2 = block.local_uri;
            if (uri == null ? uri2 != null : !uri.equals(uri2)) {
                return false;
            }
            String str37 = this.imageUrl;
            String str38 = block.imageUrl;
            if (str37 == null ? str38 != null : !str37.equals(str38)) {
                return false;
            }
            if (this.imageWidth != block.imageWidth || this.imageHeight != block.imageHeight) {
                return false;
            }
            String str39 = this.ticket_type_title;
            String str40 = block.ticket_type_title;
            if (str39 == null ? str40 != null : !str39.equals(str40)) {
                return false;
            }
            TicketType ticketType = this.ticket_type;
            TicketType ticketType2 = block.ticket_type;
            if (ticketType == null ? ticketType2 != null : !ticketType.equals(ticketType2)) {
                return false;
            }
            Link link = this.footerLink;
            Link link2 = block.footerLink;
            if (link != null) {
                return link.equals(link2);
            }
            if (link2 == null) {
                return true;
            }
        }
        return false;
    }

    public BlockAlignment getAlign() {
        return this.align;
    }

    public String getArticleId() {
        return this.articleId;
    }

    public List<BlockAttachment> getAttachments() {
        return this.attachments;
    }

    public String getAttribution() {
        return this.attribution;
    }

    public Author getAuthor() {
        return this.author;
    }

    public Map<String, String> getData() {
        return this.data;
    }

    public String getDescription() {
        return this.description;
    }

    public String getFallbackUrl() {
        return this.fallbackUrl;
    }

    public Link getFooterLink() {
        return this.footerLink;
    }

    public int getHeight() {
        return this.height;
    }

    public String getId() {
        return this.id;
    }

    public Image getImage() {
        return this.image;
    }

    public int getImageHeight() {
        return this.imageHeight;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public int getImageWidth() {
        return this.imageWidth;
    }

    public List<String> getItems() {
        return this.items;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getLinkType() {
        return this.linkType;
    }

    public String getLinkUrl() {
        return this.linkUrl;
    }

    public List<Link> getLinks() {
        return this.links;
    }

    public Uri getLocalUri() {
        return this.local_uri;
    }

    public List<ConversationRatingOption> getOptions() {
        return this.options;
    }

    public String getPreviewUrl() {
        return this.previewUrl;
    }

    public String getProvider() {
        return this.provider;
    }

    public int getRatingIndex() {
        return this.ratingIndex;
    }

    public String getRemark() {
        return this.remark;
    }

    public String getSiteName() {
        return this.siteName;
    }

    public String getText() {
        return this.text;
    }

    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public TicketType getTicketType() {
        return this.ticket_type;
    }

    public long getTicketTypeId() {
        return this.ticketTypeId;
    }

    public String getTicketTypeTitle() {
        return this.ticket_type_title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTrackingUrl() {
        return this.trackingUrl;
    }

    public BlockType getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUsername() {
        return this.username;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        List<BlockAttachment> list = this.attachments;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.items;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        Map<String, String> map = this.data;
        int iHashCode3 = (iHashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        BlockType blockType = this.type;
        int iHashCode4 = (iHashCode3 + (blockType != null ? blockType.hashCode() : 0)) * 31;
        BlockAlignment blockAlignment = this.align;
        int iHashCode5 = (iHashCode4 + (blockAlignment != null ? blockAlignment.hashCode() : 0)) * 31;
        Author author = this.author;
        int iHashCode6 = (iHashCode5 + (author != null ? author.hashCode() : 0)) * 31;
        Image image = this.image;
        int iHashCode7 = (iHashCode6 + (image != null ? image.hashCode() : 0)) * 31;
        String str = this.text;
        int iHashCode8 = (iHashCode7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.title;
        int iHashCode9 = (iHashCode8 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.description;
        int iHashCode10 = (iHashCode9 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.linkType;
        int iHashCode11 = (iHashCode10 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.siteName;
        int iHashCode12 = (iHashCode11 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.articleId;
        int iHashCode13 = (iHashCode12 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.language;
        int iHashCode14 = (iHashCode13 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.url;
        int iHashCode15 = (iHashCode14 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.thumbnailUrl;
        int iHashCode16 = (iHashCode15 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.previewUrl;
        int iHashCode17 = (iHashCode16 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.attribution;
        int iHashCode18 = (iHashCode17 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.linkUrl;
        int iHashCode19 = (iHashCode18 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.trackingUrl;
        int iHashCode20 = (iHashCode19 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.fallbackUrl;
        int iHashCode21 = (iHashCode20 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.username;
        int iHashCode22 = (iHashCode21 + (str15 != null ? str15.hashCode() : 0)) * 31;
        String str16 = this.provider;
        int iHashCode23 = (iHashCode22 + (str16 != null ? str16.hashCode() : 0)) * 31;
        String str17 = this.id;
        int iHashCode24 = (((((((iHashCode23 + (str17 != null ? str17.hashCode() : 0)) * 31) + this.width) * 31) + this.height) * 31) + this.ratingIndex) * 31;
        String str18 = this.remark;
        int iHashCode25 = (iHashCode24 + (str18 != null ? str18.hashCode() : 0)) * 31;
        List<ConversationRatingOption> list3 = this.options;
        int iHashCode26 = (iHashCode25 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<Link> list4 = this.links;
        int iHashCode27 = (iHashCode26 + (list4 != null ? list4.hashCode() : 0)) * 31;
        Link link = this.footerLink;
        int iHashCode28 = (iHashCode27 + (link != null ? link.hashCode() : 0)) * 31;
        Uri uri = this.local_uri;
        int iHashCode29 = (iHashCode28 + (uri != null ? uri.hashCode() : 0)) * 31;
        String str19 = this.imageUrl;
        int iHashCode30 = (((((iHashCode29 + (str19 != null ? str19.hashCode() : 0)) * 31) + this.imageWidth) * 31) + this.imageHeight) * 31;
        String str20 = this.ticket_type_title;
        int iHashCode31 = (iHashCode30 + (str20 != null ? str20.hashCode() : 0)) * 31;
        TicketType ticketType = this.ticket_type;
        return iHashCode31 + (ticketType != null ? ticketType.hashCode() : 0);
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        int i = AnonymousClass2.$SwitchMap$io$intercom$android$sdk$blocks$lib$BlockType[this.type.ordinal()];
        if (i == 1) {
            builder.withText(this.text).withType(this.type.getSerializedName());
            return builder;
        }
        if (i == 2 || i == 3) {
            builder.withType(this.type.getSerializedName()).withUrl(this.url).withLocalUri(this.local_uri).withAttribution(this.attribution.isEmpty() ? null : this.attribution).withPreviewUrl(this.previewUrl.isEmpty() ? null : this.previewUrl).withHeight(this.height).withWidth(this.width);
            return builder;
        }
        if (i != 4) {
            return builder;
        }
        builder.withType(this.type.getSerializedName()).withAttachments(this.attachments);
        return builder;
    }

    public String toString() {
        return "Block{attachments=" + this.attachments + ", items=" + this.items + ", data=" + this.data + ", type=" + this.type + ", align=" + this.align + ", author=" + this.author + ", image=" + this.image + ", text='" + this.text + "', title='" + this.title + "', description='" + this.description + "', linkType='" + this.linkType + "', siteName='" + this.siteName + "', articleId='" + this.articleId + "', language='" + this.language + "', url='" + this.url + "', thumbnailUrl='" + this.thumbnailUrl + "', previewUrl='" + this.previewUrl + "', attribution='" + this.attribution + "', linkUrl='" + this.linkUrl + "', trackingUrl='" + this.trackingUrl + "', fallbackUrl='" + this.fallbackUrl + "', username='" + this.username + "', provider='" + this.provider + "', id='" + this.id + "', width=" + this.width + ", height=" + this.height + ", ratingIndex=" + this.ratingIndex + ", remark='" + this.remark + "', options=" + this.options + ", links=" + this.links + ", footerLink=" + this.footerLink + ", imageUrl=" + this.imageUrl + ", imageWidth=" + this.imageWidth + ", imageHeight=" + this.imageHeight + ", ticket_type_title=" + this.ticket_type_title + ", ticket_type=" + this.ticket_type + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.attachments);
        parcel.writeStringList(this.items);
        parcel.writeInt(this.data.size());
        for (Map.Entry<String, String> entry : this.data.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        BlockType blockType = this.type;
        parcel.writeInt(blockType == null ? -1 : blockType.ordinal());
        BlockAlignment blockAlignment = this.align;
        parcel.writeInt(blockAlignment != null ? blockAlignment.ordinal() : -1);
        parcel.writeParcelable(this.author, i);
        parcel.writeParcelable(this.image, i);
        parcel.writeString(this.text);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.linkType);
        parcel.writeString(this.siteName);
        parcel.writeString(this.articleId);
        parcel.writeString(this.language);
        parcel.writeString(this.url);
        parcel.writeString(this.thumbnailUrl);
        parcel.writeString(this.linkUrl);
        parcel.writeString(this.trackingUrl);
        parcel.writeString(this.fallbackUrl);
        parcel.writeString(this.username);
        parcel.writeString(this.provider);
        parcel.writeString(this.previewUrl);
        parcel.writeString(this.attribution);
        parcel.writeString(this.id);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeLong(this.duration);
        parcel.writeInt(this.ratingIndex);
        parcel.writeString(this.remark);
        parcel.writeTypedList(this.options);
        parcel.writeTypedList(this.links);
        parcel.writeParcelable(this.footerLink, i);
        parcel.writeParcelable(this.local_uri, i);
        parcel.writeString(this.imageUrl);
        parcel.writeInt(this.imageWidth);
        parcel.writeInt(this.imageHeight);
        parcel.writeString(this.ticket_type_title);
        parcel.writeParcelable(this.ticket_type, i);
    }

    public Block() {
        this(new Builder());
    }

    public Block(Parcel parcel) {
        this.attachments = parcel.createTypedArrayList(BlockAttachment.CREATOR);
        this.items = parcel.createStringArrayList();
        int i = parcel.readInt();
        this.data = new HashMap(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.data.put(parcel.readString(), parcel.readString());
        }
        int i3 = parcel.readInt();
        this.type = i3 == -1 ? null : BlockType.values()[i3];
        int i4 = parcel.readInt();
        this.align = i4 != -1 ? BlockAlignment.values()[i4] : null;
        this.author = (Author) parcel.readParcelable(Author.class.getClassLoader());
        this.image = (Image) parcel.readParcelable(Image.class.getClassLoader());
        this.text = parcel.readString();
        this.title = parcel.readString();
        this.description = parcel.readString();
        this.linkType = parcel.readString();
        this.siteName = parcel.readString();
        this.articleId = parcel.readString();
        this.language = parcel.readString();
        this.url = parcel.readString();
        this.thumbnailUrl = parcel.readString();
        this.linkUrl = parcel.readString();
        this.trackingUrl = parcel.readString();
        this.fallbackUrl = parcel.readString();
        this.username = parcel.readString();
        this.provider = parcel.readString();
        this.previewUrl = parcel.readString();
        this.attribution = parcel.readString();
        this.id = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.duration = parcel.readLong();
        this.ratingIndex = parcel.readInt();
        this.remark = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.options = arrayList;
        parcel.readList(arrayList, ConversationRatingOption.class.getClassLoader());
        ArrayList arrayList2 = new ArrayList();
        this.links = arrayList2;
        parcel.readList(arrayList2, Link.class.getClassLoader());
        this.footerLink = (Link) parcel.readParcelable(Link.class.getClassLoader());
        this.local_uri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.imageUrl = parcel.readString();
        this.imageWidth = parcel.readInt();
        this.imageHeight = parcel.readInt();
        this.ticket_type_title = parcel.readString();
        this.ticket_type = (TicketType) parcel.readParcelable(TicketType.class.getClassLoader());
    }
}
