let nums=[0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3;
let left = 0;
let right = 0;
let max = 0;
let count0 = 0;
console.log('total length ' + nums.length);
for(let i = 0; i < nums.length;i++) {
	if(nums[i] == 0) {
		count0++;
	}
	if(count0 <= k) {
		max = Math.max(max, right - left + 1);
		console.log(nums.slice(left, right));
		right++;
	} else {
		if(nums[left] == 0) {
			count0--;
		}
		left++;
	}
	console.log('left '+ left +' right '+right + '  count after loop '+i + '   ' + count0 + ' max '+max);
}
console.log(max);