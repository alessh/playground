/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.kinesis;

import com.amazonaws.services.kinesis.model.*;

/**
 * Abstract implementation of {@code AmazonKinesisAsync}. Convenient method
 * forms pass through to the corresponding overload that takes a request object
 * and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
public class AbstractAmazonKinesisAsync extends AbstractAmazonKinesis implements
        AmazonKinesisAsync {

    protected AbstractAmazonKinesisAsync() {
    }

    @Override
    public java.util.concurrent.Future<Void> addTagsToStreamAsync(
            AddTagsToStreamRequest request) {

        return addTagsToStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> addTagsToStreamAsync(
            AddTagsToStreamRequest request,
            com.amazonaws.handlers.AsyncHandler<AddTagsToStreamRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> createStreamAsync(
            CreateStreamRequest request) {

        return createStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> createStreamAsync(
            CreateStreamRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateStreamRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the CreateStream operation.
     *
     * @see #createStreamAsync(CreateStreamRequest)
     */
    @Override
    public java.util.concurrent.Future<Void> createStreamAsync(
            String streamName, Integer shardCount) {

        return createStreamAsync(new CreateStreamRequest().withStreamName(
                streamName).withShardCount(shardCount));
    }

    /**
     * Simplified method form for invoking the CreateStream operation with an
     * AsyncHandler.
     *
     * @see #createStreamAsync(CreateStreamRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<Void> createStreamAsync(
            String streamName,
            Integer shardCount,
            com.amazonaws.handlers.AsyncHandler<CreateStreamRequest, Void> asyncHandler) {

        return createStreamAsync(
                new CreateStreamRequest().withStreamName(streamName)
                        .withShardCount(shardCount), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<Void> decreaseStreamRetentionPeriodAsync(
            DecreaseStreamRetentionPeriodRequest request) {

        return decreaseStreamRetentionPeriodAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> decreaseStreamRetentionPeriodAsync(
            DecreaseStreamRetentionPeriodRequest request,
            com.amazonaws.handlers.AsyncHandler<DecreaseStreamRetentionPeriodRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteStreamAsync(
            DeleteStreamRequest request) {

        return deleteStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteStreamAsync(
            DeleteStreamRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteStreamRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DeleteStream operation.
     *
     * @see #deleteStreamAsync(DeleteStreamRequest)
     */
    @Override
    public java.util.concurrent.Future<Void> deleteStreamAsync(String streamName) {

        return deleteStreamAsync(new DeleteStreamRequest()
                .withStreamName(streamName));
    }

    /**
     * Simplified method form for invoking the DeleteStream operation with an
     * AsyncHandler.
     *
     * @see #deleteStreamAsync(DeleteStreamRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<Void> deleteStreamAsync(
            String streamName,
            com.amazonaws.handlers.AsyncHandler<DeleteStreamRequest, Void> asyncHandler) {

        return deleteStreamAsync(
                new DeleteStreamRequest().withStreamName(streamName),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(
            DescribeStreamRequest request) {

        return describeStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(
            DescribeStreamRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeStreamRequest, DescribeStreamResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeStream operation.
     *
     * @see #describeStreamAsync(DescribeStreamRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(
            String streamName) {

        return describeStreamAsync(new DescribeStreamRequest()
                .withStreamName(streamName));
    }

    /**
     * Simplified method form for invoking the DescribeStream operation with an
     * AsyncHandler.
     *
     * @see #describeStreamAsync(DescribeStreamRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(
            String streamName,
            com.amazonaws.handlers.AsyncHandler<DescribeStreamRequest, DescribeStreamResult> asyncHandler) {

        return describeStreamAsync(
                new DescribeStreamRequest().withStreamName(streamName),
                asyncHandler);
    }

    /**
     * Simplified method form for invoking the DescribeStream operation.
     *
     * @see #describeStreamAsync(DescribeStreamRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(
            String streamName, String exclusiveStartShardId) {

        return describeStreamAsync(new DescribeStreamRequest().withStreamName(
                streamName).withExclusiveStartShardId(exclusiveStartShardId));
    }

    /**
     * Simplified method form for invoking the DescribeStream operation with an
     * AsyncHandler.
     *
     * @see #describeStreamAsync(DescribeStreamRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(
            String streamName,
            String exclusiveStartShardId,
            com.amazonaws.handlers.AsyncHandler<DescribeStreamRequest, DescribeStreamResult> asyncHandler) {

        return describeStreamAsync(
                new DescribeStreamRequest().withStreamName(streamName)
                        .withExclusiveStartShardId(exclusiveStartShardId),
                asyncHandler);
    }

    /**
     * Simplified method form for invoking the DescribeStream operation.
     *
     * @see #describeStreamAsync(DescribeStreamRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(
            String streamName, Integer limit, String exclusiveStartShardId) {

        return describeStreamAsync(new DescribeStreamRequest()
                .withStreamName(streamName).withLimit(limit)
                .withExclusiveStartShardId(exclusiveStartShardId));
    }

    /**
     * Simplified method form for invoking the DescribeStream operation with an
     * AsyncHandler.
     *
     * @see #describeStreamAsync(DescribeStreamRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(
            String streamName,
            Integer limit,
            String exclusiveStartShardId,
            com.amazonaws.handlers.AsyncHandler<DescribeStreamRequest, DescribeStreamResult> asyncHandler) {

        return describeStreamAsync(
                new DescribeStreamRequest().withStreamName(streamName)
                        .withLimit(limit)
                        .withExclusiveStartShardId(exclusiveStartShardId),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetRecordsResult> getRecordsAsync(
            GetRecordsRequest request) {

        return getRecordsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRecordsResult> getRecordsAsync(
            GetRecordsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRecordsRequest, GetRecordsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetShardIteratorResult> getShardIteratorAsync(
            GetShardIteratorRequest request) {

        return getShardIteratorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetShardIteratorResult> getShardIteratorAsync(
            GetShardIteratorRequest request,
            com.amazonaws.handlers.AsyncHandler<GetShardIteratorRequest, GetShardIteratorResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the GetShardIterator operation.
     *
     * @see #getShardIteratorAsync(GetShardIteratorRequest)
     */
    @Override
    public java.util.concurrent.Future<GetShardIteratorResult> getShardIteratorAsync(
            String streamName, String shardId, String shardIteratorType) {

        return getShardIteratorAsync(new GetShardIteratorRequest()
                .withStreamName(streamName).withShardId(shardId)
                .withShardIteratorType(shardIteratorType));
    }

    /**
     * Simplified method form for invoking the GetShardIterator operation with
     * an AsyncHandler.
     *
     * @see #getShardIteratorAsync(GetShardIteratorRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<GetShardIteratorResult> getShardIteratorAsync(
            String streamName,
            String shardId,
            String shardIteratorType,
            com.amazonaws.handlers.AsyncHandler<GetShardIteratorRequest, GetShardIteratorResult> asyncHandler) {

        return getShardIteratorAsync(new GetShardIteratorRequest()
                .withStreamName(streamName).withShardId(shardId)
                .withShardIteratorType(shardIteratorType), asyncHandler);
    }

    /**
     * Simplified method form for invoking the GetShardIterator operation.
     *
     * @see #getShardIteratorAsync(GetShardIteratorRequest)
     */
    @Override
    public java.util.concurrent.Future<GetShardIteratorResult> getShardIteratorAsync(
            String streamName, String shardId, String shardIteratorType,
            String startingSequenceNumber) {

        return getShardIteratorAsync(new GetShardIteratorRequest()
                .withStreamName(streamName).withShardId(shardId)
                .withShardIteratorType(shardIteratorType)
                .withStartingSequenceNumber(startingSequenceNumber));
    }

    /**
     * Simplified method form for invoking the GetShardIterator operation with
     * an AsyncHandler.
     *
     * @see #getShardIteratorAsync(GetShardIteratorRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<GetShardIteratorResult> getShardIteratorAsync(
            String streamName,
            String shardId,
            String shardIteratorType,
            String startingSequenceNumber,
            com.amazonaws.handlers.AsyncHandler<GetShardIteratorRequest, GetShardIteratorResult> asyncHandler) {

        return getShardIteratorAsync(new GetShardIteratorRequest()
                .withStreamName(streamName).withShardId(shardId)
                .withShardIteratorType(shardIteratorType)
                .withStartingSequenceNumber(startingSequenceNumber),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<Void> increaseStreamRetentionPeriodAsync(
            IncreaseStreamRetentionPeriodRequest request) {

        return increaseStreamRetentionPeriodAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> increaseStreamRetentionPeriodAsync(
            IncreaseStreamRetentionPeriodRequest request,
            com.amazonaws.handlers.AsyncHandler<IncreaseStreamRetentionPeriodRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(
            ListStreamsRequest request) {

        return listStreamsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(
            ListStreamsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListStreamsRequest, ListStreamsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListStreams operation.
     *
     * @see #listStreamsAsync(ListStreamsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync() {

        return listStreamsAsync(new ListStreamsRequest());
    }

    /**
     * Simplified method form for invoking the ListStreams operation with an
     * AsyncHandler.
     *
     * @see #listStreamsAsync(ListStreamsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(
            com.amazonaws.handlers.AsyncHandler<ListStreamsRequest, ListStreamsResult> asyncHandler) {

        return listStreamsAsync(new ListStreamsRequest(), asyncHandler);
    }

    /**
     * Simplified method form for invoking the ListStreams operation.
     *
     * @see #listStreamsAsync(ListStreamsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(
            String exclusiveStartStreamName) {

        return listStreamsAsync(new ListStreamsRequest()
                .withExclusiveStartStreamName(exclusiveStartStreamName));
    }

    /**
     * Simplified method form for invoking the ListStreams operation with an
     * AsyncHandler.
     *
     * @see #listStreamsAsync(ListStreamsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(
            String exclusiveStartStreamName,
            com.amazonaws.handlers.AsyncHandler<ListStreamsRequest, ListStreamsResult> asyncHandler) {

        return listStreamsAsync(
                new ListStreamsRequest()
                        .withExclusiveStartStreamName(exclusiveStartStreamName),
                asyncHandler);
    }

    /**
     * Simplified method form for invoking the ListStreams operation.
     *
     * @see #listStreamsAsync(ListStreamsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(
            Integer limit, String exclusiveStartStreamName) {

        return listStreamsAsync(new ListStreamsRequest().withLimit(limit)
                .withExclusiveStartStreamName(exclusiveStartStreamName));
    }

    /**
     * Simplified method form for invoking the ListStreams operation with an
     * AsyncHandler.
     *
     * @see #listStreamsAsync(ListStreamsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(
            Integer limit,
            String exclusiveStartStreamName,
            com.amazonaws.handlers.AsyncHandler<ListStreamsRequest, ListStreamsResult> asyncHandler) {

        return listStreamsAsync(new ListStreamsRequest().withLimit(limit)
                .withExclusiveStartStreamName(exclusiveStartStreamName),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForStreamResult> listTagsForStreamAsync(
            ListTagsForStreamRequest request) {

        return listTagsForStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForStreamResult> listTagsForStreamAsync(
            ListTagsForStreamRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForStreamRequest, ListTagsForStreamResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> mergeShardsAsync(
            MergeShardsRequest request) {

        return mergeShardsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> mergeShardsAsync(
            MergeShardsRequest request,
            com.amazonaws.handlers.AsyncHandler<MergeShardsRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the MergeShards operation.
     *
     * @see #mergeShardsAsync(MergeShardsRequest)
     */
    @Override
    public java.util.concurrent.Future<Void> mergeShardsAsync(
            String streamName, String shardToMerge, String adjacentShardToMerge) {

        return mergeShardsAsync(new MergeShardsRequest()
                .withStreamName(streamName).withShardToMerge(shardToMerge)
                .withAdjacentShardToMerge(adjacentShardToMerge));
    }

    /**
     * Simplified method form for invoking the MergeShards operation with an
     * AsyncHandler.
     *
     * @see #mergeShardsAsync(MergeShardsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<Void> mergeShardsAsync(
            String streamName,
            String shardToMerge,
            String adjacentShardToMerge,
            com.amazonaws.handlers.AsyncHandler<MergeShardsRequest, Void> asyncHandler) {

        return mergeShardsAsync(
                new MergeShardsRequest().withStreamName(streamName)
                        .withShardToMerge(shardToMerge)
                        .withAdjacentShardToMerge(adjacentShardToMerge),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<PutRecordResult> putRecordAsync(
            PutRecordRequest request) {

        return putRecordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRecordResult> putRecordAsync(
            PutRecordRequest request,
            com.amazonaws.handlers.AsyncHandler<PutRecordRequest, PutRecordResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the PutRecord operation.
     *
     * @see #putRecordAsync(PutRecordRequest)
     */
    @Override
    public java.util.concurrent.Future<PutRecordResult> putRecordAsync(
            String streamName, java.nio.ByteBuffer data, String partitionKey) {

        return putRecordAsync(new PutRecordRequest().withStreamName(streamName)
                .withData(data).withPartitionKey(partitionKey));
    }

    /**
     * Simplified method form for invoking the PutRecord operation with an
     * AsyncHandler.
     *
     * @see #putRecordAsync(PutRecordRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<PutRecordResult> putRecordAsync(
            String streamName,
            java.nio.ByteBuffer data,
            String partitionKey,
            com.amazonaws.handlers.AsyncHandler<PutRecordRequest, PutRecordResult> asyncHandler) {

        return putRecordAsync(new PutRecordRequest().withStreamName(streamName)
                .withData(data).withPartitionKey(partitionKey), asyncHandler);
    }

    /**
     * Simplified method form for invoking the PutRecord operation.
     *
     * @see #putRecordAsync(PutRecordRequest)
     */
    @Override
    public java.util.concurrent.Future<PutRecordResult> putRecordAsync(
            String streamName, java.nio.ByteBuffer data, String partitionKey,
            String sequenceNumberForOrdering) {

        return putRecordAsync(new PutRecordRequest().withStreamName(streamName)
                .withData(data).withPartitionKey(partitionKey)
                .withSequenceNumberForOrdering(sequenceNumberForOrdering));
    }

    /**
     * Simplified method form for invoking the PutRecord operation with an
     * AsyncHandler.
     *
     * @see #putRecordAsync(PutRecordRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<PutRecordResult> putRecordAsync(
            String streamName,
            java.nio.ByteBuffer data,
            String partitionKey,
            String sequenceNumberForOrdering,
            com.amazonaws.handlers.AsyncHandler<PutRecordRequest, PutRecordResult> asyncHandler) {

        return putRecordAsync(new PutRecordRequest().withStreamName(streamName)
                .withData(data).withPartitionKey(partitionKey)
                .withSequenceNumberForOrdering(sequenceNumberForOrdering),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<PutRecordsResult> putRecordsAsync(
            PutRecordsRequest request) {

        return putRecordsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRecordsResult> putRecordsAsync(
            PutRecordsRequest request,
            com.amazonaws.handlers.AsyncHandler<PutRecordsRequest, PutRecordsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> removeTagsFromStreamAsync(
            RemoveTagsFromStreamRequest request) {

        return removeTagsFromStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> removeTagsFromStreamAsync(
            RemoveTagsFromStreamRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsFromStreamRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> splitShardAsync(
            SplitShardRequest request) {

        return splitShardAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> splitShardAsync(
            SplitShardRequest request,
            com.amazonaws.handlers.AsyncHandler<SplitShardRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the SplitShard operation.
     *
     * @see #splitShardAsync(SplitShardRequest)
     */
    @Override
    public java.util.concurrent.Future<Void> splitShardAsync(String streamName,
            String shardToSplit, String newStartingHashKey) {

        return splitShardAsync(new SplitShardRequest()
                .withStreamName(streamName).withShardToSplit(shardToSplit)
                .withNewStartingHashKey(newStartingHashKey));
    }

    /**
     * Simplified method form for invoking the SplitShard operation with an
     * AsyncHandler.
     *
     * @see #splitShardAsync(SplitShardRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<Void> splitShardAsync(
            String streamName,
            String shardToSplit,
            String newStartingHashKey,
            com.amazonaws.handlers.AsyncHandler<SplitShardRequest, Void> asyncHandler) {

        return splitShardAsync(
                new SplitShardRequest().withStreamName(streamName)
                        .withShardToSplit(shardToSplit)
                        .withNewStartingHashKey(newStartingHashKey),
                asyncHandler);
    }

}
