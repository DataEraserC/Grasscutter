// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ODKKCEJPMHB.proto

package emu.grasscutter.net.proto;

public final class ODKKCEJPMHBOuterClass {
    private ODKKCEJPMHBOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface ODKKCEJPMHBOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:ODKKCEJPMHB)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>.GCGGameBriefData PMOCGLCPCOB = 11;</code>
         *
         * @return Whether the pMOCGLCPCOB field is set.
         */
        boolean hasPMOCGLCPCOB();
        /**
         * <code>.GCGGameBriefData PMOCGLCPCOB = 11;</code>
         *
         * @return The pMOCGLCPCOB.
         */
        emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData getPMOCGLCPCOB();
        /** <code>.GCGGameBriefData PMOCGLCPCOB = 11;</code> */
        emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefDataOrBuilder
                getPMOCGLCPCOBOrBuilder();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 7635
     * </pre>
     *
     * Protobuf type {@code ODKKCEJPMHB}
     */
    public static final class ODKKCEJPMHB extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:ODKKCEJPMHB)
            ODKKCEJPMHBOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use ODKKCEJPMHB.newBuilder() to construct.
        private ODKKCEJPMHB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private ODKKCEJPMHB() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new ODKKCEJPMHB();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ODKKCEJPMHB(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 90:
                            {
                                emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData.Builder
                                        subBuilder = null;
                                if (pMOCGLCPCOB_ != null) {
                                    subBuilder = pMOCGLCPCOB_.toBuilder();
                                }
                                pMOCGLCPCOB_ =
                                        input.readMessage(
                                                emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData
                                                        .parser(),
                                                extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom(pMOCGLCPCOB_);
                                    pMOCGLCPCOB_ = subBuilder.buildPartial();
                                }

                                break;
                            }
                        default:
                            {
                                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.internal_static_ODKKCEJPMHB_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass
                    .internal_static_ODKKCEJPMHB_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB.class,
                            emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB.Builder.class);
        }

        public static final int PMOCGLCPCOB_FIELD_NUMBER = 11;
        private emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData pMOCGLCPCOB_;
        /**
         * <code>.GCGGameBriefData PMOCGLCPCOB = 11;</code>
         *
         * @return Whether the pMOCGLCPCOB field is set.
         */
        @java.lang.Override
        public boolean hasPMOCGLCPCOB() {
            return pMOCGLCPCOB_ != null;
        }
        /**
         * <code>.GCGGameBriefData PMOCGLCPCOB = 11;</code>
         *
         * @return The pMOCGLCPCOB.
         */
        @java.lang.Override
        public emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData getPMOCGLCPCOB() {
            return pMOCGLCPCOB_ == null
                    ? emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData
                            .getDefaultInstance()
                    : pMOCGLCPCOB_;
        }
        /** <code>.GCGGameBriefData PMOCGLCPCOB = 11;</code> */
        @java.lang.Override
        public emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefDataOrBuilder
                getPMOCGLCPCOBOrBuilder() {
            return getPMOCGLCPCOB();
        }

        private byte memoizedIsInitialized = -1;

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            if (pMOCGLCPCOB_ != null) {
                output.writeMessage(11, getPMOCGLCPCOB());
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (pMOCGLCPCOB_ != null) {
                size += com.google.protobuf.CodedOutputStream.computeMessageSize(11, getPMOCGLCPCOB());
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB other =
                    (emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB) obj;

            if (hasPMOCGLCPCOB() != other.hasPMOCGLCPCOB()) return false;
            if (hasPMOCGLCPCOB()) {
                if (!getPMOCGLCPCOB().equals(other.getPMOCGLCPCOB())) return false;
            }
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (hasPMOCGLCPCOB()) {
                hash = (37 * hash) + PMOCGLCPCOB_FIELD_NUMBER;
                hash = (53 * hash) + getPMOCGLCPCOB().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB parseDelimitedFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(
                emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         *
         *
         * <pre>
         * CmdId: 7635
         * </pre>
         *
         * Protobuf type {@code ODKKCEJPMHB}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:ODKKCEJPMHB)
                emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHBOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass
                        .internal_static_ODKKCEJPMHB_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass
                        .internal_static_ODKKCEJPMHB_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB.class,
                                emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB.Builder.class);
            }

            // Construct using emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                if (pMOCGLCPCOBBuilder_ == null) {
                    pMOCGLCPCOB_ = null;
                } else {
                    pMOCGLCPCOB_ = null;
                    pMOCGLCPCOBBuilder_ = null;
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass
                        .internal_static_ODKKCEJPMHB_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB build() {
                emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB buildPartial() {
                emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB result =
                        new emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB(this);
                if (pMOCGLCPCOBBuilder_ == null) {
                    result.pMOCGLCPCOB_ = pMOCGLCPCOB_;
                } else {
                    result.pMOCGLCPCOB_ = pMOCGLCPCOBBuilder_.build();
                }
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index,
                    java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB) {
                    return mergeFrom((emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB other) {
                if (other
                        == emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB.getDefaultInstance())
                    return this;
                if (other.hasPMOCGLCPCOB()) {
                    mergePMOCGLCPCOB(other.getPMOCGLCPCOB());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData pMOCGLCPCOB_;
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData,
                            emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData.Builder,
                            emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefDataOrBuilder>
                    pMOCGLCPCOBBuilder_;
            /**
             * <code>.GCGGameBriefData PMOCGLCPCOB = 11;</code>
             *
             * @return Whether the pMOCGLCPCOB field is set.
             */
            public boolean hasPMOCGLCPCOB() {
                return pMOCGLCPCOBBuilder_ != null || pMOCGLCPCOB_ != null;
            }
            /**
             * <code>.GCGGameBriefData PMOCGLCPCOB = 11;</code>
             *
             * @return The pMOCGLCPCOB.
             */
            public emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData
                    getPMOCGLCPCOB() {
                if (pMOCGLCPCOBBuilder_ == null) {
                    return pMOCGLCPCOB_ == null
                            ? emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData
                                    .getDefaultInstance()
                            : pMOCGLCPCOB_;
                } else {
                    return pMOCGLCPCOBBuilder_.getMessage();
                }
            }
            /** <code>.GCGGameBriefData PMOCGLCPCOB = 11;</code> */
            public Builder setPMOCGLCPCOB(
                    emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData value) {
                if (pMOCGLCPCOBBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    pMOCGLCPCOB_ = value;
                    onChanged();
                } else {
                    pMOCGLCPCOBBuilder_.setMessage(value);
                }

                return this;
            }
            /** <code>.GCGGameBriefData PMOCGLCPCOB = 11;</code> */
            public Builder setPMOCGLCPCOB(
                    emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData.Builder
                            builderForValue) {
                if (pMOCGLCPCOBBuilder_ == null) {
                    pMOCGLCPCOB_ = builderForValue.build();
                    onChanged();
                } else {
                    pMOCGLCPCOBBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /** <code>.GCGGameBriefData PMOCGLCPCOB = 11;</code> */
            public Builder mergePMOCGLCPCOB(
                    emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData value) {
                if (pMOCGLCPCOBBuilder_ == null) {
                    if (pMOCGLCPCOB_ != null) {
                        pMOCGLCPCOB_ =
                                emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData.newBuilder(
                                                pMOCGLCPCOB_)
                                        .mergeFrom(value)
                                        .buildPartial();
                    } else {
                        pMOCGLCPCOB_ = value;
                    }
                    onChanged();
                } else {
                    pMOCGLCPCOBBuilder_.mergeFrom(value);
                }

                return this;
            }
            /** <code>.GCGGameBriefData PMOCGLCPCOB = 11;</code> */
            public Builder clearPMOCGLCPCOB() {
                if (pMOCGLCPCOBBuilder_ == null) {
                    pMOCGLCPCOB_ = null;
                    onChanged();
                } else {
                    pMOCGLCPCOB_ = null;
                    pMOCGLCPCOBBuilder_ = null;
                }

                return this;
            }
            /** <code>.GCGGameBriefData PMOCGLCPCOB = 11;</code> */
            public emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData.Builder
                    getPMOCGLCPCOBBuilder() {

                onChanged();
                return getPMOCGLCPCOBFieldBuilder().getBuilder();
            }
            /** <code>.GCGGameBriefData PMOCGLCPCOB = 11;</code> */
            public emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefDataOrBuilder
                    getPMOCGLCPCOBOrBuilder() {
                if (pMOCGLCPCOBBuilder_ != null) {
                    return pMOCGLCPCOBBuilder_.getMessageOrBuilder();
                } else {
                    return pMOCGLCPCOB_ == null
                            ? emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData
                                    .getDefaultInstance()
                            : pMOCGLCPCOB_;
                }
            }
            /** <code>.GCGGameBriefData PMOCGLCPCOB = 11;</code> */
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData,
                            emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData.Builder,
                            emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefDataOrBuilder>
                    getPMOCGLCPCOBFieldBuilder() {
                if (pMOCGLCPCOBBuilder_ == null) {
                    pMOCGLCPCOBBuilder_ =
                            new com.google.protobuf.SingleFieldBuilderV3<
                                    emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData,
                                    emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData.Builder,
                                    emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefDataOrBuilder>(
                                    getPMOCGLCPCOB(), getParentForChildren(), isClean());
                    pMOCGLCPCOB_ = null;
                }
                return pMOCGLCPCOBBuilder_;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }

            // @@protoc_insertion_point(builder_scope:ODKKCEJPMHB)
        }

        // @@protoc_insertion_point(class_scope:ODKKCEJPMHB)
        private static final emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB();
        }

        public static emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<ODKKCEJPMHB> PARSER =
                new com.google.protobuf.AbstractParser<ODKKCEJPMHB>() {
                    @java.lang.Override
                    public ODKKCEJPMHB parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new ODKKCEJPMHB(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<ODKKCEJPMHB> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<ODKKCEJPMHB> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.ODKKCEJPMHBOuterClass.ODKKCEJPMHB getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_ODKKCEJPMHB_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_ODKKCEJPMHB_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\021ODKKCEJPMHB.proto\032\026GCGGameBriefData.pr"
                    + "oto\"5\n\013ODKKCEJPMHB\022&\n\013PMOCGLCPCOB\030\013 \001(\0132"
                    + "\021.GCGGameBriefDataB\033\n\031emu.grasscutter.ne"
                    + "t.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                            emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.getDescriptor(),
                        });
        internal_static_ODKKCEJPMHB_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ODKKCEJPMHB_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_ODKKCEJPMHB_descriptor,
                        new java.lang.String[] {
                            "PMOCGLCPCOB",
                        });
        emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}